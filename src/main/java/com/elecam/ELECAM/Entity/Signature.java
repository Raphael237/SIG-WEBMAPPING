package com.elecam.ELECAM.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Signature")
public class Signature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSignature;

    @ManyToOne
    @JoinColumn(name = "id_resultat")
    private Resultat resultat;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private Utilisateur utilisateur;

    private String dateSignature;

    public Signature(Long idSignature, Resultat resultat, Utilisateur utilisateur, String dateSignature) {
        this.idSignature = idSignature;
        this.resultat = resultat;
        this.utilisateur = utilisateur;
        this.dateSignature = dateSignature;
    }

    public Long getIdSignature() {
        return idSignature;
    }

    public void setIdSignature(Long idSignature) {
        this.idSignature = idSignature;
    }

    public Resultat getResultat() {
        return resultat;
    }

    public void setResultat(Resultat resultat) {
        this.resultat = resultat;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getDateSignature() {
        return dateSignature;
    }

    public void setDateSignature(String dateSignature) {
        this.dateSignature = dateSignature;
    }

    @Override
    public String toString() {
        return "Signature{" +
                "idSignature=" + idSignature +
                ", resultat=" + resultat +
                ", utilisateur=" + utilisateur +
                ", dateSignature='" + dateSignature + '\'' +
                '}';
    }
}
