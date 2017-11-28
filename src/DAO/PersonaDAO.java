package DAO;

import Modelo.Personas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO extends DAO {

    public void ingresarPersona(Personas persona) throws Exception {
        try {
            this.conectar();
            System.out.println(persona.getApellido());
            System.out.println(persona.getFecha_nac());
            PreparedStatement st = this.getCn().prepareStatement("insert into persona values(?,?,?,?,?,?,?,?)");
            st.setString(1, persona.getNombre());
            st.setString(2, persona.getApellido());
            st.setString(3, persona.getDireccion());
            st.setInt(4, persona.getDpi());
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

    public List<Personas> listar() throws Exception {
        List<Personas> lista;
        lista = new ArrayList();
        ResultSet result;

        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareCall("SELECT id_persona, nombre FROM persona");
            result = st.executeQuery();

            while (result.next()) {
                Personas pac = new Personas();
                pac.setId(Integer.parseInt(result.getString("id_persona")));
                pac.setNombre(result.getString("nombre"));
                lista.add(pac);
            }
        } catch (Exception e) {
            System.out.println("Error en el dao al intentar listar");
        } finally {
            this.cerrar();
        }
        return lista;
    }
    
}
