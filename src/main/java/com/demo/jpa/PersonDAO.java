package com.demo.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

import java.util.ArrayList;
import java.util.List;

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

    public static List<Person> findAll(){
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        Query findAllQuery = entityManager.createQuery("SELECT p FROM Person p");
        List<Person> persons = findAllQuery.getResultList();
        return persons;
    }

}
