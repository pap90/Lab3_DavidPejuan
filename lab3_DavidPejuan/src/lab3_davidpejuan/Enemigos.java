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
public class Enemigos extends Personajes{
    Random r=new Random();
    private int edad;
    private String nombre;
    private int estatura;
    private int peso;

    public Enemigos() {
    }

    public Enemigos(int edad, String nombre, int estatura, int peso, int HP, int AD, int Eficacia, int Velocidad, int Crit, String grito) {
        super(HP, AD, Eficacia, Velocidad, Crit, grito);
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Enemigos{" + "r=" + r + ", edad=" + edad + ", nombre=" + nombre + ", estatura=" + estatura + ", peso=" + peso + '}'+super.toString();
    }
    
}
