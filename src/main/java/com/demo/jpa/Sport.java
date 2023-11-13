package com.demo.jpa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="sports")
public class Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String categorie;

    @ManyToMany
    private List<Person> sportifs = new ArrayList<>();


    public Sport() {
    }

    public Sport(String nom) {
        this.nom = nom;
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

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public List<Person> getSportifs() {
        return sportifs;
    }

    public void setSportifs(List<Person> sportifs) {
        this.sportifs = sportifs;
    }

    public void addSportif(Person p){
        sportifs.add(p);
    }

    @Override
    public String toString() {
        return "Sport{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", categorie='" + categorie + '\'' +
                '}';
    }
}
