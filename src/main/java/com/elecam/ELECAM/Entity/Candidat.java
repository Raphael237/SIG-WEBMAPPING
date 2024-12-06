package com.elecam.ELECAM.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Candidat")
public class Candidat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCandidat;

    private String nom;
    private String partiPolitique;
    private String couleur;

    public Candidat(Long idCandidat, String nom, String partiPolitique, String couleur) {
        this.idCandidat = idCandidat;
        this.nom = nom;
        this.partiPolitique = partiPolitique;
        this.couleur = couleur;
    }

    public Long getIdCandidat() {
        return idCandidat;
    }

    public void setIdCandidat(Long idCandidat) {
        this.idCandidat = idCandidat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPartiPolitique() {
        return partiPolitique;
    }

    public void setPartiPolitique(String partiPolitique) {
        this.partiPolitique = partiPolitique;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Candidat{" +
                "idCandidat=" + idCandidat +
                ", nom='" + nom + '\'' +
                ", partiPolitique='" + partiPolitique + '\'' +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
