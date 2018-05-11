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
public class Armadura extends objetos{
    private int vidbono;
    private int suertbono;

    public Armadura() {
    }

    public Armadura(int vidbono, int suertbono, String nombre, String rareza) {
        super(nombre, rareza);
        this.vidbono = vidbono;
        this.suertbono = suertbono;
    }

    public int getVidbono() {
        return vidbono;
    }

    public void setVidbono(int vidbono) {
        this.vidbono = vidbono;
    }

    public int getSuertbono() {
        return suertbono;
    }

    public void setSuertbono(int suertbono) {
        this.suertbono = suertbono;
    }
    
}
