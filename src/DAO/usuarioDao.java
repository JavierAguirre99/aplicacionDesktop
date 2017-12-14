package DAO;

import Modelo.InnerUsuario;
import Modelo.TiposUsuarios;
import Modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class usuarioDao extends DAO {

    private String sql;
    private PreparedStatement sta;
    private ResultSet res;
    private int content;

    public List<Usuario> verificarUsuario(Usuario user) throws Exception {
        List<Usuario> listUser = null;
        try {
            this.conectar();
            sql = "select * from usuarios where nombre=? and contrasena=?";
            sta = this.getCn().prepareStatement(sql);
            sta.setString(1, user.getNombre());
            sta.setString(2, user.getContrasena());
            res = sta.executeQuery();
            listUser = new ArrayList();

            while (res.next()) {
                Usuario us = new Usuario();
                us.setContrasena(res.getString("contrasena"));
                us.setId_usuario(res.getInt("id_usuario"));
                us.setNombre(res.getString("nombre"));
                us.setTipo_usuario(res.getInt("id_tipoUsuario"));
                listUser.add(us);
                content = us.getTipo_usuario();
            }
        } catch (SQLException ex) {
            System.out.println("Error al verificar usuario: " + ex);
        } finally {
            this.cerrar();
        }
        return listUser;
    }

    public void eliminarUsuario(Usuario modUsuario) throws Exception {
        try {
            this.conectar();
            sql = "delete * from usuarios where id_usuario = ?";
            sta = this.getCn().prepareStatement(sql);
            sta.setInt(1, modUsuario.getId_usuario());
            sta.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al eliminar al usuario: " + e);
        } finally {
            this.cerrar();
        }
    }

    public void nuevoUsuario(Usuario nuevo) throws Exception {

        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareStatement("insert into usuarios  values(?,?,?,?)");
            st.setInt(1, nuevo.getId_usuario());
            System.out.println("id_usuario"+nuevo.getId_usuario());
            st.setString(2, nuevo.getNombre());
            System.out.println("Nombre"+nuevo.getNombre());
            st.setString(3, nuevo.getContrasena());
            System.out.println("Contrase;a"+nuevo.getContrasena());
            st.setInt(4, nuevo.getTipo_usuario());
            System.out.println("tipoUsuario"+nuevo.getTipo_usuario());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error en el DAO AL Ingresar Nuevo Usuario" + e);
        } finally {
            this.cerrar();
        }
    }

    public List<Usuario> listarNombres() throws Exception {

        List<Usuario> lista;
        lista = new ArrayList();
        ResultSet result;

        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareCall("select persona.id_persona,persona.nombre \n"
                    + " from persona where id_persona not in(select usuarios.id_usuario from usuarios)");
            result = st.executeQuery();
            while (result.next()) {
                Usuario con = new Usuario();
                con.setId_usuario(Integer.parseInt(result.getString("id_persona")));
                con.setNombre(result.getString("nombre"));
                lista.add(con);
            }
        } catch (SQLException e) {
            System.out.println("Error en el DAO Listar Nombre " + e);
        } finally {
            this.cerrar();
        }
        return lista;
    }

    public List<TiposUsuarios> listarTiposUsuarios() throws Exception {

        List<TiposUsuarios> lista;
        lista = new ArrayList();
        ResultSet result;

        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareCall("select id_tipoUsuario,tipoUsuario from tipos_usuario");
            result = st.executeQuery();
            while (result.next()) {
                TiposUsuarios con = new TiposUsuarios();
                con.setId_tipousuario(Integer.parseInt(result.getString("id_tipoUsuario")));
                con.setTipousuario(result.getString("tipoUsuario"));
                lista.add(con);
            }
        } catch (Exception e) {
            System.out.println("Error en el DAO Listar Tipos de USUARIOS" + e);
        } finally {
            this.cerrar();
        }
        return lista;
    }
    
    public List<Usuario> listarUsuarios() throws Exception {

        List<Usuario> lista;
        lista = new ArrayList();
        ResultSet result;

        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareCall("select * from usuarios");
            result = st.executeQuery();
            while (result.next()) {
                Usuario con = new Usuario();
                con.setId_usuario(result.getInt("id_usuario"));
                con.setNombre(result.getString("nombre"));
                con.setContrasena(result.getString("id_tipoUsuaio"));                
                con.setTipo_usuario(result.getInt("tipoUsuario"));
                lista.add(con);
            }
        } catch (Exception e) {
            System.out.println("Error AL listar todos los Usuarios" + e);
        } finally {
            this.cerrar();
        }
        return lista;
    }

    public ArrayList<InnerUsuario> listarUsuario() {
        ArrayList<InnerUsuario> lstModUsuario = null;

        return lstModUsuario;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

}
