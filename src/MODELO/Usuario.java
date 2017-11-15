package MODELO;


public class Usuario{

  private int id_usuario = 0;
  private String nombre = null;
  private String contrasena = null;
  private int tipo_usuario = 0;

  public Usuario() {
    id_usuario = 0;
    nombre = null;
    contrasena = null;
    tipo_usuario = 0;

  }

  public int getId_usuario() {
    return id_usuario;
  }

  public void setId_usuario(int id_usuario) {
    this.id_usuario = id_usuario;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getContrasena() {
    return contrasena;
  }

  public void setContrasena(String contraseña) {
    this.contrasena = contraseña;
  }

  public int getTipo_usuario() {
    return tipo_usuario;
  }

  public void setTipo_usuario(int tipo_usuario) {
    this.tipo_usuario = tipo_usuario;
  }

}
