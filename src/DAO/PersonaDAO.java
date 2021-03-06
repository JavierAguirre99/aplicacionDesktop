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
            PreparedStatement st = this.getCn().prepareStatement("insert into persona(nombre,apellido,direccion,dpi,telefono_movil,nit,fecha_nacimiento,telefono_casa) values(?,?,?,?,?,?,?,?)");
            st.setString(1, persona.getNombre());
            st.setString(2, persona.getApellido());
            st.setString(3, persona.getDireccion());
            st.setLong(4, persona.getDpi());
            st.setInt(5, persona.getTel_movil());
            st.setInt(6, persona.getNit());
            st.setString(7, persona.getFecha_nac());
            st.setInt(8, persona.getTel_casa());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error en el DAO AL ingresar una Persona" + e);
        } finally {
            this.cerrar();
        }
    }

    public ArrayList<Personas> listarPorID(int id) throws Exception {
        ArrayList<Personas> lista = null;

        ResultSet result;
        try {
            this.conectar();
            sql = "SELECT id_persona, concat(nombre,' ',apellido) as nombre_persona, dpi, telefono_movil, nit, fecha_nacimiento, telefono_casa, direccion FROM persona WHERE id_persona=?";
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
                pac.setDireccion(result.getString("direccion"));
                pac.setFecha_nac(result.getString("fecha_nacimiento"));
                lista.add(pac);

            }
        } catch (SQLException e) {
            System.out.println("Error en el dao al intentar listar: " + e);
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
            sql = "SELECT id_persona, concat(nombre,' ',apellido) as nombre_persona, dpi, telefono_movil, nit, fecha_nacimiento, telefono_casa, direccion FROM persona "
                    //+ " WHERE nombre like ?";
                    + " WHERE MATCH(nombre,apellido) AGAINST(?)";
            sta = this.getCn().prepareStatement(sql);
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
                pac.setDireccion(result.getString("direccion"));
                pac.setFecha_nac(result.getString("fecha_nacimiento"));
                lista.add(pac);
            }
        } catch (SQLException e) {
            System.out.println("Error en el dao al intentar listar: " + e);
        } finally {
            this.cerrar();
        }
        return lista;
    }

    public void eliminarPersona(Personas modPer) throws Exception {
        try {
            this.conectar();
            sql = "delete from persona where id_persona = ?";
            sta = this.getCn().prepareStatement(sql);
            sta.setInt(1, modPer.getId());
            sta.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            this.cerrar();
        }
    }

    public List<Personas> listarPersonas() throws Exception {

        List<Personas> lista2;
        lista2 = new ArrayList();
        ResultSet result;

        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareCall("select * from persona");
            result = st.executeQuery();
            while (result.next()) {
                Personas con = new Personas();
                con.setId(result.getInt("id_persona"));
                con.setNombre(result.getString("nombre"));
                con.setApellido(result.getString("apellido"));
                con.setDireccion(result.getString("direccion"));
                con.setDpi(result.getLong("dpi"));
                con.setNit(result.getInt("nit"));
                con.setFecha_nac(result.getString("fecha_nacimiento"));
                con.setTel_movil(result.getInt("telefono_movil"));
                con.setTel_casa(result.getInt("telefono_casa"));
                lista2.add(con);
            }
        } catch (Exception e) {
            System.out.println("Error en el DAO al listar" + e);
        } finally {
            this.cerrar();
        }
        return lista2;
    }

    public void modificarPersona(Personas persona) throws Exception {
        try {
            
            System.out.println(persona.getApellido());
            System.out.println(persona.getDireccion());
            System.out.println(persona.getId());
            System.out.println(persona.getTel_casa());
            System.out.println(persona.getFecha_nac());
            System.out.println(persona.getTel_movil());
            System.out.println(persona.getNit());
            System.out.println(persona.getDpi());
            this.conectar();
            PreparedStatement st = this.getCn().prepareStatement("UPDATE persona\n"
                    + "SET nombre = ?, apellido = ?, direccion = ? ,\n"
                    + "dpi = ?,telefono_movil=?, nit = ?, fecha_nacimiento = ?, telefono_casa=? \n"
                    + "WHERE id_persona = ?");

            st.setString(1, persona.getNombre());            
            st.setString(2, persona.getApellido());
            st.setString(3, persona.getDireccion());            
            st.setLong(4, persona.getDpi());            
            st.setInt(5, persona.getTel_movil());            
            st.setLong(6, persona.getNit());            
            st.setString(7, persona.getFecha_nac());            
            st.setInt(8, persona.getTel_casa());            
            st.setInt(9, persona.getId());            
            st.executeUpdate();
            listarPersonas();

        } catch (Exception e) {
            System.out.println(" Error Al intentar Modificar " + e);
        } finally {
            this.cerrar();
        }
    }

}
