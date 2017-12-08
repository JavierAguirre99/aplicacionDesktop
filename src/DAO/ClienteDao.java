package DAO;

import Modelo.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDao extends DAO {

    private String sql;
    private PreparedStatement sta;

    public void eliminarCliente(int idCliente) throws Exception {

        try {
            this.conectar();
            sql = "delete from clientes where id_cliente=?";
            sta = this.getCn().prepareStatement(sql);
            sta.setInt(1, idCliente);
            sta.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar cliente: " + ex);
        } finally {
            this.cerrar();
        }

    }

    public ArrayList<InnerPersonaCliente> llenarTabla(int idCliente) throws Exception {
        ArrayList<InnerPersonaCliente> lstPeople = null;
        ResultSet res;

        try {
            this.conectar();

            sql = "select * from datocompletocliente where id_cliente =?";
            sta = this.getCn().prepareStatement(sql);
            sta.setInt(1, idCliente);
            res = sta.executeQuery();

            lstPeople = new ArrayList();

            while (res.next()) {
                InnerPersonaCliente peopleModel = new InnerPersonaCliente();

                peopleModel.setNombreCliente(res.getString("nombre_cliente"));
                peopleModel.setIdCliente(res.getInt("id_cliente"));
                peopleModel.setDpiCliente(res.getLong("dpi"));
                peopleModel.setDireccion(res.getString("direccion"));
                lstPeople.add(peopleModel);
            }
        } catch (Exception e) {
            System.err.println("Error al listar en la tabla: " + e);
        } finally {
            this.cerrar();
        }

        return lstPeople;
    }

    public ArrayList<Personas> llenarListaCliente() throws Exception {
        ArrayList<Personas> lstModPeople = null;
        ResultSet res;
        try {
            this.conectar();
            sql = "SELECT concat(persona.nombre,' ',persona.apellido) as persona, persona.id_persona\n"
                    + " from persona \n"
                    + " where id_persona not in (select clientes.id_cliente from clientes) and id_persona not in (SELECT empleados.id_empleado from empleados) ";
            sta = this.getCn().prepareStatement(sql);
            res = sta.executeQuery();
            lstModPeople = new ArrayList<>();
            while (res.next()) {
                Personas perModelo = new Personas();
                perModelo.setId(res.getInt("id_persona"));
                perModelo.setNombre(res.getString("persona"));
                lstModPeople.add(perModelo);
            }
        } catch (SQLException e) {
            System.out.println("error en: " + e);
        }finally{
            this.cerrar();
        }
        return lstModPeople;
    }

    public ArrayList<InnerPersonaCliente> llenarLista() throws Exception {
        ArrayList<InnerPersonaCliente> lista = null;
        ResultSet res;

        try {
            this.conectar();
            sql = "select * from vwdatocliente";
            sta = this.getCn().prepareStatement(sql);
            res = sta.executeQuery();
            lista = new ArrayList();
            while (res.next()) {
                InnerPersonaCliente peopleModel = new InnerPersonaCliente();
                peopleModel.setIdCliente(res.getInt("id_cliente"));
                peopleModel.setNombreCliente(res.getString("cliente"));
                peopleModel.setIdCategoria(res.getInt("id_categoria"));
                peopleModel.setCategoria(res.getString("categoria"));
                peopleModel.setIdTipoCliente(res.getInt("id_tipo_cliente"));
                peopleModel.setTipoCliente(res.getString("tipo_cliente"));
                peopleModel.setIdEstado(res.getInt("id_estado"));
                peopleModel.setEstado(res.getString("estado"));
                lista.add(peopleModel);
            }
        } catch (SQLException e) {
            System.out.println("Error en listar cliente: " + e);
        } finally {
            this.cerrar();
        }

        return lista;
    }

    public void ingresarCliente(cliente modelCliente) throws Exception {
        try {
            this.conectar();
            sql = "insert into clientes(id_cliente, id_categoria, id_estado, id_tipo_cliente, email) values(?,?,?,?,?)";
            sta = this.getCn().prepareStatement(sql);
            sta.setInt(1, modelCliente.getId_cliente());
            sta.setInt(2, modelCliente.getId_categoria());
            sta.setInt(3, modelCliente.getId_estado());
            sta.setInt(4, modelCliente.getId_tipocliente());
            sta.setString(5, modelCliente.getEmail());
            sta.executeUpdate();

        } catch (Exception ex) {
            System.out.println("Error al insertar cliente: " + ex);
        } finally {
            this.cerrar();
        }

    }

    public ArrayList<TipoClientes> listarTipoCliente() {
        ArrayList<TipoClientes> lstModTipoCliente = null;
        try {
            this.conectar();
            sql = "select * from tipo_cliente";
            sta = this.getCn().prepareStatement(sql);
            ResultSet res = sta.executeQuery();
            lstModTipoCliente = new ArrayList<>();
            while (res.next()) {
                TipoClientes modTipoClie = new TipoClientes();
                modTipoClie.setTipoClientes(res.getInt("id_tipo_cliente"));
                modTipoClie.setNombre(res.getString("nombre"));
                lstModTipoCliente.add(modTipoClie);
            }

        } catch (Exception e) {
            System.out.println("Error al listar tipo cliente: " + e);
        }

        return lstModTipoCliente;
    }
}
