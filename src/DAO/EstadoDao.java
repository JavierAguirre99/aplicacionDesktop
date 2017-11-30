
package DAO;

import Modelo.Estado;
import java.sql.PreparedStatement;
import java.util.ArrayList;


public class EstadoDao extends DAO{
    private String sql;
    private PreparedStatement sta;
    
    public ArrayList<Estado> listarEstado(){
        ArrayList<Estado> lstEstadoModel = null;
        try {
            this.conectar();
            
        } catch (Exception e) {
        }
        
        return lstEstadoModel;
    }
}
