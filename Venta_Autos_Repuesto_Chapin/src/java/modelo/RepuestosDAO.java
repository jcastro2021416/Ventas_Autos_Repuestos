
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class RepuestosDAO {
    Conexion conect = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Repuestos nRepuestos = new Repuestos();
    
    
    
    public List listar (){
      ArrayList<Repuestos> listaRepuestos = new ArrayList<>();
      String sql = "Select * from Repuestos";
      try{
          con = conect.Conexion();
          ps = con.prepareStatement(sql);
          rs = ps.executeQuery();
          while (rs.next()){
              Repuestos nuevoRepuestos = new Repuestos();
              nuevoRepuestos.setIdRepuestos(rs.getInt("idRepuestos"));
              nuevoRepuestos.setNombre(rs.getString("nombre"));
              nuevoRepuestos.setStock(rs.getString("stock"));
              nuevoRepuestos.setPrecio(rs.getDouble("precio"));
              nuevoRepuestos.setIdProveedores(rs.getInt("idProveedores"));
          }
      
      }catch (Exception e){
          e.printStackTrace(); 
      }
        return null;
      
      }
     
    public boolean add(Repuestos rep){
        String sql = "insert into Repuestos(idRepuestos, nombre, stock, precio, idProveedorees) values('"+rep.getIdRepuestos()+"','"+rep.getNombre()+"','"+rep.getStock()+"','"+rep.getPrecio()+"','"+rep.getIdProveedores()+"')";
        try{
        con = conect.Conexion();
        ps = con.prepareStatement(sql);
        ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
        
    }
   
} 




