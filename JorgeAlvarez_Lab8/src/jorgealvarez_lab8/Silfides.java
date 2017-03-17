/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgealvarez_lab8;

/**
 *
 * @author ofici
 */
public class Silfides extends Hada {

    private int CantidadDeAlas;

    public Silfides() {
        this.Salud = 563;
        this.Poder = 67;
    }

    public Silfides(int CantidadDeAlas, String Nombre, float Altura, int Edad, float Poder, float Salud) {
        super(Nombre, Altura, Edad, Poder, Salud);
        this.CantidadDeAlas = CantidadDeAlas;
    }

    public Silfides(int CantidadDeAlas, String Nombre, float Altura, int Edad, float Poder) {
        super(Nombre, Altura, Edad, Poder);
        this.CantidadDeAlas = CantidadDeAlas;
    }

    public int getCantidadDeAlas() {
        return CantidadDeAlas;
    }

    public void setCantidadDeAlas(int CantidadDeAlas) {
        if (CantidadDeAlas > 6) {
            this.CantidadDeAlas = CantidadDeAlas;
        }
    }

    @Override
    public String toString() {
        return "Silfides{" + "CantidadDeAlas=" + CantidadDeAlas + '}';
    }

    @Override
    public Hada ataque(Hada Enemigo) {
        if (Enemigo instanceof Salamandra) {
            Enemigo.setSalud((float) (Enemigo.getSalud() - this.Poder * 1.37));
        } else {
            Enemigo.setSalud((float) (Enemigo.getSalud() - this.Poder));
        }
        return Enemigo;
    }
}
