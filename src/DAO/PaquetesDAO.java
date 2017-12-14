package DAO;

import Modelo.Paquetes;
import Modelo.TipoServicio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaquetesDAO extends DAO {

    public void ingresarPaquete(Paquetes paquete) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareStatement("insert into paquetes (nombre,descripcion,id_tiposervicio,costo,precioventa) values(?,?,?,?,?)");
            st.setString(1, paquete.getNombre());
            st.setString(2, paquete.getDescripcion());
            st.setInt(3, paquete.getId_tiposervicio());
            st.setInt(4, paquete.getCosto());
            st.setInt(5, paquete.getPrecioventa());

            st.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en el DAO AL ingresar un Paquete" + e);
        } finally {
            this.cerrar();
        }
    }

    public List<Paquetes> listar() throws Exception {
        List<Paquetes> lista;
        lista = new ArrayList();
        ResultSet result;

        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareCall("SELECT * FROM paquetes");
            result = st.executeQuery();

            while (result.next()) {
                Paquetes pac = new Paquetes();
                pac.setId_paquete(result.getInt("id_paquete"));
                pac.setNombre(result.getString("nombre"));
                pac.setDescripcion(result.getString("descripcion"));
                pac.setId_tiposervicio(result.getInt("id_tiposervicio"));
                pac.setCosto(result.getInt("costo"));
                pac.setPrecioventa(result.getInt("precioventa"));
                lista.add(pac);
            }
        } catch (SQLException ex) {
            System.out.println("Error en el dao al intentar listar" + ex);
        } finally {
            this.cerrar();
        }
        return lista;
    }

    public List<TipoServicio> listarTipoServicio() throws Exception {
        List<TipoServicio> lista;
        lista = new ArrayList();
        ResultSet result;

        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareCall("SELECT * FROM tipos_servicios");
            result = st.executeQuery();

            while (result.next()) {
                TipoServicio pac = new TipoServicio();
                pac.setId_servicio(result.getInt("id_tiposervicio"));
                pac.setNombre(result.getString("nombre"));

                lista.add(pac);
            }
        } catch (SQLException ex) {
            System.out.println("Error en el dao al intentar listar tipos de Servicios" + ex);
        } finally {
            this.cerrar();
        }
        return lista;
    }

    public void modificarPaquetes(Paquetes paquete) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareStatement("UPDATE paquetes\n"
                    + "SET nombre = ?, descripcion = ?, id_tiposervicio = ?, costo = ? ,precioventa=? "
                    + "WHERE id_paquete  = ?");

            st.setString(1, paquete.getNombre());
            st.setString(2, paquete.getDescripcion());
            st.setInt(3, paquete.getId_tiposervicio());
            st.setInt(4, paquete.getCosto());
            st.setInt(5, paquete.getPrecioventa());
            st.setInt(6, paquete.getId_paquete());
            

            st.executeUpdate();
            listar();

        } catch (Exception e) {
            System.out.println(" Error Al intentar Modificar " + e);
        } finally {
            this.cerrar();
        }
    }
     public void eliminarPaquetes(int codigo) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareStatement("delete from paquetes where id_paquete=?");           
            st.setInt(1, codigo);            
            st.executeUpdate();
            listar();

        } catch (Exception e) {
            System.out.println(" Error Al intentar Eliminar Paquete Dao" + e);
        } finally {
            this.cerrar();
        }
    }

}
