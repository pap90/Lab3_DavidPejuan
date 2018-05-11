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
public class objetos {
    private String nombre;
    private String rareza;

    public objetos() {
    }

    public objetos(String nombre, String rareza) {
        this.nombre = nombre;
        this.rareza = rareza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }
    
}
