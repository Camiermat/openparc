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
public class Court {
    private String name;
    private int numero;
    private String type;

    public Court(String name, int numero, String type) {
        this.name=name;
        this.numero = numero;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getNumero() {
        return numero;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        
        return "Le court " + name + " a pour numero " + numero + " et est de type " + type + '.';
    }
}
