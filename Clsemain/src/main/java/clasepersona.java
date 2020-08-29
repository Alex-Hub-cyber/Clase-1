/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Garcia
 */
public class clasepersona {

    private int Nombre;
    private int Edad;
    private int Sexo, Hombre, Mujer;
    private int Peso;
    private int Altura;

    public clasepersona(int Nombre, int Edad, int Sexo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }

    public clasepersona(int Nombre, int Edad, int Sexo, int Hombre, int Mujer, int Peso, int Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Hombre = Hombre;
        this.Mujer = Mujer;
        this.Peso = Peso;
        this.Altura = Altura;
    }

//    Los datos correspondiente a la clase persona
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

    public int getNombre() {
        return Nombre;
    }

    public void setNombre(int Nombre) {
        this.Nombre = Nombre;
    }

    public int getSexo() {
        return Sexo;
    }

    public void setSexo(int Sexo) {
        this.Sexo = Sexo;
    }

    public int getHombre() {
        return Hombre;
    }

    public void setHombre(int Hombre) {
        this.Hombre = Hombre;
    }

    public int getMujer() {
        return Mujer;
    }

    public void setMujer(int Mujer) {}
    {this.Mujer = Mujer;}
        
    }