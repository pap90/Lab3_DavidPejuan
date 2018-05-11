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
public class Talisman extends objetos{
    private int hpbono;
    private int ADbono;
    private int efibono;
    private int critbono;
    private int suertbono;
    private int velobono;

    public Talisman() {
    }

    public Talisman(int hpbono, int ADbono, int efibono, int critbono, int suertbono, int velobono, String nombre, String rareza) {
        super(nombre, rareza);
        this.hpbono = hpbono;
        this.ADbono = ADbono;
        this.efibono = efibono;
        this.critbono = critbono;
        this.suertbono = suertbono;
        this.velobono = velobono;
    }

    public int getHpbono() {
        return hpbono;
    }

    public void setHpbono(int hpbono) {
        this.hpbono = hpbono;
    }

    public int getADbono() {
        return ADbono;
    }

    public void setADbono(int ADbono) {
        this.ADbono = ADbono;
    }

    public int getEfibono() {
        return efibono;
    }

    public void setEfibono(int efibono) {
        this.efibono = efibono;
    }

    public int getCritbono() {
        return critbono;
    }

    public void setCritbono(int critbono) {
        this.critbono = critbono;
    }

    public int getSuertbono() {
        return suertbono;
    }

    public void setSuertbono(int suertbono) {
        this.suertbono = suertbono;
    }

    public int getVelobono() {
        return velobono;
    }

    public void setVelobono(int velobono) {
        this.velobono = velobono;
    }
    
}
