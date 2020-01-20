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
public class Entrainement {
    private int id;
    private String créneauHoraire;
    private String jour;
    private int idJoueur;
    private int numCourt;

    public Entrainement(int id, String créneauHoraire, String jour, int idJoueur, int numCourt) {
        this.id = id;
        this.créneauHoraire = créneauHoraire;
        this.jour = jour;
        this.idJoueur = idJoueur;
        this.numCourt = numCourt;
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

    public int getIdJoueur() {
        return idJoueur;
    }

    public int getNumCourt() {
        return numCourt;
    }
    
    
}
