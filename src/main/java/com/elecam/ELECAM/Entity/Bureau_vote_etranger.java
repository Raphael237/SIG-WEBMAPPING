package com.elecam.ELECAM.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Bureau_vote_etranger")
public class Bureau_vote_etranger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBureauEtranger;
    private String nom;
    private int nombreInscrits;

    public Bureau_vote_etranger(Long idBureauEtranger, String nom, int nombreInscrits) {
        this.idBureauEtranger = idBureauEtranger;
        this.nom = nom;
        this.nombreInscrits = nombreInscrits;
    }

    public Long getIdBureauEtranger() {
        return idBureauEtranger;
    }

    public void setIdBureauEtranger(Long idBureauEtranger) {
        this.idBureauEtranger = idBureauEtranger;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreInscrits() {
        return nombreInscrits;
    }

    public void setNombreInscrits(int nombreInscrits) {
        this.nombreInscrits = nombreInscrits;
    }

    @Override
    public String toString() {
        return "Bureau_vote_etranger{" +
                "idBureauEtranger=" + idBureauEtranger +
                ", nom='" + nom + '\'' +
                ", nombreInscrits=" + nombreInscrits +
                '}';
    }
}
