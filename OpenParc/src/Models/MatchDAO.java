/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controleur.Match;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author p1805797
 */
public class MatchDAO extends DAO<Match>{

    @Override
    public Match find(int id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT * from Matche where id=?");
            prepare.setInt(1, id);
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                return new Match(result.getInt(1),result.getInt(2),result.getString(3), result.getInt(4),result.getInt(5),
                        result.getInt(6),result.getInt(7),result.getInt(8),result.getInt(9),result.getInt(10),result.getInt(11),
                        result.getInt(12),result.getInt(13),result.getInt(14),result.getInt(15),result.getInt(16),result.getInt(17),
                        result.getInt(18),result.getInt(19),result.getInt(20),result.getInt(21),result.getInt(22));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Match> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Match create(Match obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Match update(Match obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Match obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}