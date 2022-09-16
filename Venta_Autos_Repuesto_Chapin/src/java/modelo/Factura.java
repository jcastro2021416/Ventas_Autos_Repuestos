/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author juani
 */
public class Factura {
    private int idFactura;
    private String fechaFactura;
    private double totalFactura;
    private int codCliente;

    public Factura() {
    }

    public Factura(int idFactura, String fechaFactura, double totalFactura, int codCliente) {
        this.idFactura = idFactura;
        this.fechaFactura = fechaFactura;
        this.totalFactura = totalFactura;
        this.codCliente = codCliente;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }
 
}
