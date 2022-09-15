package modelo;

public class Repuesto {
    
    private int idRepuestos;
    private String nombre;
    private String stock;
    private double precio;
    private int idProveedores;

    public Repuesto() {
    }

    public Repuesto(int idRepuestos, String nombre, String stock, double precio, int idProveedores) {
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProveedores() {
        return idProveedores;
    }

    public void setIdProveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }
    
}
