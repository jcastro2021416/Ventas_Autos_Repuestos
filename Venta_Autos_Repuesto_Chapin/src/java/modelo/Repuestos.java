/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Repuestos {
    private int idRepuestos;
    private String nombre;
    private String stock;
    private Double precio;
    private int idProveedores;

    public Repuestos() {
    }

    public Repuestos(int idRepuestos, String nombre, String stock, Double precio, int idProveedores) {
        this.idRepuestos = idRepuestos;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.idProveedores = idProveedores;
    }

    public int getIdRepuestos() {
        return idRepuestos;
    }

    public void setIdRepuestos(int idRepuestos) {
        this.idRepuestos = idRepuestos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getIdProveedores() {
        return idProveedores;
    }

    public void setIdProveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }
    
    
    
    


}
