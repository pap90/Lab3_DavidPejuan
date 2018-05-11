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
public class mago extends aliados{
    private ArrayList <objetos> mochila=new ArrayList();
    private int AP;
    public mago() {
    }

    public mago(int AP, int suerte, int Edad, String nombre, int estatura, int peso, String cpelo, String raza, int HP, int AD, int Eficacia, int Velocidad, int Crit, String grito) {
        super(suerte, Edad, nombre, estatura, peso, cpelo, raza, HP, AD, Eficacia, Velocidad, Crit, grito);
        this.AP = 50;
        super.setHP(120);
        super.setAD(20);
        super.setEficacia(70);
        super.setCrit(2);
        super.setSuerte(20);
        super.setVelocidad(10);
    }

    

    public ArrayList<objetos> getMochila() {
        return mochila;
    }

    public void setMochila(ArrayList<objetos> mochila) {
        this.mochila = mochila;
    }

    public int getAP() {
        return AP;
    }

    public void setAP(int AP) {
        this.AP = AP;
    }
    

    @Override
    public String toString() {
        return "mago{" + "mochila=" + mochila + '}'+super.toString();
    }
    
}
