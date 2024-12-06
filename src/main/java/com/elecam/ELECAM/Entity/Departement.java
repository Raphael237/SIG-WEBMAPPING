package com.elecam.ELECAM.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Departement")
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDepartement;

    @ManyToOne
    @JoinColumn(name = "id_region")
    private Region region;

    private String nom;

    @OneToMany(mappedBy = "departement")
    private List<Arrondissement> arrondissements;

    public Departement(Long idDepartement, Region region, String nom, List<Arrondissement> arrondissements) {
        this.idDepartement = idDepartement;
        this.region = region;
        this.nom = nom;
        this.arrondissements = arrondissements;
    }

    public Long getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(Long idDepartement) {
        this.idDepartement = idDepartement;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Arrondissement> getArrondissements() {
        return arrondissements;
    }

    public void setArrondissements(List<Arrondissement> arrondissements) {
        this.arrondissements = arrondissements;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "idDepartement=" + idDepartement +
                ", region=" + region +
                ", nom='" + nom + '\'' +
                ", arrondissements=" + arrondissements +
                '}';
    }
}
