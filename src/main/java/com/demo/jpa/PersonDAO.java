package com.demo.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

    // INSERT
    public static void save(Person personToSave) {

        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();

        tx.begin();
        entityManager.persist(personToSave);
        tx.commit();
    }

    // SELECT FROM WHERE
    public static Person findById(Long id){

        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        Person p = entityManager.find(Person.class, id);
        return p;
    }

    // SELECT FROM
    public static List<Person> findAll(){
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        Query findAllQuery = entityManager.createQuery("SELECT p FROM Person p");
        List<Person> persons = findAllQuery.getResultList();
        return persons;
    }

    // DELETE WHERE
    public static void delete(Person personToDelete){
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.remove(personToDelete);
        tx.commit();
    }

    public static void deleteById(Long id){
        Person personToDelete = findById(id);
        delete(personToDelete);
    }

    // DELETE FROM person p WHERE p.id=4;
    public static void deleteById_v2(Long id){
        EntityManager entityManager = EntityManagerSingleton.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();

        tx.begin();
        Query deleteQuery = entityManager.createQuery("DELETE FROM Person p WHERE p.id= :id");
        deleteQuery.setParameter("id", id);
        deleteQuery.executeUpdate();
        tx.commit();

    }


}
