package com.demo.jpa;

import jakarta.persistence.*;

import java.time.LocalDate;
/*
CREATE TABLE films (
    id SERIAL PRIMARY KEY,
    titre VARCHAR(150) NOT NULL,
    date_sortie DATE NOT NULL,
    interdit_aux_mineurs BOOLEAN NOT NULL,
    genre VARCHAR(50) NOT NULL
);
 */
@Entity
@Table(name="films")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
   private String titre;
    @Column(name="date_sortie")
   private LocalDate dateSortie;
    @Column(name="interdit_aux_mineurs")
   private boolean interditAuxMineurs;

    //@Enumerated(EnumType.ORDINAL)
   @Enumerated(EnumType.STRING)
   private Genre genre;


    public Film() {
    }

    public Film(String titre, LocalDate dateSortie, boolean interditAuxMineurs, Genre genre) {
        this.titre = titre;
        this.dateSortie = dateSortie;
        this.interditAuxMineurs = interditAuxMineurs;
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public LocalDate getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(LocalDate dateSortie) {
        this.dateSortie = dateSortie;
    }

    public boolean isInterditAuxMineurs() {
        return interditAuxMineurs;
    }

    public void setInterditAuxMineurs(boolean interditAuxMineurs) {
        this.interditAuxMineurs = interditAuxMineurs;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
