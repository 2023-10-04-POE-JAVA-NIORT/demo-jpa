package com.demo;

import com.demo.jpa.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AddressTest
{
    @Test
    void testAddress(){
        Address address1 = new Address("rue du centre", 33, "Marseille");
        AddressDAO.save(address1);

        Person alain = new Person("Alain", "Dominguez");
        alain.setAddress(address1);
        PersonDAO.save(alain);

    }

    @Test
    void testAddressLecture(){
        Person alain = PersonDAO.findById(1L);
        System.out.println(alain);
    }

    @Test
    void testAddresse2(){
        Address a = AddressDAO.findById(1L);

        Person marie = new Person("Marie", "Dominguez");
        marie.setAddress(a);
        PersonDAO.save(marie);
    }

    @Test
    void testStages(){
        Person steve = new Person("Steve", "Jackson");
        PersonDAO.save(steve);

        Stage salsa = new Stage("Stage de Salsa", "pour débutants", LocalDateTime.of(2023, 12, 12, 9, 0));
        salsa.addStagiaire(steve);
        salsa.addStagiaire(PersonDAO.findById(2L));
        StageDAO.save(salsa);
    }

    @Test
    void testAjoutStage(){
        Stage java = new Stage("Java pour les nuls", "pour débutants", LocalDateTime.of(2023, 12, 13, 9, 0));
        java.addStagiaire(PersonDAO.findById(2L));
        java.addStagiaire(PersonDAO.findById(3L));
        StageDAO.save(java);
    }

    @Test
    void lireStage(){
        Stage salsa = StageDAO.findById(1L);
        System.out.println(salsa);
    }
}
