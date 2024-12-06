package com.elecam.ELECAM.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Region")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRegion;
    private String nom;

    @OneToMany(mappedBy = "region")
    private List<Departement> departements;

    public Region(Long idRegion, String nom, List<Departement> departements) {
        this.idRegion = idRegion;
        this.nom = nom;
        this.departements = departements;
    }

    public Long getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(Long idRegion) {
        this.idRegion = idRegion;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Departement> getDepartements() {
        return departements;
    }

    public void setDepartements(List<Departement> departements) {
        this.departements = departements;
    }

    @Override
    public String toString() {
        return "Region{" +
                "idRegion=" + idRegion +
                ", nom='" + nom + '\'' +
                ", departements=" + departements +
                '}';
    }
}
