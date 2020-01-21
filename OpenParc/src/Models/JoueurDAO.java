/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controleur.EquipeDouble;
import Controleur.Joueur;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author p1805797
 */
public class JoueurDAO extends DAO<Joueur>{

    @Override
    public Joueur find(int id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT * from Joueur where id=?");
            prepare.setInt(1, id);
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                return new Joueur(result.getInt(1),result.getInt(2),result.getInt(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getInt(8),result.getString(9),result.getInt(10),result.getInt(11),result.getInt(12));
            }
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Joueur create(Joueur obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update(int id,String wildCard) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("UPDATE Joueur set wildCard=? where id=?");
            prepare.setString(1, wildCard);
            prepare.setInt(2, id);
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return; 
    }

    @Override
    public void delete(Joueur obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Joueur> findAll() {
        ArrayList<Joueur> list = new ArrayList();
        try {
            Statement stmt = this.connect.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * from Joueur");
            while (result.next()){
                Joueur j = new Joueur(result.getInt(1),result.getInt(2),result.getInt(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getInt(8),result.getString(9),result.getInt(10),result.getInt(11),result.getInt(12));
                list.add(j);
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public ArrayList<Joueur> findAllTournoiSimple() {
        ArrayList<Joueur> list = new ArrayList();
        try {
            Statement stmt = this.connect.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * from Joueur where idTournoiSimple=1");
            while (result.next()){
                Joueur j = new Joueur(result.getInt(1),result.getInt(2),result.getInt(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getInt(8),result.getString(9),result.getInt(10),result.getInt(11),result.getInt(12));
                list.add(j);
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
      
    public ArrayList<Joueur> findAllQualification() {
        ArrayList<Joueur> list = new ArrayList();
        try {
            Statement stmt = this.connect.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * from Joueur where idQualification=1");
            while (result.next()){
                Joueur j = new Joueur(result.getInt(1),result.getInt(2),result.getInt(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getInt(8),result.getString(9),result.getInt(10),result.getInt(11),result.getInt(12));
                list.add(j);
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public ArrayList<Joueur> findAllTournoiSimple(int niveau) {
        ArrayList<Joueur> list = new ArrayList();
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT * from Joueur where idTournoiSimple>=?");
            prepare.setInt(1, niveau);
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                Joueur j = new Joueur(result.getInt(1),result.getInt(2),result.getInt(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getInt(8),result.getString(9),result.getInt(10),result.getInt(11),result.getInt(12));
                list.add(j);
            }
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
      
    public ArrayList<Joueur> findAllQualification(int niveau) {
        ArrayList<Joueur> list = new ArrayList();
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT * from Joueur where idQualification>=?");
            prepare.setInt(1, niveau);
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                Joueur j = new Joueur(result.getInt(1),result.getInt(2),result.getInt(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getInt(8),result.getString(9),result.getInt(10),result.getInt(11),result.getInt(12));
                list.add(j);
            }
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public int findIdAvecNomPrenom(String nom, String prenom) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT id from Joueur where nom=? and prenom=?");
            prepare.setString(1, nom);
            prepare.setString(2, prenom);
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                return result.getInt(1);
            }
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public int findIdNom(String nom){
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT id from Joueur where nom=?");
            prepare.setString(1, nom);
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                return result.getInt(1);
            }
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public int[] findNbWildCard() {
        int[] nbWC = new int[3];
        try {
            Statement stmt = this.connect.createStatement();
            ResultSet result = stmt.executeQuery("SELECT COUNT(id) from Joueur where wildcard='1' and idTournoiSimple=1");
            while (result.next()){
                nbWC[0]=result.getInt(1);
            }
            result = stmt.executeQuery("SELECT COUNT(id) from EquipeDouble where wildcard='1'");
            while (result.next()){
                nbWC[1]=result.getInt(1);
            }
            result = stmt.executeQuery("SELECT COUNT(id) from Joueur where wildcard='1' and idQualification=1");
            while (result.next()){
                nbWC[2]=result.getInt(1);
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nbWC;
    }

    @Override
    public Joueur update(Joueur obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void updateIdTournoiSimple(int id,int idTournoi){
        try {
            PreparedStatement prepare = this.connect.prepareStatement("UPDATE Joueur set idTournoiSimple=? where id=?");
            prepare.setInt(1, idTournoi);
            prepare.setInt(2, id);
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    
    public void updateIdQualification(int id,int idTournoi){
        try {
            PreparedStatement prepare = this.connect.prepareStatement("UPDATE Joueur set idQualification=? where id=?");
            prepare.setInt(1, idTournoi);
            prepare.setInt(2, id);
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;
    }
    
    
    public ArrayList<Joueur> findAllTournoiSimpleSansJoueur(int niveau,int idJoueur) {
        ArrayList<Joueur> list = new ArrayList();
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT * from Joueur where idTournoiSimple=? and id!=?");
            prepare.setInt(1, niveau);
            prepare.setInt(2, idJoueur);
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                Joueur j = new Joueur(result.getInt(1),result.getInt(2),result.getInt(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getInt(8),result.getString(9),result.getInt(10),result.getInt(11),result.getInt(12));
                list.add(j);
            }
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
      
    public ArrayList<Joueur> findAllQualificationSansJoueur(int niveau,int idJoueur) {
        ArrayList<Joueur> list = new ArrayList();
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT * from Joueur where idQualification=? and id!=?");
            prepare.setInt(1, niveau);
            prepare.setInt(2, idJoueur);
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                Joueur j = new Joueur(result.getInt(1),result.getInt(2),result.getInt(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getInt(8),result.getString(9),result.getInt(10),result.getInt(11),result.getInt(12));
                list.add(j);
            }
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public ArrayList<Joueur> findAllJoueurEnMatchEntrainement(String date, int court, String créneau) {
        ArrayList<Joueur> listJoueur = new ArrayList();
        EquipeDoubleDAO equipeDoubleDAO=new EquipeDoubleDAO();
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT idJoueur1,idJoueur2,idEquipe1,idEquipe2 from Matche where numCourt=? and jour=? and créneauHoraire=?");
            prepare.setInt(1, court);
            prepare.setString(2, date);
            prepare.setString(3, créneau);
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                if(result.getInt(1)==0){
                    EquipeDouble equipe1=equipeDoubleDAO.find(result.getInt(3));
                    EquipeDouble equipe2=equipeDoubleDAO.find(result.getInt(4));
                    Joueur joueur1=this.find(equipe1.getIdJoueur1());
                    Joueur joueur2=this.find(equipe1.getIdJoueur2());
                    Joueur joueur3=this.find(equipe2.getIdJoueur1());
                    Joueur joueur4=this.find(equipe2.getIdJoueur2());
                    listJoueur.add(joueur1);
                    listJoueur.add(joueur2);
                    listJoueur.add(joueur3);
                    listJoueur.add(joueur4);
                }else{
                    Joueur joueur1=this.find(result.getInt(1));
                    Joueur joueur2=this.find(result.getInt(2));
                    listJoueur.add(joueur1);
                    listJoueur.add(joueur2);
                }
                
            }
            prepare = this.connect.prepareStatement("SELECT idJoueur from Entrainement where numCourt=? and jour=? and créneauHoraire=?");
            prepare.setInt(1, court);
            prepare.setString(2, date);
            prepare.setString(3, créneau);
            result = prepare.executeQuery();
            while (result.next()){
                Joueur joueur=this.find(result.getInt(1));
                listJoueur.add(joueur);
            }
            result.close();
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listJoueur;
    }
    
}
