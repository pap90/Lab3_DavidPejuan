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
public class Troll extends Enemigos{

    public Troll() {
    }
    Random r=new Random(); 
    public Troll(int edad, String nombre, int estatura, int peso, int HP, int AD, int Eficacia, int Velocidad, int Crit, String grito) {
        super(edad, nombre, estatura, peso, HP, AD, Eficacia, Velocidad, Crit, grito);
        super.setHP(50+r.nextInt(80));
        super.setAD(30+r.nextInt(50));
        super.setEficacia(50+r.nextInt(65));
        super.setCrit(15+r.nextInt(20));
        super.setVelocidad(10);
    }
    
    
}
