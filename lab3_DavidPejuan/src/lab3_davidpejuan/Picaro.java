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
public class Picaro extends aliados{
    ArrayList <objetos> mochila=new ArrayList();

    public Picaro() {
    }

    public Picaro(int suerte, int Edad, String nombre, int estatura, int peso, String cpelo, String raza, int HP, int AD, int Eficacia, int Velocidad, int Crit, String grito) {
        super(suerte, Edad, nombre, estatura, peso, cpelo, raza, HP, AD, Eficacia, Velocidad, Crit, grito);
        super.setHP(150);
        super.setAD(55);
        super.setEficacia(85);
        super.setCrit(60);
        super.setSuerte(50);
        super.setVelocidad(30);
    }

    public ArrayList<objetos> getMochila() {
        return mochila;
    }

    public void setMochila(ArrayList<objetos> mochila) {
        this.mochila = mochila;
    }
    
}
