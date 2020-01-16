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
public class Joueur{
    private int id;
    private int classementDouble;
    private int classementSimple;
    private String wildCard;
    private String nationalité;
    private String nom;
    private String prenom;
    private int age;
    private String adresse;
    private int idTournoiSimple;
    private int idTournoiDouble;
    private int idQualification;

    public Joueur(int id, int classementDouble, int classementSimple, String wildCard, String nationalité, String nom, String prenom, int age, String adresse, int idTournoiSimple, int idTournoiDouble, int idQualification) {
        this.id = id;
        this.classementDouble = classementDouble;
        this.classementSimple = classementSimple;
        this.wildCard = wildCard;
        this.nationalité = nationalité;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;
        this.idTournoiSimple = idTournoiSimple;
        this.idTournoiDouble = idTournoiDouble;
        this.idQualification = idQualification;
    }

    @Override
    public String toString() {
        return "Joueur{" + "id=" + id + ", classementDouble=" + classementDouble + ", classementSimple=" + classementSimple + ", wildCard=" + wildCard + ", nationalit\u00e9=" + nationalité + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", adresse=" + adresse + ", idTournoiSimple=" + idTournoiSimple + ", idTournoiDouble=" + idTournoiDouble + ", idQualification=" + idQualification + '}';
    }

    public int getId() {
        return id;
    }

    public int getClassementDouble() {
        return classementDouble;
    }

    public int getClassementSimple() {
        return classementSimple;
    }

    public String getWildCard() {
        return wildCard;
    }

    public String getNationalité() {
        return nationalité;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getAdresse() {
        return adresse;
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
    
    
}
