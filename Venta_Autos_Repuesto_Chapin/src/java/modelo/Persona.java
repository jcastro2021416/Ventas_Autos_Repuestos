
package modelo;

public class Persona {
    int DNI;
    String nombres;
    String apellidos;
    String direccion;
    String telefono;
    
    public Persona() {
        
    }
    
    public Persona(int id, String nom, String correo) {
       this.DNI = DNI;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.direccion = direccion;
       this.telefono = telefono;
       
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

  
    
    
    
}
