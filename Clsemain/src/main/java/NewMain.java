/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;
import java.util.Scanner;
/**
 *
 * @author Garcia
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner tem = new Scanner (System.in);
        String Nombre;
        int Edad;
        int Sexo;
        String Peso;
        String Altura;
        System.out.println("INGRESE SU NOMBRE");
        Nombre = tem.nextLine();
        System.out.println("INGRESE SU EDAD");
        Edad = tem.nextInt();
        System.out.println("INGRESE SU GENERO,M,MUJER,H,HOMBRE");
        Sexo = tem.nextInt();
        System.out.println("INGRESE SU PESO");
        Peso = tem.nextLine();
        System.out.println("INGRESE SU ALTURA");
        Altura = tem.nextLine();
                 
                 

        
        
        
        
        
    }
    
    
}
