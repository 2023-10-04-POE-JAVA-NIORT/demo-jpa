package com.demo.jpa;

import jakarta.persistence.*;

@Entity
@Table(name="voitures")
public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "marque")
    private String marque;
    @Column(name = "modele")
    private String modele;
    @Column(name="annee_fabrication")
    private Integer anneeFabrication;
    @Column(name = "immatriculation")
    private String immatriculation;
    @Column(name = "kilometrage")
    private Integer kilometrage;


    public Voiture() {
    }

    public Voiture(String marque, String modele, Integer anneeFabrication, String immatriculation, Integer kilometrage) {
        this.marque = marque;
        this.modele = modele;
        this.anneeFabrication = anneeFabrication;
        this.immatriculation = immatriculation;
        this.kilometrage = kilometrage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Integer getAnneeFabrication() {
        return anneeFabrication;
    }

    public void setAnneeFabrication(Integer anneeFabrication) {
        this.anneeFabrication = anneeFabrication;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public Integer getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(Integer kilometrage) {
        this.kilometrage = kilometrage;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", anneeFabrication=" + anneeFabrication +
                ", immatriculation='" + immatriculation + '\'' +
                ", kilometrage=" + kilometrage +
                '}';
    }
}
