/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
//     System.out.println("HOLA");

        libros ObjetoLibro1 = new Libros(1, "PROGRAMACIÓN JAVA", 100, "DEITEL");
        libros ObjetoLibro2 = new Libros(2, "PROGRAMACIÓN PHP", 60, "DEITEL");

//         System.out.println(Libro.toString());
        if (ObjetoLibro1.getNumeroPaginas() < ObjetoLibro2.getNumeroPaginas()) {
            System.out.println("El Libro 2 es mayor que el libro 1");
        }
    }

    
        else {
           System.out.println("El Libro 1 es mayor que el libro 2")
    
;
