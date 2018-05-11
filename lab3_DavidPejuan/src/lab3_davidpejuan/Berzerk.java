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
public class Berzerk extends aliados{
    private ArrayList <objetos> mochila=new ArrayList();

    public Berzerk() {
    }

    public Berzerk(int suerte, int Edad, String nombre, int estatura, int peso, String cpelo, String raza, int HP, int AD, int Eficacia, int Velocidad, int Crit, String grito) {
        super(suerte, Edad, nombre, estatura, peso, cpelo, raza, HP, AD, Eficacia, Velocidad, Crit, grito);
        super.setHP(190);
        super.setAD(80);
        super.setEficacia(80);
        super.setCrit(30);
        super.setSuerte(15);
        super.setVelocidad(20);
        
    }

    public ArrayList<objetos> getMochila() {
        return mochila;
    }

    public void setMochila(ArrayList<objetos> mochila) {
        this.mochila = mochila;
    }
    
}
