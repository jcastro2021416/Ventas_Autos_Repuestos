package modelo;

public class Vehiculo {
    
    private int idVehiculos;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private int codCliente;

    public Vehiculo() {
    }

    public Vehiculo(int idVehiculos, String matricula, String marca, String modelo, String color, int codCliente) {
        this.idVehiculos = idVehiculos;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.codCliente = codCliente;
    }

    public int getIdVehiculos() {
        return idVehiculos;
    }

    public void setIdVehiculos(int idVehiculos) {
        this.idVehiculos = idVehiculos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }
    
}
