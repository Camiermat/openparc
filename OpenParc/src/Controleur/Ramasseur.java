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
public class Ramasseur{
    private int id;
    private String nom;
    private String prenom;
    private int idEquipe;

    public Ramasseur(int id, String nom, String prenom, int idEquipe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.idEquipe = idEquipe;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getIdEquipe() {
        return idEquipe;
    }
       
}
