/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_davidpejuan;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author pejua
 */
public class Lab3_DavidPejuan {

    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Personajes> P = new ArrayList();
        int edad;
        String nombre = "";
        int estatura;
        int peso;
        String cpelo;
        String cpiel;
        String raza = "";
        int ropc = 0;
        int opcion = 0;
        int copc;
        while (opcion != 3) {
            System.out.println("1) Iniciar");
            System.out.println("2) Nivel de dificultad");
            System.out.println("3) Salir");
            System.out.println("Ingrese su opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("1) Berzerk");
                    System.out.println("2) Arquero");
                    System.out.println("3) Mago ");
                    System.out.println("4) Pícaro");
                    System.out.println("Ingrese que clase desea: ");
                    int opc = sc.nextInt();
                    switch (opc) {
                        case 1:
                            System.out.println("Ingrese la edad: ");
                            edad = sc.nextInt();
                            System.out.println("Ingrese el nombre: ");
                            nombre = sc.next();
                            System.out.println("Ingrese la estatura: ");
                            estatura = sc.nextInt();
                            System.out.println("Ingrese el peso: ");
                            peso = sc.nextInt();
                            System.out.println("Ingrese color de piel: ");
                            cpiel = sc.next();
                            copc = 0;
                            cpelo = "";
                            while (copc != 1 && copc != 2 && copc != 3) {
                                System.out.println("desea que el color de pelo sea: ");
                                System.out.println("1) negro");
                                System.out.println("2) cafe");
                                System.out.println("3)rubio");
                                System.out.println("Ingrese su opcion");
                                copc = sc.nextInt();
                                switch (copc) {
                                    case 1:
                                        cpelo = "Negro";
                                        break;
                                    case 2:
                                        cpelo = "cafe";
                                        break;
                                    case 3:
                                        cpelo = "rubio";
                                        break;
                                    default:
                                }
                            }
                            raza = "";
                            ropc = 0;
                            while (ropc != 1 && ropc != 2 && ropc != 3 && ropc != 4) {
                                System.out.println("Desea que su raza sea: ");
                                System.out.println("1) Hobbit");
                                System.out.println("2) elfo");
                                System.out.println("3) humano");
                                System.out.println("4) enano");
                                System.out.println("Ingrese su opcion: ");
                                ropc = sc.nextInt();
                                switch (ropc) {
                                    case 1:
                                        raza = "Hobbit";
                                        break;
                                    case 2:
                                        raza = "elfo";
                                        break;
                                    case 3:
                                        raza = "Humano";
                                        break;
                                    case 4:
                                        raza = "enano";
                                        break;
                                    default:
                                }
                            }
                            P.add(new Berzerk(0, edad, nombre, estatura, peso, cpelo, raza, 0, 0, 0, 0, 0, ""));
                            System.out.println(P);
                            /*P.get(0).setHP(180);
                            P.get(0).setAD(80);
                            P.get(0).setEficacia(80);
                            P.get(0).setCrit(30);
                            P.get(0).se*/

                            break;
                        case 2:
                            System.out.println("Ingrese la edad: ");
                            edad = sc.nextInt();
                            System.out.println("Ingrese el nombre: ");
                            nombre = sc.next();
                            System.out.println("Ingrese la estatura: ");
                            estatura = sc.nextInt();
                            System.out.println("Ingrese el peso: ");
                            peso = sc.nextInt();
                            System.out.println("Ingrese color de piel: ");
                            cpiel = sc.next();
                            copc = 0;
                            cpelo = "";
                            while (copc != 1 && copc != 2 && copc != 3) {
                                System.out.println("desea que el color de pelo sea: ");
                                System.out.println("1) negro");
                                System.out.println("2) cafe");
                                System.out.println("3)rubio");
                                System.out.println("Ingrese su opcion");
                                copc = sc.nextInt();
                                switch (copc) {
                                    case 1:
                                        cpelo = "Negro";
                                        break;
                                    case 2:
                                        cpelo = "cafe";
                                        break;
                                    case 3:
                                        cpelo = "rubio";
                                        break;
                                    default:
                                }
                            }
                            raza = "";
                            ropc = 0;
                            while (ropc != 1 && ropc != 2 && ropc != 3 && ropc != 4) {
                                System.out.println("Desea que su raza sea: ");
                                System.out.println("1) Hobbit");
                                System.out.println("2) elfo");
                                System.out.println("3) humano");
                                System.out.println("4) enano");
                                System.out.println("Ingrese su opcion: ");
                                ropc = sc.nextInt();
                                switch (ropc) {
                                    case 1:
                                        raza = "Hobbit";
                                        break;
                                    case 2:
                                        raza = "elfo";
                                        break;
                                    case 3:
                                        raza = "Humano";
                                        break;
                                    case 4:
                                        raza = "enano";
                                        break;
                                    default:
                                }
                            }
                            P.add(new Arquero(0, edad, nombre, estatura, peso, cpelo, raza, 0, 0, 0, 0, 0, ""));
                            break;

                        case 3:
                            System.out.println("Ingrese la edad: ");
                            edad = sc.nextInt();
                            System.out.println("Ingrese el nombre: ");
                            nombre = sc.next();
                            System.out.println("Ingrese la estatura: ");
                            estatura = sc.nextInt();
                            System.out.println("Ingrese el peso: ");
                            peso = sc.nextInt();
                            System.out.println("Ingrese color de piel: ");
                            cpiel = sc.next();
                            copc = 0;
                            cpelo = "";
                            while (copc != 1 && copc != 2 && copc != 3) {
                                System.out.println("desea que el color de pelo sea: ");
                                System.out.println("1) negro");
                                System.out.println("2) cafe");
                                System.out.println("3)rubio");
                                System.out.println("Ingrese su opcion");
                                copc = sc.nextInt();
                                switch (copc) {
                                    case 1:
                                        cpelo = "Negro";
                                        break;
                                    case 2:
                                        cpelo = "cafe";
                                        break;
                                    case 3:
                                        cpelo = "rubio";
                                        break;
                                    default:
                                }
                            }
                            raza = "";
                            ropc = 0;
                            while (ropc != 1 && ropc != 2 && ropc != 3 && ropc != 4) {
                                System.out.println("Desea que su raza sea: ");
                                System.out.println("1) Hobbit");
                                System.out.println("2) elfo");
                                System.out.println("3) humano");
                                System.out.println("4) enano");
                                System.out.println("Ingrese su opcion: ");
                                ropc = sc.nextInt();
                                switch (ropc) {
                                    case 1:
                                        raza = "Hobbit";
                                        break;
                                    case 2:
                                        raza = "elfo";
                                        break;
                                    case 3:
                                        raza = "Humano";
                                        break;
                                    case 4:
                                        raza = "enano";
                                        break;
                                    default:
                                }
                            }
                            
                            break;
                        default:

                    }
                    break;
                default:

            }
        }

    }

}
