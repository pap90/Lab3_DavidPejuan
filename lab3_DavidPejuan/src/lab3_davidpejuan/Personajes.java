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
public class Personajes {
    private  int HP;
    private int AD;
    private int Eficacia;
    private int Velocidad;
    private int Crit;
    private String grito;

    public Personajes() {
    }

    public Personajes(int HP, int AD, int Eficacia, int Velocidad, int Crit, String grito) {
        this.HP = HP;
        this.AD = AD;
        this.Eficacia = Eficacia;
        this.Velocidad = Velocidad;
        this.Crit = Crit;
        this.grito = grito;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAD() {
        return AD;
    }

    public void setAD(int AD) {
        this.AD = AD;
    }

    public int getEficacia() {
        return Eficacia;
    }

    public void setEficacia(int Eficacia) {
        this.Eficacia = Eficacia;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public int getCrit() {
        return Crit;
    }

    public void setCrit(int Crit) {
        this.Crit = Crit;
    }

    public String getGrito() {
        return grito;
    }

    public void setGrito(String grito) {
        this.grito = grito;
    }
    
}
