/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensupletorio.Categorias;

import examensupletorio.ClsProducto;
import java.io.Serializable;

/**
 *
 * @author ESFOT
 */
public class ClsComponente extends ClsProducto implements Serializable{
    
    private int capacidad;
    private int velocidad;
    
    public ClsComponente() {
    }

    public ClsComponente(String nombre, double precio, String marca, String tipo, int capacidad, int velocidad) {
        super(nombre, precio, marca, tipo);
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }
    
    

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
    
    
    
}
