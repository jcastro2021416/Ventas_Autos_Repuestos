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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arles
 */
public class ClienteDAO {
    Conexion conect = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    
    public List lsitar(){
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        String sql = "Select * from Clientes";
        try{
              con = conect.Conexion();
              ps = con.prepareStatement(sql);
              rs = ps.executeQuery();
              while(rs.next()){
                  Cliente nuevoClente = new Cliente();
                  nuevoClente.setCodCliente(rs.getInt("codCliente"));
                  nuevoClente.setNIT(rs.getInt("NIT"));
                  nuevoClente.setApellidos(rs.getString("apellidos"));
                  nuevoClente.setNombres(rs.getString("nombres"));
                  nuevoClente.setDireccion(rs.getString("direccion"));
                  nuevoClente.setTelefono(rs.getString("telefono"));
              }
        }catch(Exception e){
            e.printStackTrace();
        }    
        return listaClientes;
    }
}
