
package DAO;

import Modelo.Categoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CategoriaDao extends DAO{
    private String sql;
    private PreparedStatement sta;
    private ResultSet res;
    
    public ArrayList<Categoria> listarCategoria() throws Exception{
        ArrayList<Categoria> lstModeloCategoria = new ArrayList<>();
        
        try {
            this.conectar();
            sql="select * from categoria";
            sta = this.getCn().prepareStatement(sql);
            res = sta.executeQuery();
            while (res.next()) {
                Categoria modelCategoria =  new Categoria();
                modelCategoria.setId_categoria(res.getInt("id_categoria"));
                modelCategoria.setNombre(res.getString("nombre"));
                lstModeloCategoria.add(modelCategoria);
            }
        } catch (Exception e) {
        }finally{
            this.cerrar();
        }
        return lstModeloCategoria;
    }
}
