/*
 * To change this license heder, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import com.alex.clase22.Libros;

/**
 *
 * @author Garcia
 */
public class ClaseInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("HOLA");
//          System.out.println(Libro.toString());
//        System.out.println(ObjetoLibro2.getNumeroPaginas());

        Libros ObjetoLibro1 = new Libros(1, "PROGRAMACION JAVA ", 100, "DEITE");
        Libros ObjetoLibro2 = new Libros(2, "PROGRAMACION PHP ", 600, "DEITE");

        Objetolibro1.setNumeroPaginas(600);
//        
//            
        if (ObjetoLibro1.getNumeroPaginas() < ObjetoLibro2.getNumeroPaginas()) {
            System.out.println("El libro 2 es mayor que el libro 1" + ObjetoLibro2.getNumeroPaginas());
            System.out.println("La informacion del libro 2 es " + ObjetoLibro2.toString());
        } else {
            System.out.println("El libro 1 es mayor que el libro 2" + ObjetoLibro1.getNumeroPaginas());
            System.out.println("La informacion del libro 1 es " + ObjetoLibro1.toString());
        }

    }
