package com.demo.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String description;
    private int prix;
    private int quantiteEnStock;
    private LocalDate dateDerniereCommande;
    private LocalDate dateDerniereMiseJourFiche;
    private int poids;
    private String fournisseur;
    private boolean disponible;

    public Produit() {
        this.disponible = true;
        this.dateDerniereMiseJourFiche = LocalDate.now();
    }

    public Produit(String nom, String description, int prix, int quantiteEnStock, LocalDate dateDerniereCommande, int poids, String fournisseur) {
        this();

        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantiteEnStock = quantiteEnStock;
        this.dateDerniereCommande = dateDerniereCommande;
        this.poids = poids;
        this.fournisseur = fournisseur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }

    public void setQuantiteEnStock(int quantiteEnStock) {
        this.quantiteEnStock = quantiteEnStock;
    }

    public LocalDate getDateDerniereCommande() {
        return dateDerniereCommande;
    }

    public void setDateDerniereCommande(LocalDate dateDerniereCommande) {
        this.dateDerniereCommande = dateDerniereCommande;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public String getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(String fournisseur) {
        this.fournisseur = fournisseur;
    }

    public LocalDate getDateDerniereMiseJourFiche() {
        return dateDerniereMiseJourFiche;
    }

    public void setDateDerniereMiseJourFiche(LocalDate dateDerniereMiseJourFiche) {
        this.dateDerniereMiseJourFiche = dateDerniereMiseJourFiche;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                ", quantiteEnStock=" + quantiteEnStock +
                ", dateDerniereCommande=" + dateDerniereCommande +
                ", poids=" + poids +
                ", fournisseur='" + fournisseur + '\'' +
                '}';
    }
}
