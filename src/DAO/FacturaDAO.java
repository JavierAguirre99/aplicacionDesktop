package DAO;

import Modelo.Factura;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacturaDAO extends DAO {

    public List<Factura> listarFacturas(int contratacion) throws Exception {
        List<Factura> lista2;
        lista2 = new ArrayList();
        ResultSet result;
        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareCall("select persona.apellido ,persona.dpi,persona.nombre,persona.direccion,persona.nit,contrataciones.fecha_contratacion,contrataciones.fecha_renovacion,paquetes.nombre as NomPaquete, tipos_servicios.nombre as TipodeServicio,paquetes.precioventa\n"
                    + "from contrataciones inner join clientes on contrataciones.id_cliente = clientes.id_cliente\n"
                    + "inner join paquetes on contrataciones.id_paquete = paquetes.id_paquete\n"
                    + "inner join persona on clientes.id_cliente = persona.id_persona\n"
                    + "inner join tipos_servicios on paquetes.id_tiposervicio = tipos_servicios.id_tiposervicio\n"
                    + "where contrataciones.id_contratacion=?");
            st.setInt(1, contratacion);
            result = st.executeQuery();
            while (result.next()) {
                Factura con = new Factura();
                con.setNombre(result.getString("nombre"));
                System.out.println("NOmbre"+result.getString("nombre"));
                con.setApellido(result.getString("apellido"));
                System.out.println(result.getString("apellido"));
                con.setDireccion(result.getString("direccion"));
                System.out.println(result.getString("direccion"));
                con.setNit(result.getInt("nit"));
                System.out.println(result.getInt("nit"));
                con.setDpi(Integer.parseInt(result.getString("dpi")));
                System.out.println(result.getString("dpi"));
                con.setFecha_contratacion(result.getString("fecha_contratacion"));
                System.out.println(result.getString("fecha_contratacion"));
                con.setFecha_renovacion(result.getString("fecha_renovacion"));
                System.out.println(result.getString("fecha_renovacion"));
                con.setNombrePaquete(result.getString("NomPaquete"));
                System.out.println(result.getString("NomPaquete"));
                con.setTiposervicio(result.getString("TipodeServicio"));
                System.out.println(result.getString("TipodeServicio"));
                con.setPrecioVenta(result.getInt("precioventa"));
                System.out.println(result.getInt("precioventa"));
                lista2.add(con);
            }
        } catch (SQLException e) {
            System.out.println("Error en el DAO FacturaDa" + e);
        } finally {
            this.cerrar();
        }
        return lista2;
    }
}
