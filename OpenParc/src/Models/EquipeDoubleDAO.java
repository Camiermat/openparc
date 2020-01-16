/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controleur.EquipeDouble;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author p1805797
 */
public class EquipeDoubleDAO extends DAO<EquipeDouble>{

    @Override
    public EquipeDouble find(int id) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT * from EquipeDouble where id=?");
            prepare.setInt(1, id);
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                return new EquipeDouble(result.getInt(1),result.getString(2), result.getInt(3),result.getInt(4), result.getInt(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<EquipeDouble> findAll() {
        ArrayList<EquipeDouble> list = new ArrayList();
        try {
            Statement stmt = this.connect.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * from EquipeDouble");
            while (result.next()){
                EquipeDouble ed = new EquipeDouble(result.getInt(1),result.getString(2), result.getInt(3),result.getInt(4), result.getInt(5));
                list.add(ed);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public EquipeDouble create(EquipeDouble obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EquipeDouble update(EquipeDouble obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(EquipeDouble obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<EquipeDouble> findAll(int niveau) {
        ArrayList<EquipeDouble> list = new ArrayList();
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT * from EquipeDouble WHERE idTournoiDouble>=?");
            prepare.setInt(1,niveau);
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                EquipeDouble ed = new EquipeDouble(result.getInt(1),result.getString(2), result.getInt(3),result.getInt(4), result.getInt(5));
                list.add(ed);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
