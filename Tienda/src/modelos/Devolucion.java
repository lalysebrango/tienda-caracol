package modelos;


import modelos.Venta;
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
public class Devolucion {
     
    private String IDdevolucion;
    private Date fechadevolucion;
    private List<Venta> ventas ;
   


   
    public Devolucion( String IDdevolucion, Date fechadevolucion) {
        
        this.IDdevolucion = IDdevolucion;
        this.fechadevolucion = fechadevolucion;
    }
    


    public String getIDdevolucion() {
        return IDdevolucion;
    }

    public void setIDdevolucion(String IDdevolucion) {
        this.IDdevolucion = IDdevolucion;
    }

    public Date getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(Date fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }
    public void addVentas( Venta v){
        ventas.add(v);
     }
     public int cantidadDevuelto(){
         int contador=0;
         for (int i =0; i<ventas.size(); i++ )
             if(ventas.get(i).isEstadoDeVenta())
                 ++contador;
        return contador ;
     }
      public void actualizarInventario(boolean estadoActualizado, int posicion){
         Articulo a= new Articulo(estadoActualizado);
            for (Venta v: ventas)
                if(!v.isEstadoDeVenta())
                    a.setEstado(estadoActualizado);
}
   
}
     
    

