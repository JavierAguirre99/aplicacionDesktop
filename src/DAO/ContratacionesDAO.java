package DAO;

import Modelo.Contrataciones;
import Modelo.Empleados;
import Modelo.InnerContratacion;
import Modelo.Municipios;
import Modelo.Paquetes;
import Modelo.Personas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContratacionesDAO extends DAO {

    public void insertarContratacion(Contrataciones contratacion) {
        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareStatement("insert into contrataciones (fecha_contratacion,fecha_renovacion,fecha_culminacion,id_cliente,"
                    + "id_paquete,direccion,id_municipio,id_empleado) values(?,?,?,?,?,?,?,?)");
            st.setString(1, contratacion.getFecha_contrataciones());
            st.setString(2, contratacion.getFecha_renovacion());
            st.setString(3, contratacion.getFecha_culminacion());
            st.setInt(4, contratacion.getId_cliente());
            st.setInt(5, contratacion.getId_paquete());
            st.setString(6, contratacion.getFecha_culminacion());
            st.setInt(7, contratacion.getId_municipio());
            st.setInt(8, contratacion.getId_empleado());
            st.executeQuery();
        } catch (Exception ex) {
            System.out.println("Error en el DAO" + ex);
        } finally {
            try {
                this.cerrar();
            } catch (Exception ex) {
                System.out.println("Error al intentar cerrar la conexion" + ex);
            }
        }
    }

    public List<Municipios> listarMunicipios() throws Exception {
        List<Municipios> lista;
        lista = new ArrayList();
        ResultSet result;

        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareCall("SELECT id_municipio, nombre FROM municipios");
            result = st.executeQuery();

            while (result.next()) {
                Municipios pac = new Municipios();
                pac.setId_municipio(Integer.parseInt(result.getString("id_municipio")));
                pac.setNombre(result.getString("nombre"));
                lista.add(pac);
            }
        } catch (SQLException e) {
            System.out.println("Error en el dao al intentar listar" + e);
        } finally {
            this.cerrar();
        }
        return lista;
    }

    public List<Paquetes> listarPaquetes() throws Exception {
        List<Paquetes> lista;
        lista = new ArrayList();
        ResultSet result;

        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareCall("SELECT id_paquete, nombre FROM paquetes");
            result = st.executeQuery();

            while (result.next()) {
                Paquetes pac = new Paquetes();
                pac.setId_paquete(Integer.parseInt(result.getString("id_paquete")));
                pac.setNombre(result.getString("nombre"));
                lista.add(pac);
            }
        } catch (SQLException e) {
            System.out.println("Error en el dao al intentar listar" + e);
        } finally {
            this.cerrar();
        }
        return lista;
    }

    public List<Empleados> listarEmpleados() throws Exception {
        List<Empleados> lista;
        lista = new ArrayList();
        ResultSet result;

        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareCall("SELECT * from empleados ");
            result = st.executeQuery();

            while (result.next()) {
                Empleados pac = new Empleados();
                pac.setId_empleado(Integer.parseInt(result.getString("id_persona")));
                lista.add(pac);
            }
        } catch (SQLException e) {
            System.out.println("Error en el dao al intentar listar" + e);
        } finally {
            this.cerrar();
        }
        return lista;
    }

    public ArrayList<InnerContratacion> listarTodaContratacion() {
        ArrayList<InnerContratacion> lstModContra = null;
        String sql;
        PreparedStatement sta;
        ResultSet res;
        try {
            this.conectar();
            sql = "select contrataciones.id_contratacion, contrataciones.fecha_contratacion, contrataciones.fecha_renovacion, contrataciones.fecha_culminacion,\n"
                    + " contrataciones.direccion, concat(persona.nombre,' ',persona.apellido) as cliente, paquetes.nombre as paquete, municipios.nombre as municipio,\n"
                    + " contrataciones.id_empleado\n"
                    + " from contrataciones\n"
                    + " inner join clientes on clientes.id_cliente = contrataciones.id_cliente\n"
                    + " inner join persona on persona.id_persona = clientes.id_cliente\n"
                    + " inner join paquetes on paquetes.id_paquete=contrataciones.id_paquete\n"
                    + " inner join municipios on municipios.id_municipio = contrataciones.id_municipio;";
            sta = this.getCn().prepareStatement(sql);
            res = sta.executeQuery();
            lstModContra = new ArrayList();
            
            while(res.next()){
                InnerContratacion contraMod = new InnerContratacion();
                contraMod.setIdContratacion(res.getInt("id_contratacion"));
                contraMod.setDireccion(res.getString("direccion"));
                contraMod.setCliente(res.getString("cliente"));
                contraMod.setIdEmpleado(res.getInt("id_empleado"));
                contraMod.setFechaContratacion(res.getString("fecha_contratacion"));
                contraMod.setFechaCulminacion(res.getString("fecha_culminacion"));
                contraMod.setFechaRenovacion(res.getString("fecha_renovacion"));
                contraMod.setMunicipio(res.getString("municipio"));
                contraMod.setPaquete(res.getString("paquete"));
                lstModContra.add(contraMod);
            }
            
        } catch (Exception e) {
            System.out.println("Error al listar los contratos: "+e);
        }
        return lstModContra;
    }
}
