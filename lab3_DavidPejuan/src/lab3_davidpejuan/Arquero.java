/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_davidpejuan;

import java.util.ArrayList;

/**
 *
 * @author pejua
 */
public class Arquero extends aliados{
    private ArrayList<objetos> mochila2=new ArrayList();

    public Arquero() {
    }

    public Arquero(int suerte, int Edad, String nombre, int estatura, int peso, String cpelo, String raza, int HP, int AD, int Eficacia, int Velocidad, int Crit, String grito) {
        super(suerte, Edad, nombre, estatura, peso, cpelo, raza, HP, AD, Eficacia, Velocidad, Crit, grito);
        super.setSuerte(20);
        super.setHP(150);
        super.setAD(AD);
        super.setEficacia(85);
        super.setCrit(60);
        super.setVelocidad(15);
    }

    public ArrayList<objetos> getMochila2() {
        return mochila2;
    }

    public void setMochila2(ArrayList<objetos> mochila2) {
        this.mochila2 = mochila2;
    }

    @Override
    public String toString() {
        return "Arquero{" + "mochila2=" + mochila2 + '}'+super.toString();
    }
    
}
