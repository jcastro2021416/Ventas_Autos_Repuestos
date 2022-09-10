
package modelo;
 
public class Empleado {
 // AÑADIR TODOS LOS ATRIBUTOS, PONER CONSTRUCTOR Y GETTER AND SETTER   
    
        private int idEmpleados;
        private String DNI;
        private String nombres;
        private String apellidos;
        private String direccion;
        private String telefono;
        private int tipoEmpleado;
        private String idReparaciones;

    public Empleado() {
    }

    public Empleado(int idEmpleados, String DNI, String nombres, String apellidos, String direccion, String telefono, int tipoEmpleado, String idReparaciones) {
        this.idEmpleados = idEmpleados;
        this.DNI = DNI;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipoEmpleado = tipoEmpleado;
        this.idReparaciones = idReparaciones;
    }

    public int getIdEmpleados() {
        return idEmpleados;
    }

    public void setIdEmpleados(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
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

    public int getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(int tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getIdReparaciones() {
        return idReparaciones;
    }

    public void setIdReparaciones(String idReparaciones) {
        this.idReparaciones = idReparaciones;
    }
        
        
}
