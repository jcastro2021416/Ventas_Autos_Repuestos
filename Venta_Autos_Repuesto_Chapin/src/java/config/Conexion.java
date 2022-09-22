package Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection conexion;
    
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBVenta_Autos_Repuesto_Chapin?useSSL=false", "root", "contraseña");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("La conexiòn no se puede establecer" + e.getMessage());
        }
    }
    
    public Connection getConnection(){
        return conexion;
    }
}