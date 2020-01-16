/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import static Models.MariaDbDataSourceDAO.getMariaDbDataSourceDAO;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author p1805797
 * @param <T>
 */
public abstract class DAO<T> {
    public Connection connect = getMariaDbDataSourceDAO();
	
	/**
	 * Permet de récupérer un objet via son ID
	 * @param id
	 * @return
	 */
	public abstract T find(int id);
        
        public abstract ArrayList<T> findAll();
	
	/**
	 * Permet de créer une entrée dans la base de données
	 * par rapport à un objet
	 * @param obj
         * @return 
	 */
	public abstract T create(T obj);
	
	/**
	 * Permet de mettre à jour les données d'une entrée dans la base 
	 * @param obj
         * @return
	 */
	public abstract T update(T obj);
	
	/**
	 * Permet la suppression d'une entrée de la base
	 * @param obj
         * @return
	 */
	public abstract void delete(T obj);

}
