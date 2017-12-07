package DAO;


import Modelo.Paquetes;
import Modelo.TipoServicio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaquetesDAO  extends DAO{
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
            System.out.println("Error en el dao al intentar listar"+ex);
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
            System.out.println("Error en el dao al intentar listar tipos de Servicios"+ex);
        } finally {
            this.cerrar();
        }
        return lista;
    }
    
}
