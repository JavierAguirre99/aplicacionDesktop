
package Modelo;


public class cliente {
    
    private int idCliente;
    private int telefono;
    private String email;
    private String direccion;

    public cliente() {
        this.idCliente = 0;
        this.telefono = 0;
        this.email = null;
        this.direccion = null;
    }


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
