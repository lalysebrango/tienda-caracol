package modelos;


import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mia
 */
public class Venta {
    private String IDventa;
    private List<Articulo> articulos ;
    private Date fechadeventa;
    private boolean estadoDeVenta;

  
    
    public Venta(String IDventa, Date fechadeventa) {
        this.IDventa = IDventa;
        this.fechadeventa = fechadeventa;
    }
      public boolean isEstadoDeVenta() {
        return estadoDeVenta;
    }

    public void setEstadoDeVenta(boolean estadoDeVenta) {
        this.estadoDeVenta = estadoDeVenta;
    }
    public String getIDventa() {
        return IDventa;
    }

    public void setIDventa(String IDventa) {
        this.IDventa = IDventa;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public Date getFechadeventa() {
        return fechadeventa;
    }

    public void setFechadeventa(Date fechadeventa) {
        this.fechadeventa = fechadeventa;
    }
}
 
    
 