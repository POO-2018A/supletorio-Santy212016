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
public class ClsComputador extends ClsProducto implements Serializable{
    
    private String tipo;
    private int almacenamiento;
    private int ram;
    private String procesador;

    public ClsComputador() {
    }


  public ClsComputador(String nombre, double precio, String marca, String categoria, String tipo, int almacenamiento, int ram, String procesador) {
        super(nombre, precio, marca, categoria);
        this.tipo = tipo;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.procesador = procesador;
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    
    
    
    
}
