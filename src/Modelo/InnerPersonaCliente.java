
package Modelo;

/**
 *
 * @author Walter Caal
 */
public class InnerPersonaCliente {
    private String nombreCliente;
    private int idCliente;
    
    public void InnerPersonaCliente(){
        nombreCliente = null;
        idCliente =0;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
}
