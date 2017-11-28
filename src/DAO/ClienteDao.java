package DAO;

import Modelo.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class ClienteDao extends DAO {

    private String sql;
    private PreparedStatement sta;

   
    public void eliminarCliente(int idCliente) throws Exception{
          
        try {
            this.conectar();
            sql = "delete from clientes where id_cliente=?";
            sta = this.getCn().prepareStatement(sql);
            sta.setInt(1, idCliente);
            sta.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar cliente: "+ex);
        }finally{
            this.cerrar();
        }
        
    }
    
    public ArrayList<InnerPersonaCliente> llenarLista() throws Exception {
        ArrayList<InnerPersonaCliente> lista = null;
        ResultSet res;

        try {
            this.conectar();
            sql = "select persona.nombre, clientes.id_cliente \n"
                    + " from clientes \n"
                    + " inner join persona on clientes.id_cliente=persona.id_persona";
            sta = this.getCn().prepareStatement(sql);
            res = sta.executeQuery();
            lista = new ArrayList();
            while (res.next()) {
                InnerPersonaCliente peopleModel = new InnerPersonaCliente();
                peopleModel.setIdCliente(res.getInt("id_cliente"));
                peopleModel.setNombreCliente(res.getString("nombre"));
                lista.add(peopleModel);
            }
        } catch (SQLException e) {
            System.out.println("Error en listar cliente: " + e);
        } finally {
            this.cerrar();
        }

        return lista;
    }
}
