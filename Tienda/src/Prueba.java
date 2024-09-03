
import modelos.Articulo;

import modelos.Venta;
import modelos.Tienda;
import java.util.ArrayList;
import java.util.Date;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mia
 */
public class Prueba {
      public static void main(String[] args) {
          
           Tienda t= new Tienda(new ArrayList<>());
                   
           
            t.addArticulos(new Articulo(1, "Chaqueta", "Zara"));
            t.addArticulos(new Articulo(2, "Chaqueta", "Zara"));
            t.addArticulos(new Articulo(3, "Blusa", "Zara"));
            t.addArticulos(new Articulo(4, "Blusa", "Zara"));
            System.out.println(t.busqueda("Blusa"));
            System.out.println(t.inventario("Chaqueta"));
           
           t.actualizarEstadoArticulo(true, 1);
           System.out.println(t.getArticulos());  
           System.out.println(t.cantidadVendida());
           
           
          
        
      
        
             
}
}
