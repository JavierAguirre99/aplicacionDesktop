package Modelo;
public class Paquetes {
    private int id_paquete;
    private String nombre;
    private String Descripcion;
    private int id_tiposervicio;
    private int costo;
    private int precioventa;

    public int getId_paquete() {
        return id_paquete;
    }

    public void setId_paquete(int id_paquete) {
        this.id_paquete = id_paquete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getId_tiposervicio() {
        return id_tiposervicio;
    }

    public void setId_tiposervicio(int id_tiposervicio) {
        this.id_tiposervicio = id_tiposervicio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(int precioventa) {
        this.precioventa = precioventa;
    }
}
