/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgealvarez_lab8;

import javafx.scene.control.ProgressBar;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.plaf.ProgressBarUI;
import static jorgealvarez_lab8.Principal.Hadas;

/**
 *
 * @author ofici
 */
public class HiloPb extends Thread {

    private Hada h1, h2;
    private JProgressBar b1, b2;

    @Override
    public void run() {
        b1.setMaximum((int) h1.getSalud());
        b2.setMaximum((int) h2.getSalud());

        while (h1.getSalud() > 0 && h2.getSalud() > 0) {
            b1.setValue((int) h1.getSalud());
            b2.setValue((int) h2.getSalud());
        }
        if (h1.getSalud()>0) {
            JOptionPane.showMessageDialog(null, "El ganador es el hada 1");
        }else 
        if (h2.getSalud()>0) {
            JOptionPane.showMessageDialog(null, "El ganador es el hada 2");
        }else if (h1.getSalud()==h2.getSalud()) {
            JOptionPane.showMessageDialog(null, "Hubo un empate");
        }
    }

    public HiloPb(Hada h1, Hada h2, JProgressBar b1, JProgressBar b2) {
        this.h1 = h1;
        this.h2 = h2;
        this.b1 = b1;
        this.b2 = b2;
    }

}
