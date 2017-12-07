package DAO;

import Modelo.Personas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaDAO extends DAO {
    private String sql;
    private PreparedStatement sta;
    public void ingresarPersona(Personas persona) throws Exception {
        try {
            this.conectar();
            System.out.println(persona.getApellido());
            System.out.println(persona.getFecha_nac());
            PreparedStatement st = this.getCn().prepareStatement("insert into persona values(?,?,?,?,?,?,?,?)");
            st.setString(1, persona.getNombre());
            st.setString(2, persona.getApellido());
            st.setString(3, persona.getDireccion());
            st.setLong(4, persona.getDpi());
            st.setInt(5, persona.getTel_movil());
            st.setInt(6, persona.getNit());
            st.setDate(7, persona.getFecha_nac());
            st.setInt(8, persona.getTel_casa());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en el DAO AL ingresar una Persona" + e);
        } finally {
            this.cerrar();
        }
    }

    public ArrayList<Personas> listarPorID(int id) throws Exception {
        ArrayList<Personas> lista=null;
        
        ResultSet result;
        try {
            this.conectar();
            sql = "SELECT id_persona, concat(nombre,' ',apellido) as nombre_persona, dpi, telefono_movil, nit, fecha_nacimiento, telefono_casa FROM persona WHERE id_persona=?";
            sta = this.getCn().prepareStatement(sql);
            sta.setInt(1, id);
            result = sta.executeQuery();
            lista = new ArrayList();
            
            while (result.next()) {
                
                Personas pac = new Personas();
                pac.setId(Integer.parseInt(result.getString("id_persona")));
                pac.setNombre(result.getString("nombre_persona"));
                pac.setDpi(result.getLong("dpi"));
                pac.setTel_movil(result.getInt("telefono_movil"));
                pac.setTel_casa(result.getInt("telefono_casa"));
                pac.setNit(result.getInt("nit"));
                pac.setFecha_nac(result.getDate("fecha_nacimiento"));
                lista.add(pac);
                
            }
        } catch (SQLException e) {
            System.out.println("Error en el dao al intentar listar: "+e);
        } finally {
            this.cerrar();
        }
        return lista;
    }
    
    public ArrayList<Personas> listarPorNombre(String nombre) throws Exception {
        ArrayList<Personas> lista;
        lista = new ArrayList();
        ResultSet result;

        try {
            this.conectar();
            System.out.println("nombre");
            sql="SELECT id_persona, concat(nombre,' ',apellido) as nombre_persona, dpi, telefono_movil, nit, fecha_nacimiento, telefono_casa FROM persona "
                    //+ " WHERE nombre like ?";
                    + " WHERE MATCH(nombre,apellido) AGAINST(?)";
            sta = this.getCn().prepareStatement(sql);
            System.out.println("sql: "+sql);
            sta.setString(1, nombre);
            result = sta.executeQuery();
            while (result.next()) {
                Personas pac = new Personas();
                pac.setId(Integer.parseInt(result.getString("id_persona")));
                pac.setNombre(result.getString("nombre_persona"));
                pac.setDpi(result.getLong("dpi"));
                pac.setTel_movil(result.getInt("telefono_movil"));
                pac.setTel_casa(result.getInt("telefono_casa"));
                pac.setNit(result.getInt("nit"));
                pac.setFecha_nac(result.getDate("fecha_nacimiento"));
                
                lista.add(pac);
            }
        } catch (SQLException e) {
            System.out.println("Error en el dao al intentar listar: "+e);
        } finally {
            this.cerrar();
        }
        return lista;
    }
    public void eliminarPersona(Personas modPer) throws Exception{
        try {
            this.conectar();
            sql = "delete from persona where id_persona = ?";
            sta = this.getCn().prepareStatement(sql);
            sta.setInt(1, modPer.getId());
            sta.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            this.cerrar();
        }
    }
}
