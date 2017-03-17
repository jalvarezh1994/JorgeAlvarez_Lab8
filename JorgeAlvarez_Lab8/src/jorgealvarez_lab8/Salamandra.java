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
public class Salamandra extends Hada{
    private int CantidadDeAlas;

    public Salamandra() {
        this.Salud=683;
        this.Poder=71;
    }

    public Salamandra(int CantidadDeAlas) {
        this.CantidadDeAlas = CantidadDeAlas;
    }

    public Salamandra(int CantidadDeAlas, String Nombre, float Altura, int Edad, float Poder, float Salud) {
        super(Nombre, Altura, Edad, Poder, Salud);
        this.CantidadDeAlas = CantidadDeAlas;
    }

    public Salamandra(int CantidadDeAlas, String Nombre, float Altura, int Edad, float Poder) {
        super(Nombre, Altura, Edad, Poder);
        this.CantidadDeAlas = CantidadDeAlas;
    }
    
    @Override
    public Hada ataque(Hada Enemigo) {
        if (Enemigo instanceof Hamadriades) {
            Enemigo.setSalud((float) (Enemigo.getSalud() - this.Poder*1.37));
        }else{
            Enemigo.setSalud((float) (Enemigo.getSalud() - this.Poder));
        }
        return Enemigo;
    }
    
}
