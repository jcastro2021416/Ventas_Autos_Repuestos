
package modelo;

public class Persona {
    int id;
    String nom;
    String usuario;
    
    public Persona() {
        
    }
    
    public Persona(int id, String nom, String correo) {
       this.id = id;
       this.nom = nom;
       this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
}
