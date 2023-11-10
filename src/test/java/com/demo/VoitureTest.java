package com.demo;

import com.demo.jpa.Produit;
import com.demo.jpa.ProduitDAO;
import com.demo.jpa.Voiture;
import com.demo.jpa.VoitureDAO;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class VoitureTest
{

    @Test
    void createVoiture(){
        Voiture v = new Voiture("Opel", "Classe A"
                , 2022, "AZ-4567-34", 2000);
        VoitureDAO.save(v);
    }

    @Test
    void findById(){
        Voiture v = VoitureDAO.findById(1L);
        assertNotNull(v);
        System.out.println(v);
    }

    @Test
    void findAll(){
        List<Voiture> voitures = VoitureDAO.findAll();
        assertNotNull(voitures);
        for (Voiture v : voitures){
            System.out.println(v);
        }
        assertTrue(voitures.size() > 0);
    }

    @Test
    void delete(){
        VoitureDAO.deleteById(1L);
        assertNull(VoitureDAO.findById(1L));
    }

}
