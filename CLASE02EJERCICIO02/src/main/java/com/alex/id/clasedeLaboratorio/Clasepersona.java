/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio;

import java.util.Scanner;

/**
 *
 * @author Garcia
 */
public class Clasepersona {

    public Clasepersona(int Nombre, int Edad, int Sexo, int Hombre, int Mujer) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Hombre = Hombre;
        this.Mujer = Mujer;

    }

    private int Nombre;
    private int Edad;
    private int Sexo, Hombre, Mujer;
    private int Peso;
    private int Altura;

    public Clasepersona(int Nombre, int Edad, int Sexo, int Hombre, int Mujer, int Peso, int Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Hombre = Hombre;
        this.Mujer = Mujer;
        this.Peso = Peso;
        this.Altura = Altura;

    }

// Los datos correspondiente a la clase persona
    public void setEdad(int Edad) {
        this.Edad = Edad;

    }

    public String esMayorDeEdad() {
        int edad = this.Edad;
        if (Edad < 18) {
            return "Eres menor de Edad";
        } else {
            return "Eres mayor de Edad";
        }

    }
}
////    private static class Scanner {
//public static void main (String[]args)
//t
//public Scanner(System.in);
////        static {
//            Scanner tem = new Scarnner(System.in);
//            System.out.println("ESCRIBE TU NOMBRE");
//            System.out.println("ESCRIBE TU EDAD");
//            System.out.println("ESCRIBE TU GENERO H,HOMBRE O M,MUJER");
//            System.out.println("ESCRIBE TU PESO");
//            System.out.println("ESCRIBE TU ALTURA");
//
//        }

//    }
//
//// }

