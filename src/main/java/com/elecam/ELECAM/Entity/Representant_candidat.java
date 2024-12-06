package com.elecam.ELECAM.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Representant_candidat")
public class Representant_candidat {

    @Id
    private Long idRepresentant;

    @ManyToOne
    @JoinColumn(name = "id_bureau_local", nullable = true)
    private Bureau_vote_local bureau_vote_local;

    public Representant_candidat(Long idRepresentant, Bureau_vote_local bureau_vote_local) {
        this.idRepresentant = idRepresentant;
        this.bureau_vote_local = bureau_vote_local;
    }

    public Long getIdRepresentant() {
        return idRepresentant;
    }

    public void setIdRepresentant(Long idRepresentant) {
        this.idRepresentant = idRepresentant;
    }

    public Bureau_vote_local getBureau_vote_local() {
        return bureau_vote_local;
    }

    public void setBureau_vote_local(Bureau_vote_local bureau_vote_local) {
        this.bureau_vote_local = bureau_vote_local;
    }

    @Override
    public String toString() {
        return "Representant_candidat{" +
                "idRepresentant=" + idRepresentant +
                ", bureau_vote_local=" + bureau_vote_local +
                '}';
    }
}
