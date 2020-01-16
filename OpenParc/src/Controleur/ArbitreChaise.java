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
public class ArbitreChaise{
    private int id;
    private String nom;
    private String prenom;
    private String categorie;
    private String nationalité;

    public ArbitreChaise (int id, String nom, String prenom, String categorie, String nationalité) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.categorie = categorie;
        this.nationalité = nationalité;
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

    public String getCategorie() {
        return categorie;
    }

    public String getNationalité() {
        return nationalité;
    }
}
