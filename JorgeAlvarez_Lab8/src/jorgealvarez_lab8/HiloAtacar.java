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
public class HiloAtacar extends Thread {

    private Hada h1;
    private Hada h2;

    @Override
    public void run() {
        while (h1.getSalud()>0&&h2.getSalud()>0) {
            h1.ataque(h2);
        }
    }

    public HiloAtacar(Hada h1, Hada h2) {
        this.h1 = h1;
        this.h2 = h2;
    }

    public Hada getH1() {
        return h1;
    }

    public void setH1(Hada h1) {
        this.h1 = h1;
    }

    public Hada getH2() {
        return h2;
    }

    public void setH2(Hada h2) {
        this.h2 = h2;
    }

    @Override
    public String toString() {
        return "HiloAtacar{" + "h1=" + h1 + ", h2=" + h2 + '}';
    }

}
