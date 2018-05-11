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

    public mago() {
    }

    public mago(int suerte, int Edad, String nombre, int estatura, int peso, String cpelo, String raza, int HP, int AD, int Eficacia, int Velocidad, int Crit, String grito) {
        super(suerte, Edad, nombre, estatura, peso, cpelo, raza, HP, AD, Eficacia, Velocidad, Crit, grito);
    }

    public ArrayList<objetos> getMochila() {
        return mochila;
    }

    public void setMochila(ArrayList<objetos> mochila) {
        this.mochila = mochila;
    }

    @Override
    public String toString() {
        return "mago{" + "mochila=" + mochila + '}'+super.toString();
    }
    
}
