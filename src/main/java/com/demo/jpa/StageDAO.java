package com.demo.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

import java.util.List;

public class StageDAO {

    private static EntityManager entityManager =
            EntityManagerSingleton.getEntityManager("demojpa");
    private static EntityTransaction tx = entityManager.getTransaction();

    // INSERT
    public static void save(Stage a) {
        tx.begin();
        entityManager.persist(a);
        tx.commit();
    }

    // SELECT FROM WHERE
    public static Stage findById(Long id){
        return entityManager.find(Stage.class, id);
    }

    // SELECT FROM
    public static List<Stage> findAll(){
        Query findAllQuery = entityManager.createQuery("SELECT a FROM Stage a");
        return findAllQuery.getResultList();
    }

    // DELETE WHERE
    public static void delete(Stage a){
        tx.begin();
        entityManager.remove(a);
        tx.commit();
    }

    public static void deleteById(Long id){
        delete(findById(id));
    }

    // DELETE FROM person p WHERE p.id=4;
    public static void deleteById_v2(Long id){
        tx.begin();
        Query deleteQuery = entityManager.createQuery("DELETE FROM Stage p WHERE p.id= :id");
        deleteQuery.setParameter("id", id);
        deleteQuery.executeUpdate();
        tx.commit();
    }

    // UPDATE
    public static void update(Long id, Stage a){

        Stage fromDatabase = findById(id);
        //fromDatabase.setNotNull(a);

        tx.begin();
        entityManager.merge(fromDatabase);
        tx.commit();
    }
}
