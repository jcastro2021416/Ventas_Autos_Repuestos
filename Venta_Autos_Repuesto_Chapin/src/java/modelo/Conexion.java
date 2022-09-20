
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con; 
    public Connection getConnection(){
        try {
            Class.forName("con.mysql.jdbc.Drover");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DBVenta_Autos_Repuesto_Chapin","root","1234");
        }catch (Exception e) {  
        }
         return con;
     }  
}
    
    

