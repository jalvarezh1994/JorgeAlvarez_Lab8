/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgealvarez_lab8;

import java.io.Serializable;

/**
 *
 * @author ofici
 */
public abstract class Hada implements Serializable {

    protected String Nombre;
    protected float Altura;
    protected int Edad;
    protected float Poder;
    protected float Salud;

    public Hada() {
    }

    public Hada(String Nombre, float Altura, int Edad, float Poder, float Salud) {
        this.Nombre = Nombre;
        this.Altura = Altura;
        this.Edad = Edad;
        this.Poder = Poder;
        this.Salud = Salud;
    }

    public Hada(String Nombre, float Altura, int Edad, float Poder) {
        this.Nombre = Nombre;
        this.Altura = Altura;
        this.Edad = Edad;
        this.Poder = Poder;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        if (Altura <= 15) {
            this.Altura = Altura;
        } else {
        }
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public float getPoder() {
        return Poder;
    }

    public void setPoder(float Poder) {
        this.Poder = Poder;
    }

    public float getSalud() {
        return Salud;
    }

    public void setSalud(float Salud) {
        this.Salud = Salud;
    }

    public abstract Hada ataque(Hada Enemigo);

    @Override
    public String toString() {
        return "Nombre=" + Nombre + ", Altura=" + Altura + ", Edad=" + Edad + ", Poder=" + Poder;
    }

}
