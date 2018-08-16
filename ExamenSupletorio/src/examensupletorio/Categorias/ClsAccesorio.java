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
public class ClsAccesorio extends ClsProducto implements Serializable{
    
    private String color;
    
    public ClsAccesorio() {
    }

    public ClsAccesorio(String nombre, double precio, String marca, String tipo, String color) {
        super(nombre, precio, marca, tipo);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
