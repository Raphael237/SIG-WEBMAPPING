package com.elecam.ELECAM.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Bureau_vote_local")
public class Bureau_vote_local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBureauLocal;

    @ManyToOne
    @JoinColumn(name = "id_arrondissement")
    private Arrondissement arrondissement;

    private String nom;
    private int nombreInscrits;

    public Bureau_vote_local(Long idBureauLocal, Arrondissement arrondissement, String nom, int nombreInscrits) {
        this.idBureauLocal = idBureauLocal;
        this.arrondissement = arrondissement;
        this.nom = nom;
        this.nombreInscrits = nombreInscrits;
    }

    public Long getIdBureauLocal() {
        return idBureauLocal;
    }

    public void setIdBureauLocal(Long idBureauLocal) {
        this.idBureauLocal = idBureauLocal;
    }

    public Arrondissement getArrondissement() {
        return arrondissement;
    }

    public void setArrondissement(Arrondissement arrondissement) {
        this.arrondissement = arrondissement;
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
        return "Bureau_vote_local{" +
                "idBureauLocal=" + idBureauLocal +
                ", arrondissement=" + arrondissement +
                ", nom='" + nom + '\'' +
                ", nombreInscrits=" + nombreInscrits +
                '}';
    }
}
