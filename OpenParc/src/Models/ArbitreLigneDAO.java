/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controleur.ArbitreLigne;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author p1805797
 */
public class ArbitreLigneDAO extends DAO<ArbitreLigne>{

    @Override
    public ArbitreLigne find(int id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT * from ArbitreLigne where id=?");
            prepare.setInt(1, id);
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                return new ArbitreLigne(result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5));
            }
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<ArbitreLigne> findAll() {
        ArrayList<ArbitreLigne> list = new ArrayList();
        try {
            Statement stmt = this.connect.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * from ArbitreLigne");
            while (result.next()){
                ArbitreLigne c = new ArbitreLigne(result.getInt(1), result.getString(2),result.getString(3),result.getString(4),result.getString(5));
                list.add(c);
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public ArbitreLigne create(ArbitreLigne obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArbitreLigne update(ArbitreLigne obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(ArbitreLigne obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int findIdAvecNomPrenom(String nom, String prenom) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT id from ArbitreLigne where nom=? and prenom=?");
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
}
