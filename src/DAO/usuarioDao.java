package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class usuarioDao extends DAO{
    private String sql;
    private PreparedStatement sta;
    private ResultSet res;
    
    public void verificarUsuario(String contra, String usuario){
        try {
            this.conectar();
            sql = "select * from ";
        } catch (Exception ex) {
            Logger.getLogger(usuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
