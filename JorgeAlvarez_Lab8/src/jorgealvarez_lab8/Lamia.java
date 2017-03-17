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
public class Lamia extends Hada {

    private float LongitudAleta;
    private int NumeroDeBranquias;

    public Lamia() {
        this.Salud = 475;
        this.Poder = 57;
    }

    public Lamia(float LongitudAleta, int NumeroDeBranquias, String Nombre, float Altura, int Edad, float Poder) {
        super(Nombre, Altura, Edad, Poder);
        this.LongitudAleta = LongitudAleta;
        this.NumeroDeBranquias = NumeroDeBranquias;
    }

    public float getLongitudAleta() {
        return LongitudAleta;
    }

    public void setLongitudAleta(float LongitudAleta) {
        if (LongitudAleta <= 5) {
            this.LongitudAleta = LongitudAleta;
        }
    }

    public int getNumeroDeBranquias() {
        return NumeroDeBranquias;
    }

    public void setNumeroDeBranquias(int NumeroDeBranquias) {
        if (NumeroDeBranquias<=8) {
            this.NumeroDeBranquias = NumeroDeBranquias;
        }
    }

    @Override
    public String toString() {
        return "Lamia{" + "LongitudAleta=" + LongitudAleta + ", NumeroDeBranquias=" + NumeroDeBranquias + ", Salud=" + Salud + ", Poder=" + Poder + '}';
    }

    @Override
    public Hada ataque(Hada Enemigo) {
        if (Enemigo instanceof Salamandra) {
            Enemigo.setSalud((float) (Enemigo.getSalud() - this.Poder * 1.42));
        } else {
            Enemigo.setSalud((float) (Enemigo.getSalud() - this.Poder));
        }
        return Enemigo;
    }

}
