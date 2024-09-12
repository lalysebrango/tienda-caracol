/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelos;

/**
 *
 * @author Doralis
 */
public class Articulo {
    private String idArticulo;
    private String nombre;
    private String categoria;
    private double precio;
    private int inventario;

    public Articulo(String idArticulo, String nombre, String categoria, Double precio, int inventario) {
        this.idArticulo = idArticulo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.inventario = inventario;
    }

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    

    public String getIdArticulo() {
        return idArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getInventario() {
        return inventario;
    }

    public void setIdArticulo(String idArticulo) {
        this.idArticulo = idArticulo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }
    
   @Override
     public String toString() {
        return nombre;
    }
 }
