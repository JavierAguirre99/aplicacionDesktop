package DAO;

import Modelo.cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDao extends DAO{
    private String sql;
    private PreparedStatement sta;
    
    public void modficar(cliente cle){
        try {
            this.conectar();
            sql = "update clientes set direccion =?, telefono=?, email=? where id_cliente = ?";
            sta = this.getCn().prepareStatement(sql); 
            sta.setString(1, cle.getDireccion());
            sta.setInt(2, cle.getTelefono());
            sta.setString(3, cle.getEmail());
            sta.setInt(4, cle.getIdCliente());
            sta.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public List<cliente> listarCliente(cliente cle){
        List<cliente> lista = null;
        ResultSet res;
        
        try {
            this.conectar();
            sql="select * from clientes where id_cliente=?";
            sta = this.getCn().prepareStatement(sql);
            sta.setInt(1, cle.getIdCliente());
            res = sta.executeQuery();
            lista = new ArrayList();
            while(res.next()){
                cliente clie = new cliente();
                clie.setDireccion(res.getString("direccion"));
                clie.setEmail(res.getString("email"));
                clie.setTelefono(res.getInt("telefono")); 
                clie.setIdCliente(res.getInt("id_cliente"));
                sta.executeQuery();
                lista.add(clie);
            }
        } catch (Exception e) {
            System.out.println("Error en listar cliente"+e);
        }
        
        return lista;
    }
    
    public ArrayList<cliente> llenarLista() throws Exception{
        ArrayList<cliente> lista = null;
        ResultSet res;
        
        try {
            this.conectar();
            sql="select * from clientes";
            sta = this.getCn().prepareStatement(sql);
            res = sta.executeQuery();
            lista = new ArrayList();
            while(res.next()){
                cliente clie = new cliente();
                clie.setIdCliente(res.getInt("id_cliente"));
                lista.add(clie);
            }
        } catch (SQLException e) {
            System.out.println("Error en listar cliente: "+e);
        }finally{
            this.cerrar();
        }
        
        return lista;
    }
}
