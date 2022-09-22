
package modelo;


import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonaDAO{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

  public Persona validar(String nombres, String DNI){
        Persona persona = new Persona();
        String sql ="select * from empleados where nombres = ? and DNI = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombres);
            ps.setString(2, DNI);
            rs = ps.executeQuery();
            while(rs.next()){
                persona.setIdEmpleados(rs.getInt("idEmpleados"));
                persona.setDNI(rs.getString("DNI"));
                persona.setNombres(rs.getString("Nombres"));
                persona.setApellidos(rs.getString("Apellidos"));
            }
                    
        }catch(Exception e){
         e.printStackTrace();
        }
        return persona;   
        
    }
       
}
 

 
    
        
   
