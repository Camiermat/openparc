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
                return new Match(result.getInt(1),result.getString(2),result.getString(3), result.getInt(4),result.getInt(5),
                        result.getInt(6),result.getInt(7),result.getInt(8),result.getInt(9),result.getInt(10),result.getInt(11),
                        result.getInt(12),result.getInt(13),result.getInt(14),result.getInt(15),result.getInt(16),result.getInt(17),
                        result.getInt(18),result.getInt(19),result.getInt(20),result.getInt(21),result.getInt(22));
            }
            prepare.close();
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
    
    
    public ArrayList<Match> findTournoiSimple() {
        ArrayList<Match> listMatch=new ArrayList();
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT * from Matche where idTournoiSimple=1");
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                Match match= new Match(result.getInt(1),result.getString(2),result.getString(3), result.getInt(4),result.getInt(5),
                        result.getInt(6),result.getInt(7),result.getInt(8),result.getInt(9),result.getInt(10),result.getInt(11),
                        result.getInt(12),result.getInt(13),result.getInt(14),result.getInt(15),result.getInt(16),result.getInt(17),
                        result.getInt(18),result.getInt(19),result.getInt(20),result.getInt(21),result.getInt(22));
                listMatch.add(match);
            }
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listMatch;
    }
    
    public ArrayList<Match> findTournoiDouble() {
        ArrayList<Match> listMatch=new ArrayList();
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT * from Matche where idTournoiDouble=1");
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                Match match= new Match(result.getInt(1),result.getString(2),result.getString(3), result.getInt(4),result.getInt(5),
                        result.getInt(6),result.getInt(7),result.getInt(8),result.getInt(9),result.getInt(10),result.getInt(11),
                        result.getInt(12),result.getInt(13),result.getInt(14),result.getInt(15),result.getInt(16),result.getInt(17),
                        result.getInt(18),result.getInt(19),result.getInt(20),result.getInt(21),result.getInt(22));
                listMatch.add(match);
            }
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listMatch;
    }
    
    public ArrayList<Match> findQualification() {
        ArrayList<Match> listMatch=new ArrayList();
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT * from Matche where idQualification=1");
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                Match match= new Match(result.getInt(1),result.getString(2),result.getString(3), result.getInt(4),result.getInt(5),
                        result.getInt(6),result.getInt(7),result.getInt(8),result.getInt(9),result.getInt(10),result.getInt(11),
                        result.getInt(12),result.getInt(13),result.getInt(14),result.getInt(15),result.getInt(16),result.getInt(17),
                        result.getInt(18),result.getInt(19),result.getInt(20),result.getInt(21),result.getInt(22));
                listMatch.add(match);
            }
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listMatch;
    }
    
    public Match findIdJoueurs(int idJoueur1, int idJoueur2) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("SELECT * from Matche where idJoueur1=? and idJoueur2=?");
            prepare.setInt(1, idJoueur1);
            prepare.setInt(2, idJoueur2);
            ResultSet result = prepare.executeQuery();
            while (result.next()){
                return new Match(result.getInt(1),result.getString(2),result.getString(3), result.getInt(4),result.getInt(5),
                        result.getInt(6),result.getInt(7),result.getInt(8),result.getInt(9),result.getInt(10),result.getInt(11),
                        result.getInt(12),result.getInt(13),result.getInt(14),result.getInt(15),result.getInt(16),result.getInt(17),
                        result.getInt(18),result.getInt(19),result.getInt(20),result.getInt(21),result.getInt(22));
            }
            prepare.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public int createMatch(Match obj) {
        try {
            PreparedStatement prepare = this.connect.prepareStatement("INSERT INTO Matche values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            prepare.setInt(1, obj.getId());
            prepare.setString(2, obj.getCréneauHoraire());
            prepare.setString(3, obj.getJour());
            prepare.setInt(4, obj.getNiveauTournoi());
            prepare.setInt(5, obj.getNumCourt());
            prepare.setInt(6, obj.getIdArbitreChaise());
            prepare.setInt(7, obj.getIdArbitreLigne1());
            prepare.setInt(8, obj.getIdArbitreLigne2());
            prepare.setInt(9, obj.getIdArbitreLigne3());
            prepare.setInt(10, obj.getIdArbitreLigne4());
            prepare.setInt(11, obj.getIdArbitreLigne5());
            prepare.setInt(12, obj.getIdArbitreLigne6());
            prepare.setInt(13, obj.getIdArbitreLigne7());
            prepare.setInt(14, obj.getIdEquipeRamasseur1());
            prepare.setInt(15, obj.getIdEquipeRamasseur2());
            prepare.setInt(16, obj.getIdTournoiSimple());
            prepare.setInt(17, obj.getIdTournoiDouble());
            prepare.setInt(18, obj.getIdQualification());
            prepare.setInt(19, obj.getIdJoueur1());
            prepare.setInt(20, obj.getIdJoueur2());
            prepare.setInt(21, obj.getIdEquipe1());
            prepare.setInt(22, obj.getIdEquipe2());
            int result = prepare.executeUpdate();
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
