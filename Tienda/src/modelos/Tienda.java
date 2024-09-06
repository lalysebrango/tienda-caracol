/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Doralis
 */
public class Tienda {
    private List<Articulo>articulos;
    private List<Venta>ventas;

    public Tienda(List<Articulo> articulos, List<Venta> ventas) {
        this.articulos = articulos;
        this.ventas = ventas;
    }
     
    public void setVenta(List<Venta> venta) {
        this.ventas = venta;
    }

    public List<Venta> getVenta() {
        return ventas;
    }

    public Tienda() {
    }

    public List<Articulo> getArticulo() {
        return articulos;
    }

    public void setArticulo(List<Articulo> articulo) {
        this.articulos = articulo;
    }
  
    public boolean addArticulo(Articulo a){
      return articulos.add(a);
       } 
     public boolean addVenta(Venta v){
        return ventas.add(v);
     }
       
    public List<Articulo> busqueda (String nombre){
       List<Articulo> articulosencontrados = new ArrayList<>();
       for(int i=0;i<articulos.size();i++ ){
           if(nombre.equalsIgnoreCase(articulos.get(i).getNombre()))
               articulosencontrados.add(articulos.get(i));
      
         }
       return articulosencontrados;
    }
   
    public List<Venta> busquedaVenta(String idVenta){
         List<Venta> ventaEncontradas = new ArrayList();
         for(int i=0;i<ventas.size();i++){
             if(idVenta.equals(ventas.get(i).getIdVenta())){
                 ventaEncontradas.add(ventas.get(i));
                 }
         }
             return ventaEncontradas;
    }
    
    public Double Capital(){
       double sumatoria = 0 ;
       double precio = 0;
       for(Venta v : ventas){
           precio = v.getCantidadVendida()* v.getArticulo().get(0).getPrecio();
          sumatoria+=precio;       
       }
       return sumatoria;
   }
}
