package modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VehiculoDAO {
    Conexion conect = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    //@Override
    public List listar() {
        ArrayList<Vehiculo> listaVehiculo = new ArrayList<>();
        String sql = "select * from Vehiculos";
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Vehiculo nuevoVehiculo = new Vehiculo();
                nuevoVehiculo.setCodCliente(rs.getInt("codCliente"));
                nuevoVehiculo.setColor(rs.getString("color"));
                nuevoVehiculo.setIdVehiculos(rs.getInt("idVehiculos"));
                nuevoVehiculo.setMarca(rs.getString("marca"));
                nuevoVehiculo.setMatricula(rs.getString("matricula"));
                nuevoVehiculo.setModelo(rs.getString("modelo"));
                listaVehiculo.add(nuevoVehiculo);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaVehiculo;
    }
}