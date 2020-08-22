/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.id.clase02ejercicio02;

/**
 *
 * @author Garcia
 */
public class Clasepersona {
    
    protected String Nombre,Direccion,FechaNacimiento,Genero;
    protected int Edad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Clasepersona{" + "Nombre=" + Nombre + ", Direccion=" + Direccion + ", FechaNacimiento=" + FechaNacimiento + ", Genero=" + Genero + ", Edad=" + Edad + '}';
    }
    
    
    
}
