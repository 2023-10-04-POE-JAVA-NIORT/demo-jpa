package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import com.demo.jpa.Produit;
import com.demo.jpa.ProduitDAO;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class ProduitTest
{

    @Test
    void createProduit(){
        Produit nouveauProduit = new Produit("macbook", "blabla", 900, 5,
                LocalDate.of(2023, 2, 25), 1000, "Apple");

        ProduitDAO.save(nouveauProduit);
        // à partir de maintenant mon objet nouveauProduit contient la valeur de l'id
        // car Hibernate le remplit automatiquement

        assertNotNull(ProduitDAO.findById(nouveauProduit.getId()));
    }

    @Test
    void findById(){
        Produit p = ProduitDAO.findById(1L);
        assertNotNull(p);
    }

    @Test
    void findAll(){
        List<Produit> produits = ProduitDAO.findAll();
        assertNotNull(produits);
        for (Produit p : produits){
            System.out.println(p);
        }
    }

    @Test
    void delete(){
        ProduitDAO.deleteById(1L);
        assertNull(ProduitDAO.findById(1L));
    }

}
