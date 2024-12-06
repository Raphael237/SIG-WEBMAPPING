package com.elecam.ELECAM.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Membre_commision")
public class Membre_commision {

    @Id
    private Long idMembre;

    @ManyToOne
    @JoinColumn(name = "id_bureau_local", nullable = true)
    private Bureau_vote_local bureau_vote_local;

    public Membre_commision(Long idMembre, Bureau_vote_local bureau_vote_local) {
        this.idMembre = idMembre;
        this.bureau_vote_local = bureau_vote_local;
    }

    public Long getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(Long idMembre) {
        this.idMembre = idMembre;
    }

    public Bureau_vote_local getBureau_vote_local() {
        return bureau_vote_local;
    }

    public void setBureau_vote_local(Bureau_vote_local bureau_vote_local) {
        this.bureau_vote_local = bureau_vote_local;
    }

    @Override
    public String toString() {
        return "Membre_commision{" +
                "idMembre=" + idMembre +
                ", bureau_vote_local=" + bureau_vote_local +
                '}';
    }
}
