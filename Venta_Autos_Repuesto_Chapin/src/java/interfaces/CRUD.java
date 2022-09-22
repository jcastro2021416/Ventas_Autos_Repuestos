
package interfaces;

import java.util.List;
import modelo.Cliente;
import modelo.Repuestos;
import modelo.Vehiculos;


public interface CRUD {
    public List listar();
    public Repuestos lis(int id);
    public boolean add(Repuestos veh);
   
    public Vehiculos list(int id);
    public boolean add(Vehiculos veh);
    
    public Cliente lista(int id);
    public boolean add(Cliente clie);
    
}
