package DAO;

import Modelo.ConsultaDeServicios;
import Modelo.Ticket;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ConsultaDeServiciosDAO extends DAO {

    /*
    public List<Clientes> listarCliente(int codigo) {
        List<Clientes> listad;
        listad = new ArrayList();
        try {

            ResultSet result;
            this.conectar();
            PreparedStatement st = this.getCn().prepareCall("select clientes.id_cliente,persona.nombre,persona.apellido,persona.direccion,persona.nit,persona.dpi,clientes.email\n"
                    + "from persona inner join clientes on persona.id_persona=clientes.id_cliente where clientes.id_cliente=?");
            
            st.setInt(1, codigo);
            result = st.executeQuery();

            while (result.next()) {
                Clientes cliente = new Clientes();
                
                cliente.setNombre(result.getString("nombre"));
                cliente.setApellido(result.getString("apellido"));
                cliente.setDireccion(result.getString("direccion"));
                cliente.setNit(Integer.parseInt(result.getString("nit")));
                cliente.setDpi(Integer.parseInt(result.getString("dpi")));
                cliente.setEmail(result.getString("email"));
                listad.add(cliente);
            }
        } catch (Exception ex) {
            System.out.println("Error al Listar Cliente"+ex);
        }
        return listad;
    }
     */
    public List<ConsultaDeServicios> listarCable(int codigo) throws Exception {

        List<ConsultaDeServicios> lista;
        lista = new ArrayList();
        ResultSet result;

        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareCall("select contrataciones.id_contratacion,persona.apellido ,persona.nombre,persona.direccion,paquetes.nombre as NomPaquete, tipos_servicios.nombre as TipodeServicio\n"
                    + " from contrataciones inner join clientes on contrataciones.id_cliente = clientes.id_cliente \n"
                    + " inner join paquetes on contrataciones.id_paquete = paquetes.id_paquete\n"
                    + " inner join persona on clientes.id_cliente = persona.id_persona \n"
                    + " inner join tipos_servicios on paquetes.id_tiposervicio = tipos_servicios.id_tiposervicio\n"
                    + " where clientes.id_cliente=? and tipos_servicios.nombre='cable'");

            st.setInt(1, codigo);

            result = st.executeQuery();

            while (result.next()) {
                ConsultaDeServicios con = new ConsultaDeServicios();
                con.setId_contratacion(Integer.parseInt(result.getString("id_contratacion")));
                con.setApellido(result.getString("apellido"));
                con.setNombre(result.getString("nombre"));
                con.setDireccion(result.getString("direccion"));
                con.setNom_paquete(result.getString("NomPaquete"));
                con.setTipo_servicio(result.getString("TipodeServicio"));
                lista.add(con);
            }
        } catch (Exception e) {
            System.out.println("Error en el DAO" + e);
        } finally {
            this.cerrar();
        }
        return lista;
    }

    public List<ConsultaDeServicios> listarInternet(int codigo2) throws Exception {

        List<ConsultaDeServicios> lista2;
        lista2 = new ArrayList();
        ResultSet result;

        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareCall("select contrataciones.id_contratacion,persona.apellido ,persona.nombre,persona.direccion,paquetes.nombre as NomPaquete, tipos_servicios.nombre as TipodeServicio\n"
                    + " from contrataciones inner join clientes on contrataciones.id_cliente = clientes.id_cliente \n"
                    + " inner join paquetes on contrataciones.id_paquete = paquetes.id_paquete\n"
                    + " inner join persona on clientes.id_cliente = persona.id_persona \n"
                    + " inner join tipos_servicios on paquetes.id_tiposervicio = tipos_servicios.id_tiposervicio\n"
                    + " where clientes.id_cliente=? and tipos_servicios.nombre='internet'");

            st.setInt(1, codigo2);

            result = st.executeQuery();

            while (result.next()) {
                ConsultaDeServicios con = new ConsultaDeServicios();
                con.setId_contratacion(Integer.parseInt(result.getString("id_contratacion")));
                con.setApellido(result.getString("apellido"));
                con.setNombre(result.getString("nombre"));
                con.setDireccion(result.getString("direccion"));
                con.setNom_paquete(result.getString("NomPaquete"));
                con.setTipo_servicio(result.getString("TipodeServicio"));
                lista2.add(con);
            }
        } catch (Exception e) {
            System.out.println("Error en el DAO" + e);
        } finally {
            this.cerrar();
        }
        return lista2;
    }

    public List<Ticket> ListGenerarTickets() throws Exception {
        List<Ticket> lista2;
        lista2 = new ArrayList();
        ResultSet result;
        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareCall("select contrataciones.id_contratacion,persona.apellido ,persona.nombre,persona.direccion,contrataciones.fecha_contratacion,contrataciones.fecha_renovacion,paquetes.nombre as NomPaquete, tipos_servicios.nombre as TipodeServicio,paquetes.precioventa\n"
                    + "from contrataciones inner join clientes on contrataciones.id_cliente = clientes.id_cliente \n"
                    + "inner join paquetes on contrataciones.id_paquete = paquetes.id_paquete\n"
                    + "inner join persona on clientes.id_cliente = persona.id_persona\n"
                    + "inner join tipos_servicios on paquetes.id_tiposervicio = tipos_servicios.id_tiposervicio");         
            result = st.executeQuery();
            while (result.next()) {               
                Ticket con = new Ticket();
                con.setId_contratacion(Integer.parseInt(result.getString("id_contratacion")));
                con.setApellido(result.getString("apellido"));
                con.setNombre(result.getString("nombre"));
                con.setDireccion(result.getString("direccion"));
                con.setFechaContratacion(result.getString("fecha_Contratacion"));
                con.setFechaRenovacion(result.getString("fecha_Renovacion"));                
                con.setNom_paquete(result.getString("NomPaquete"));
                con.setTipo_servicio(result.getString("TipodeServicio"));
                con.setPrecio(result.getDouble("precioventa"));                
                lista2.add(con);
            }
        } catch (Exception e) {
            System.out.println("Error en el DAO" + e);
        } finally {
            this.cerrar();
        }
        return lista2;
    }
}
