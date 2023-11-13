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
}
