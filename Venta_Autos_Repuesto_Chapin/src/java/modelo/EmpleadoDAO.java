
package modelo;

import com.mysql.jdbc.Connection;
import config.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class EmpleadoDAO {
        Conexion cn = new Conexion();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        
        
        public Empleado validar(String usuario, String idEmpleados){
            //Objeto de la cantidad empleado
            Empleado empleado = new Empleado();
            //Consulta SQL
            String sql ="Select * from Empleado where usuario= ? and idEmpleados = ?";
            try{
                ps = con.prepareStatement(sql);
                ps.setString(1, usuario);
                ps.setString(2, idEmpleados);
                rs = ps.executeQuery();
                while(rs.next()){
                    empleado.setIdEmpleados(rs.getInt("codigoEmpleado"));
                    empleado.setDNI(rs.getString("idEmpleados"));
                    empleado.setNombres(rs.getString("nombresEmpleado"));
                    empleado.setApellidos(rs.getString("usuario"));
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
            
         
            return empleado; //empleado encontrado
        }
                 
}
