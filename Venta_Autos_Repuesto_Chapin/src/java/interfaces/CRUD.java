/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelo.Factura;

/**
 *
 * @author informatica
 */
public interface CRUD {
    public List listar();
    public Factura list(int id);
    public boolean add(Factura  fac);
    public boolean edit(Factura fac); 
    
}
