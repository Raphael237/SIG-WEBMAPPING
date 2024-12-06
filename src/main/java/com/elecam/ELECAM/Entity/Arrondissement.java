package com.elecam.ELECAM.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Arrondissement")
public class Arrondissement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArrondissement;

    @ManyToOne
    @JoinColumn(name = "id_departement")
    private Departement departement;

    private String nom;

    @OneToMany(mappedBy = "arrondissement")
    private List<Bureau_vote_local> bureaux_vote_local;

    public Arrondissement(Long idArrondissement, Departement departement, String nom, List<Bureau_vote_local> bureaux_vote_local) {
        this.idArrondissement = idArrondissement;
        this.departement = departement;
        this.nom = nom;
        this.bureaux_vote_local = bureaux_vote_local;
    }

    public Long getIdArrondissement() {
        return idArrondissement;
    }

    public void setIdArrondissement(Long idArrondissement) {
        this.idArrondissement = idArrondissement;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Bureau_vote_local> getBureaux_vote_local() {
        return bureaux_vote_local;
    }

    public void setBureaux_vote_local(List<Bureau_vote_local> bureaux_vote_local) {
        this.bureaux_vote_local = bureaux_vote_local;
    }

    @Override
    public String toString() {
        return "Arrondissement{" +
                "idArrondissement=" + idArrondissement +
                ", departement=" + departement +
                ", nom='" + nom + '\'' +
                ", bureaux_vote_local=" + bureaux_vote_local +
                '}';
    }
}
