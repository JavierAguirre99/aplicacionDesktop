package DAO;

import Modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class usuarioDao extends DAO{
    private String sql;
    private PreparedStatement sta;
    private ResultSet res;
    private int content;
    
    public List<Usuario> verificarUsuario(Usuario user) throws Exception{
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
                System.out.println("usuario: "+res.getString("nombre"));
                us.setTipo_usuario(res.getInt("id_tipoUsuario"));
                listUser.add(us);
                content = us.getTipo_usuario();
            }
        } catch (SQLException ex) {
            System.out.println("Error al verificar usuario: "+ex);
        }finally{
            this.cerrar();
        }
        return listUser;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }
    
}
