package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection conexion;
    
    public Connection Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBVenta_Autos_Repuesto_Chapin?useSSL=false", "root", "1234");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se pudo establecer la Conexión");
        }
        return conexion;
    }  
}