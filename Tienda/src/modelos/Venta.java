/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Doralis
 */
public class Venta {
    private String idVenta;
    private int cantidadVendida; 
    private Date fechaVenta;     
    private List<Articulo> articulo = new ArrayList<>(); 

    public String getIdVenta() {
        return idVenta;
    }

    public List<Articulo> getArticulo() {
        return articulo;
    }

    public void setArticulo(List<Articulo> articulo) {
        this.articulo = articulo;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }
    
    public boolean addArticulo(Articulo a){
       return articulo.add(a);
    }

    public Venta(String IDVenta,int cantidadVendida,Date fechaVenta) {
        this.idVenta = IDVenta;
        this.cantidadVendida = cantidadVendida;
        this.fechaVenta = fechaVenta;
    }

     public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public void setFechaVenta(Date fechaVenta) {
       this.fechaVenta = fechaVenta;
   }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    @Override
    public String toString() {
        return idVenta ;
    }
} 
