
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VehiculosDAO {
    Conexion conect = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Vehiculos nVehiculos = new Vehiculos();
    
    
    public List listar(){
        ArrayList<Vehiculos> listaVehiculos = new ArrayList<>();
        String sql = "select * from Vehiculos";
        try{
            con = conect.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Vehiculos nuevoVehiculos = new Vehiculos();
                nuevoVehiculos.setIdVehiculos(rs.getInt("idVehiculos"));
                nuevoVehiculos.setMatricula(rs.getString("matricula"));
                nuevoVehiculos.setMarca(rs.getString("marca"));
                nuevoVehiculos.setModelo(rs.getString("modelo"));
                nuevoVehiculos.setColor(rs.getString("color"));
                nuevoVehiculos.setCodCliente(rs.getInt("codCliente"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaVehiculos;
    }
   
    
    public boolean add(Vehiculos veh) {
        String sql = " insert into Vehiculos (idVehiculos, matricula, marca, modelo, color, codCliente)values('"+veh.getIdVehiculos()+"','"+veh.getMatricula()+"','"+veh.getMarca()+"','"+veh.getModelo()+"','"+veh.getColor()+"','"+veh.getCodCliente()+"')";
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
