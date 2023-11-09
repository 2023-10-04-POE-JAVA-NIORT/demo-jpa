package com.demo.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.ArrayList;

public class PersonDAO {

    public static void save(Person personToSave) {

        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();

        tx.begin();
        entityManager.persist(personToSave);
        tx.commit();
    }

    public static Person findById(Long id){

        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        Person p = entityManager.find(Person.class, id);
        return p;
    }

}
