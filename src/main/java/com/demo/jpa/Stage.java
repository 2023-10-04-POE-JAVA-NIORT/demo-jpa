package com.demo.jpa;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="stages")
public class Stage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String description;
    private LocalDateTime horaire;

    @ManyToMany
    private List<Person> stagiaires = new ArrayList<>();


    public Stage() {
    }

    public Stage(String titre, String description, LocalDateTime horaire) {
        this.titre = titre;
        this.description = description;
        this.horaire = horaire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getHoraire() {
        return horaire;
    }

    public void setHoraire(LocalDateTime horaire) {
        this.horaire = horaire;
    }

    public List<Person> getStagiaires() {
        return stagiaires;
    }

    public void setStagiaires(List<Person> stagiaires) {
        this.stagiaires = stagiaires;
    }

    public void addStagiaire(Person p){
        stagiaires.add(p);
    }

    @Override
    public String toString() {
        return "Stage{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", horaire=" + horaire +
                ", stagiaires=" + stagiaires +
                '}';
    }
}
