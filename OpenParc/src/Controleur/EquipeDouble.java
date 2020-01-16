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
public class EquipeDouble {
    private int id;
    private String wildCard;
    private int idJoueur1;
    private int idJoueur2;
    private int idTournoiDouble;

    public EquipeDouble(int id, String wildCard, int idJoueur1, int idJoueur2, int idTournoiDouble) {
        this.id = id;
        this.wildCard = wildCard;
        this.idJoueur1 = idJoueur1;
        this.idJoueur2 = idJoueur2;
        this.idTournoiDouble = idTournoiDouble;
    }

    public int getId() {
        return id;
    }

    public String getWildCard() {
        return wildCard;
    }

    public int getIdJoueur1() {
        return idJoueur1;
    }

    public int getIdJoueur2() {
        return idJoueur2;
    }
    
    public int getIdTournoiDouble() {
        return idTournoiDouble;
    }

    @Override
    public String toString() {
        return "EquipeDouble{" + "id=" + id + ", wildCard=" + wildCard + ", idJoueur1=" + idJoueur1 + ", idJoueur2=" + idJoueur2 + ", idTournoiDouble=" + idTournoiDouble + '}';
    }
}
