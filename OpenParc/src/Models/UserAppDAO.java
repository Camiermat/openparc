/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controleur.UserApp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author p1805797
 */
public class UserAppDAO extends DAO<UserApp>{

    @Override
    public UserApp find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<UserApp> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserApp create(UserApp obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserApp update(UserApp obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(UserApp obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean find(String login, String password){
        try {
            PreparedStatement prepare = connect.prepareStatement("SELECT * FROM UserApp WHERE login=? AND password=?");
            prepare.setString(1,login);
            prepare.setString(2,password);
            ResultSet result = prepare.executeQuery();
            if(result.next())return true;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
