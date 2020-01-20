/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controleur.Court;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author p1805797
 */
public class CourtDAO extends DAO<Court>{
    
    @Override
    public Court find(int id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT * from Court where numero=?");
            prepare.setInt(1, id);
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                return new Court(result.getString(2), result.getInt(1),result.getString(3));
            }
            result.close();
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Court create(Court obj) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("INSERT INTO Court (nom, numero, type) VALUES(?, ?, ?)");
            prepare.setString(1, obj.getName());
            prepare.setInt(2, obj.getNumero());
            prepare.setString(3, obj.getType());
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public Court update(Court obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Court obj) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("DELETE FROM Court WHERE numero=?");
            prepare.setInt(1, obj.getNumero());
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Court> findAll() {
        ArrayList<Court> list = new ArrayList();
        try {
            Statement stmt = this.connect.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * from Court");
            while (result.next()){
                Court c = new Court(result.getString(2), result.getInt(1),result.getString(3));
                list.add(c);
            }
            result.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public ArrayList<String> findCréneauLibre(String date,int court){
        ArrayList<String> listCréneau=new ArrayList();
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT créneauHoraire from Matche where numCourt=? and jour=?");
            prepare.setInt(1, court);
            prepare.setString(2, date);
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                String creneau=result.getString(1);
                listCréneau.add(creneau);
            }
            prepare = this.connect.prepareStatement("SELECT créneauHoraire from Entrainement where numCourt=? and jour=?");
            prepare.setInt(1, court);
            prepare.setString(2, date);
            result = prepare.executeQuery();
            while (result.next()){
                String creneau=result.getString(1);
                listCréneau.add(creneau);
            }
            result.close();
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listCréneau;
    }
    
    public Court findAvecNom(String nom) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT * from Court where Nom=?");
            prepare.setString(1, nom);
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                return new Court(result.getString(2), result.getInt(1),result.getString(3));
            }
            result.close();
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
