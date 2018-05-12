/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_davidpejuan;

import java.util.Random;

/**
 *
 * @author pejua
 */
public class Bruja extends Enemigos{
    private int AP;

    public Bruja() {
    }

    public Bruja(int AP, int edad, String nombre, int estatura, int peso, int HP, int AD, int Eficacia, int Velocidad, int Crit, String grito) {
        super(edad, nombre, estatura, peso, HP, AD, Eficacia, Velocidad, Crit, grito);
        this.AP = 20+r.nextInt(40);
        super.setHP(60+r.nextInt(80));
        super.setAD(5+r.nextInt(10));
        super.setCrit(1);
        super.setVelocidad(3+r.nextInt(7));
    }

    public int getAP() {
        return AP;
    }

    public void setAP(int AP) {
        this.AP = AP;
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Bruja{" + "AP=" + AP + '}'+super.toString();
    }
    
    
}
