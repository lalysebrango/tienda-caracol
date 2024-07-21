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
     private String ID;
     private String nombre;
     private String categoria;
     private boolean estado;

    public Articulo(String ID, String nombre, String categoria) {
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
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
        return "Articulo{" + "ID=" + ID + ", nombre=" + nombre + ", categoria=" + categoria + ", estado=" + estado + '}';
    }
     public double precio(double precio){
         return precio;
     }
   
   }    

