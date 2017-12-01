
package DAO;

import Modelo.Estado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class EstadoDao extends DAO{
    private String sql;
    private PreparedStatement sta;
    
    public ArrayList<Estado> listarEstado(){
        ArrayList<Estado> lstEstadoModel = null;
        ResultSet res;
        try {
            this.conectar();
            sql="select * from estados";
            sta = this.getCn().prepareStatement(sql);
            res = sta.executeQuery();
            lstEstadoModel = new ArrayList<>();
            
            while (res.next()) {                
                Estado estMod = new Estado();
                estMod.setId_estado(res.getInt("id_estado"));
                estMod.setNombre(res.getString("nombre"));
                lstEstadoModel.add(estMod);
            }
            
        } catch (Exception e) {
            System.out.println("Error al listar estado: "+e);
        }
        
        return lstEstadoModel;
    }
}
