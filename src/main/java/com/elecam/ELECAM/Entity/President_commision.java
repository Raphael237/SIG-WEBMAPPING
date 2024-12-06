package com.elecam.ELECAM.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "President_commision")
public class President_commision {
    @Id
    private Long idPresident;

    @ManyToOne
    @JoinColumn(name = "id_bureau_local", nullable = true)
    private Bureau_vote_local bureauVoteLocal;

    public President_commision(Long idPresident, Bureau_vote_local bureauVoteLocal) {
        this.idPresident = idPresident;
        this.bureauVoteLocal = bureauVoteLocal;
    }

    public Long getIdPresident() {
        return idPresident;
    }

    public void setIdPresident(Long idPresident) {
        this.idPresident = idPresident;
    }

    public Bureau_vote_local getBureauVoteLocal() {
        return bureauVoteLocal;
    }

    public void setBureauVoteLocal(Bureau_vote_local bureauVoteLocal) {
        this.bureauVoteLocal = bureauVoteLocal;
    }

    @Override
    public String toString() {
        return "President_commision{" +
                "idPresident=" + idPresident +
                ", bureauVoteLocal=" + bureauVoteLocal +
                '}';
    }
}
