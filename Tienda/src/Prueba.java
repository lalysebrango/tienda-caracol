
import modelos.Articulo;
import modelos.Devolucion;
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
                   
           
            t.addArticulos(new Articulo("125", "Chaqueta", "Zara"));
            t.addArticulos(new Articulo("124", "Chaqueta", "Zara"));
            t.addArticulos(new Articulo("128", "Blusa", "Zara"));
            t.addArticulos(new Articulo("129", "Blusa", "Zara"));
            System.out.println(t.busqueda("Blusa"));
            System.out.println(t.inventario("Chaqueta"));
           
           t.actualizarEstadoArticulo(true, 1);
           System.out.println(t.getArticulos());  
           System.out.println(t.cantidadVendida());
           
           
           Devolucion v= new Devolucion("", null);
            v.addVentas(new Venta("", null));
            v.addVentas(new Venta("", null));
             System.out.println();
        
      
        
             
}
}
