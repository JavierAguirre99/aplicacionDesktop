package Modelo;

public class Factura {
    private String apellido;
    private String nombre;
    private String direccion;
    private int dpi;
    private int nit;
    private String fecha_contratacion;
    private String fecha_renovacion;
    private String nombrePaquete;
    private String Tiposervicio;
    private int precioVenta;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
        
    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }

    public String getTiposervicio() {
        return Tiposervicio;
    }

    public void setTiposervicio(String Tiposervicio) {
        this.Tiposervicio = Tiposervicio;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }       

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getFecha_contratacion() {
        return fecha_contratacion;
    }

    public void setFecha_contratacion(String fecha_contratacion) {
        this.fecha_contratacion = fecha_contratacion;
    }

    public String getFecha_renovacion() {
        return fecha_renovacion;
    }

    public void setFecha_renovacion(String fecha_renovacion) {
        this.fecha_renovacion = fecha_renovacion;
    }
    
    
    
    
}
