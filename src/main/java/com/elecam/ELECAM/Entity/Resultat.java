package com.elecam.ELECAM.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Resultat")
public class Resultat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idResultat;

    @ManyToOne
    @JoinColumn(name = "id_bureau_local", nullable = true)
    private Bureau_vote_local bureau_vote_local;

    @ManyToOne
    @JoinColumn(name = "id_bureau_etranger", nullable = true)
    private Bureau_vote_etranger bureau_vote_etranger;

    @ManyToOne
    @JoinColumn(name = "id_candidat")
    private Candidat candidat;

    private int nombreVoix;

    public Resultat(Long idResultat, Bureau_vote_local bureau_vote_local, Bureau_vote_etranger bureau_vote_etranger, Candidat candidat, int nombreVoix) {
        this.idResultat = idResultat;
        this.bureau_vote_local = bureau_vote_local;
        this.bureau_vote_etranger = bureau_vote_etranger;
        this.candidat = candidat;
        this.nombreVoix = nombreVoix;
    }

    public Long getIdResultat() {
        return idResultat;
    }

    public void setIdResultat(Long idResultat) {
        this.idResultat = idResultat;
    }

    public Bureau_vote_local getBureau_vote_local() {
        return bureau_vote_local;
    }

    public void setBureau_vote_local(Bureau_vote_local bureau_vote_local) {
        this.bureau_vote_local = bureau_vote_local;
    }

    public Bureau_vote_etranger getBureau_vote_etranger() {
        return bureau_vote_etranger;
    }

    public void setBureau_vote_etranger(Bureau_vote_etranger bureau_vote_etranger) {
        this.bureau_vote_etranger = bureau_vote_etranger;
    }

    public Candidat getCandidat() {
        return candidat;
    }

    public void setCandidat(Candidat candidat) {
        this.candidat = candidat;
    }

    public int getNombreVoix() {
        return nombreVoix;
    }

    public void setNombreVoix(int nombreVoix) {
        this.nombreVoix = nombreVoix;
    }

    @Override
    public String toString() {
        return "Resultat{" +
                "idResultat=" + idResultat +
                ", bureau_vote_local=" + bureau_vote_local +
                ", bureau_vote_etranger=" + bureau_vote_etranger +
                ", candidat=" + candidat +
                ", nombreVoix=" + nombreVoix +
                '}';
    }
}
