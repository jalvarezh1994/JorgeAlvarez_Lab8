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
public class Hamadriades extends Hada {

    private float SaludDelArbol = 173;

    public Hamadriades() {
        this.Salud = 373 + SaludDelArbol;
    }

    public float getSaludDelArbol() {
        return SaludDelArbol;
    }

    public void setSaludDelArbol(float SaludDelArbol) {
        this.SaludDelArbol = SaludDelArbol;
    }

    @Override
    public String toString() {
        return "Hamadriades{" + "SaludDelArbol=" + SaludDelArbol + '}';
    }

    @Override
    public Hada ataque(Hada Enemigo) {
        Enemigo.setSalud((float) (Enemigo.getSalud() - this.Poder));
        return Enemigo;
    }

}
