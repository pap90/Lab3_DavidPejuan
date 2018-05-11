/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_davidpejuan;

/**
 *
 * @author pejua
 */
public class Arma extends objetos {
    private int ADbono;
    private int APbono;

    public Arma() {
    }

    public Arma(int ADbono, int APbono, String nombre, String rareza) {
        super(nombre, rareza);
        this.ADbono = ADbono;
        this.APbono = APbono;
    }

    public int getADbono() {
        return ADbono;
    }

    public void setADbono(int ADbono) {
        this.ADbono = ADbono;
    }

    public int getAPbono() {
        return APbono;
    }

    public void setAPbono(int APbono) {
        this.APbono = APbono;
    }
    
}
