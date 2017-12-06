
package Modelo;

import java.math.BigInteger;

/**
 *
 * @author Walter Caal
 */
public class InnerPersonaCliente {
    private int idCliente;
    private String nombreCliente;
    private int idCategoria;
    private String categoria;
    private int idEstado;
    private String estado;
    private int idTipoCliente;
    private String tipoCliente;
    private long dpiCliente;
    private String direccion;

    public InnerPersonaCliente() {
        this.nombreCliente = null;
        this.idCategoria = 0;
        this.categoria = null;
        this.idEstado = 0;
        this.estado = null;
        this.idTipoCliente = 0;
        this.tipoCliente = null;
    }

    public long getDpiCliente() {
        return dpiCliente;
    }

    public void setDpiCliente(long dpiCliente) {
        this.dpiCliente = dpiCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdTipoCliente() {
        return idTipoCliente;
    }

    public void setIdTipoCliente(int idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
}
