package com.demo.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

import java.util.List;

public class VoitureDAO {

    private static EntityManager entityManager =
            EntityManagerSingleton.getEntityManager("demojpa");
    private static EntityTransaction tx = entityManager.getTransaction();

    // INSERT
    public static void save(Voiture v) {
        tx.begin();
        entityManager.persist(v);
        tx.commit();
    }

    // SELECT FROM WHERE
    public static Voiture findById(Long id){
        return entityManager.find(Voiture.class, id);
    }

    // SELECT FROM
    public static List<Voiture> findAll(){
        Query findAllQuery = entityManager.createQuery("SELECT v FROM Voiture v");
        return findAllQuery.getResultList();
    }

    // DELETE WHERE
    public static void delete(Voiture p){
        tx.begin();
        entityManager.remove(p);
        tx.commit();
    }

    public static void deleteById(Long id){
        delete(findById(id));
    }

    // DELETE FROM person p WHERE p.id=4;
    public static void deleteById_v2(Long id){
        tx.begin();
        Query deleteQuery = entityManager
                .createQuery("DELETE FROM Voiture v WHERE v.id= :id");
        deleteQuery.setParameter("id", id);
        deleteQuery.executeUpdate();
        tx.commit();
    }
}
