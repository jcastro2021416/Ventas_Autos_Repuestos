/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import config.Conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juani
 */
public class FacturaDAO implements CRUD{
    Conexion conect = new Conexion();
    Connection con;
    PreparedStatement ps; 
    ResultSet rs;
    Factura nFactura = new Factura();
    int idFactura;

    @Override
    public List listar() {
        ArrayList<Factura> listaFactura = new ArrayList<>();
        String sql = "select * from Factura";
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                Factura nuevaFactura = new Factura();
                nuevaFactura.setIdFactura(rs.getInt("idFactura"));
                nuevaFactura.setFechaFactura(rs.getString("fechaFactura"));
                nuevaFactura.setTotalFactura(rs.getDouble("totalFactura"));
                nuevaFactura.setCodCliente(rs.getInt("codCliente"));
                listaFactura.add(nuevaFactura);      
                  
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaFactura;
    }

    @Override
    public Factura list(int id) {
        String sql = "select * from Factura where idFactura = "+ id;
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                nFactura.setIdFactura(rs.getInt("idFactura"));
                nFactura.setFechaFactura(rs.getString("fechaFactura"));
                nFactura.setTotalFactura(rs.getDouble("totalFactura"));
                nFactura.setCodCliente(rs.getInt("codCliente"));
                
                
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return nFactura;
    }

    @Override
    public boolean add(Factura fac) {
        String sql = "insert into Factura(fechaFactura, totalFactura, codCliente) values('" + fac.getFechaFactura()+"','"+fac.getTotalFactura()+"','"+fac.getCodCliente()+"')";
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
       
    }

    @Override
    public boolean edit(Factura fac) {
        String sql = "update Factura set fechaFactura = '"+ fac.getFechaFactura()+"', totalFactura = '"+fac.getTotalFactura()+"', codCliente ='"+ fac.getCodCliente()+"' where idFactura ="+fac.getIdFactura();
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
        return false;
       
    }
    
    
    
}
