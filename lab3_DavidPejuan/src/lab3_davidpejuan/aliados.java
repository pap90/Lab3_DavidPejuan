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
public class aliados extends Personajes{
    private int suerte;
    private int Edad;
    private String nombre;
    private int estatura;
    private int peso;
    private String cpelo;
    private String raza;

    public aliados() {
    }

    public aliados(int suerte, int Edad, String nombre, int estatura, int peso, String cpelo, String raza, int HP, int AD, int Eficacia, int Velocidad, int Crit, String grito) {
        super(HP, AD, Eficacia, Velocidad, Crit, grito);
        this.suerte = suerte;
        this.Edad = Edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.cpelo = cpelo;
        this.raza = raza;
    }

    public int getSuerte() {
        return suerte;
    }

    public void setSuerte(int suerte) {
        this.suerte = suerte;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
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

    public String getCpelo() {
        return cpelo;
    }

    public void setCpelo(String cpelo) {
        this.cpelo = cpelo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}
