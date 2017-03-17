package jorgealvarez_lab8;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AdminHadas {

    private ArrayList listaHadas = new ArrayList();
    private File archivo = null;

    public AdminHadas() {
    }

    public AdminHadas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Hada> getListaHadas() {
        return listaHadas;
    }

    public void setListaHadas(ArrayList<Hada> listaHadas) {
        this.listaHadas = listaHadas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void addHada(Hada a) {
        listaHadas.add(a);
    }

    @Override
    public String toString() {
        return "listaHadas=" + listaHadas + ", archivo=" + archivo + '}';
    }

    public void cargarArchivoBinario() {//pasar del rom al ram!
        try {
            listaHadas = new ArrayList();

            Hada temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);

                try {
                    while ((temp = (Hada) objeto.readObject()) != null) {//simpre lanzara un exception
                        listaHadas.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final el archivo
                }
                objeto.close();
                entrada.close();

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //Google traduce//algotitmo para reconocer patrones

    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;

        try {

            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Object t : listaHadas) {
                bw.writeObject(t);
            }
            bw.flush();

        } catch (Exception ex) {
        } finally {

            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }

    }

}
