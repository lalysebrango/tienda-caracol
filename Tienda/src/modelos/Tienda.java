package modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mia
 */
public class Tienda {

   private List<Articulo> articulos ;

    public Tienda(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

  
    public void addArticulos(Articulo a){
           articulos.add(a);
        
     }
    
    
    public List<Articulo> busqueda(String nombre ){
        List<Articulo> articulosencontados= new ArrayList<>();
             for (int i = 0;i<articulos.size();i++)
                 if (nombre.equalsIgnoreCase(articulos.get(i).getNombre()) )
                       articulosencontados.add(articulos.get(i));
             return articulosencontados;
             
    }
     public int inventario(String nombre){
         
         return busqueda(nombre).size();
     }
     public int cantidadVendida(){
         int cantidadvendida = 0;    
            for(int i=0;i< articulos.size();i++)
                if (articulos.get(i).isEstado())
                   ++cantidadvendida;
        return cantidadvendida;
     }
     
     public void actualizarEstadoArticulo(boolean estado, int posicion){
           Articulo a= articulos.get(posicion);
            a.setEstado(estado);
     }
  }
