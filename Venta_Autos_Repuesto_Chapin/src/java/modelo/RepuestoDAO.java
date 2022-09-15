package modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepuestoDAO {
    Conexion conect = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    //@Override
    public List listar() {
        ArrayList<Repuesto> listaRepuesto = new ArrayList<>();
        String sql = "select * from Repuestos";
        try{
            con = conect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Repuesto nuevoRepuesto = new Repuesto();
                nuevoRepuesto.setIdProveedores(rs.getInt("idProveedores"));
                nuevoRepuesto.setIdRepuestos(rs.getInt("idRepuestos"));
                nuevoRepuesto.setNombre(rs.getString("nombre"));
                nuevoRepuesto.setPrecio(rs.getDouble("precio"));
                nuevoRepuesto.setStock(rs.getString("stock"));
                listaRepuesto.add(nuevoRepuesto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaRepuesto;
    }
}