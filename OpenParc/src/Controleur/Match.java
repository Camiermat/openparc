/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

/**
 *
 * @author p1805797
 */
public class Match {
    private int id;
    private String créneauHoraire;
    private String jour;
    private int niveauTournoi;
    private int numCourt;
    private int idArbitreChaise;
    private int idArbitreLigne1;
    private int idArbitreLigne2;
    private int idArbitreLigne3;
    private int idArbitreLigne4;
    private int idArbitreLigne5;
    private int idArbitreLigne6;
    private int idArbitreLigne7;
    private int idEquipeRamasseur1;
    private int idEquipeRamasseur2;
    private int idTournoiSimple;
    private int idTournoiDouble;
    private int idQualification;
    private int idJoueur1;
    private int idJoueur2;
    private int idEquipe1;
    private int idEquipe2;

    public Match(int id, String créneauHoraire, String jour, int niveauTournoi, int numCourt, int idArbitreChaise, int idArbitreLigne1, int idArbitreLigne2, int idArbitreLigne3, int idArbitreLigne4, int idArbitreLigne5, int idArbitreLigne6, int idArbitreLigne7, int idEquipeRamasseur1, int idEquipeRamasseur2, int idTournoiSimple, int idTournoiDouble, int idQualification, int idJoueur1, int idJoueur2, int idEquipe1, int idEquipe2) {
        this.id = id;
        this.créneauHoraire = créneauHoraire;
        this.jour = jour;
        this.niveauTournoi = niveauTournoi;
        this.numCourt = numCourt;
        this.idArbitreChaise = idArbitreChaise;
        this.idArbitreLigne1 = idArbitreLigne1;
        this.idArbitreLigne2 = idArbitreLigne2;
        this.idArbitreLigne3 = idArbitreLigne3;
        this.idArbitreLigne4 = idArbitreLigne4;
        this.idArbitreLigne5 = idArbitreLigne5;
        this.idArbitreLigne6 = idArbitreLigne6;
        this.idArbitreLigne7 = idArbitreLigne7;
        this.idEquipeRamasseur1 = idEquipeRamasseur1;
        this.idEquipeRamasseur2 = idEquipeRamasseur2;
        this.idTournoiSimple = idTournoiSimple;
        this.idTournoiDouble = idTournoiDouble;
        this.idQualification = idQualification;
        this.idJoueur1 = idJoueur1;
        this.idJoueur2 = idJoueur2;
        this.idEquipe1 = idEquipe1;
        this.idEquipe2 = idEquipe2;
    }

    public int getId() {
        return id;
    }

    public String getCréneauHoraire() {
        return créneauHoraire;
    }

    public String getJour() {
        return jour;
    }

    public int getNiveauTournoi() {
        return niveauTournoi;
    }

    public int getNumCourt() {
        return numCourt;
    }

    public int getIdArbitreChaise() {
        return idArbitreChaise;
    }

    public int getIdArbitreLigne1() {
        return idArbitreLigne1;
    }

    public int getIdArbitreLigne2() {
        return idArbitreLigne2;
    }

    public int getIdArbitreLigne3() {
        return idArbitreLigne3;
    }

    public int getIdArbitreLigne4() {
        return idArbitreLigne4;
    }

    public int getIdArbitreLigne5() {
        return idArbitreLigne5;
    }

    public int getIdArbitreLigne6() {
        return idArbitreLigne6;
    }

    public int getIdArbitreLigne7() {
        return idArbitreLigne7;
    }

    public int getIdEquipeRamasseur1() {
        return idEquipeRamasseur1;
    }

    public int getIdEquipeRamasseur2() {
        return idEquipeRamasseur2;
    }

    public int getIdTournoiSimple() {
        return idTournoiSimple;
    }

    public int getIdTournoiDouble() {
        return idTournoiDouble;
    }

    public int getIdQualification() {
        return idQualification;
    }

    public int getIdJoueur1() {
        return idJoueur1;
    }

    public int getIdJoueur2() {
        return idJoueur2;
    }

    public int getIdEquipe1() {
        return idEquipe1;
    }

    public int getIdEquipe2() {
        return idEquipe2;
    }
    
    
}
