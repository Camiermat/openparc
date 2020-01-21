/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controleur.Entrainement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author p1805797
 */
public class EntrainementDAO extends DAO<Entrainement>{

    @Override
    public Entrainement find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Entrainement> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Entrainement create(Entrainement obj) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("INSERT INTO Entrainement (id, créneauHoraire, jour, idJoueur, numCourt) VALUES(?, ?, ?, ?, ?)");
            prepare.setInt(1, obj.getId());
            prepare.setString(2, obj.getCréneauHoraire());
            prepare.setString(3, obj.getJour());
            prepare.setInt(4, obj.getIdJoueur());
            prepare.setInt(5, obj.getNumCourt());
            prepare.executeUpdate();
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public Entrainement update(Entrainement obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Entrainement obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int findMaxId(){
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT MAX(id) from Entrainement");
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                return result.getInt(1);
            }
            result.close();
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    
}
