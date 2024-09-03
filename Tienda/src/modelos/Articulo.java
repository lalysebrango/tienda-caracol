package modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mia
 */
public class Articulo {
     private int ID;
     private String nombre;
     private String categoria;
     private boolean estado;

    public Articulo(int ID, String nombre, String categoria) {
        this.ID = ID;
        this.nombre = nombre;
        this.categoria = categoria;
        
    }

    //* true-->vendido   false-->disponible*//
    public Articulo(boolean estado) {
        this.estado = true;
    }
    

    public boolean isEstado() {
        return estado;
    }

    public int  getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
     public double precio(double precio){
         return precio;
     }
   
   }    

