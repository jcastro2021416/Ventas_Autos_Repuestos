/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author juani
 */
public class FacturaDAO {
    Conexion conect = new Conexion();
    Connection con;
    PreparedStatement ps; 
    ResultSet rs;
    Factura nFactura = new Factura();
    
    
    
}
