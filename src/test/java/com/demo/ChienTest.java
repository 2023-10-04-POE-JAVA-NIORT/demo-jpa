package com.demo;

import com.demo.jpa.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class ChienTest
{
    @Test
    void testCreationChienAvecPersonneExistante(){

        Chien medor = new Chien("Medor",5, "Berger allemand" );
        medor.setMaitre(PersonDAO.findById(1L));
        ChienDAO.save(medor);
    }

    @Test
    void testCreationChienAvecPersonneNonExistante(){
        // ça marche en mode CASCADE : voir entity Chien
        Person moi = new Person("JC", "Dominguez");
        Chien medor = new Chien("Medor",5, "Berger allemand" );
        medor.setMaitre(moi);
        ChienDAO.save(medor);
    }

    @Test
    void testSuppressionChienEnModeCascade(){
        Chien chien = ChienDAO.findById(4L);
        ChienDAO.delete(chien);
    }

    @Test
    void creationChienSansMaitre(){
        Chien medor = new Chien("Medor",5, "Berger allemand" );
        ChienDAO.save(medor);
    }

    @Test
    void testChienSansMaitre(){
        Chien chien = ChienDAO.findById(6L);
        chien.setMaitre(PersonDAO.findById(1L));
        ChienDAO.update(6L, chien);
        System.out.println(chien);
    }
}
