/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensupletorio;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ESFOT
 */
public class ClsControlador {
    public void crearFichero(String nombreFichero) {
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(nombreFichero));
            oos.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void escribirFichero(String nombreFichero, ArrayList<Object> elementos) {

        try {
            ObjectOutputStream oos;
            oos = new ObjectOutputStream(new FileOutputStream(nombreFichero));
            for (int i = 0; i < elementos.size(); i++) {
                Object elemento = new Object();
                elemento = elementos.get(i);
                oos.writeObject(elemento);
            }
            oos.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public ArrayList<Object> extraerFichero(String nombreFichero) {

        ArrayList<Object> elementos = new ArrayList<>();
        try {
            ObjectInputStream ois;
            ois = new ObjectInputStream(new FileInputStream(nombreFichero));
            Object aux = ois.readObject();
            while (aux != null) {
                elementos.add(aux);
                aux = ois.readObject();
            }
            ois.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (EOFException e1) {
            //JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
        }

        return elementos;
    
 }
     }