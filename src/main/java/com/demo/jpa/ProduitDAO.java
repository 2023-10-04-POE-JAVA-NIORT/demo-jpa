package com.demo.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

import java.util.List;

public class ProduitDAO {

    private static EntityManager entityManager =
            EntityManagerSingleton.getEntityManager("tpstockproduit");
    private static EntityTransaction tx = entityManager.getTransaction();

    // INSERT
    public static void save(Produit p) {
        tx.begin();
        entityManager.persist(p);
        tx.commit();
    }

    // SELECT FROM WHERE
    public static Produit findById(Long id){
        return entityManager.find(Produit.class, id);
    }

    // SELECT FROM
    public static List<Produit> findAll(){
        Query findAllQuery = entityManager.createQuery("SELECT p FROM Produit p");
        return findAllQuery.getResultList();
    }

    // DELETE WHERE
    public static void delete(Produit p){
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
                .createQuery("DELETE FROM Produit p WHERE p.id= :id");
        deleteQuery.setParameter("id", id);
        deleteQuery.executeUpdate();
        tx.commit();
    }
}
