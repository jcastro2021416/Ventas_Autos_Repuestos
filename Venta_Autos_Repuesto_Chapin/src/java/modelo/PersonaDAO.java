
package modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonaDAO {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public Persona validar(Persona per) {
        Persona persona = new Persona();
       int r=0;
        String sql="Select * from persona where Nombre=? and Usuario=?";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, per.getNombres());
            ps.setString(2, per.getApellidos());
            ps.setString(3, per.getTelefono());
            rs=ps.executeQuery();
            while(rs.next()){
                r=r+1;
                per.setNombres(rs.getString("Nombres"));
                per.setApellidos(rs.getString("Apellidos"));
                per.setTelefono(rs.getString("Telefono"));   
            }
               
               
        }catch (Exception e) {
        e.printStackTrace();
        }
        return persona;   
        
    }
       
}
 

 
    
        
   
