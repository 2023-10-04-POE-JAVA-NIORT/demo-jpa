package com.demo.jpa;

import jakarta.persistence.*;

@Entity
@Table(name="chiens")
public class Chien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private int age;
    private String race;

    @ManyToOne
    private Person maitre;


    public Chien() {
    }

    public Chien(String nom, int age, String race) {
        this.nom = nom;
        this.age = age;
        this.race = race;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Person getMaitre() {
        return maitre;
    }

    public void setMaitre(Person maitre) {
        this.maitre = maitre;
    }

    @Override
    public String toString() {
        return "Chien{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                ", race='" + race + '\'' +
                ", maitre=" + maitre +
                '}';
    }
}
