package Modelo;

public class ConsultaDeServicios {
    private int id_contratacion;
    
    private String nombre;
    private String apellido;
    private String direccion;    
    private String nom_paquete;
    private String tipo_servicio;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
        
    public int getId_contratacion() {
        return id_contratacion;
    }

    public void setId_contratacion(int id_contratacion) {
        this.id_contratacion = id_contratacion;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public String getNom_paquete() {
        return nom_paquete;
    }

    public void setNom_paquete(String nom_paquete) {
        this.nom_paquete = nom_paquete;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }
    
    

}
