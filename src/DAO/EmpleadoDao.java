package DAO;

import Modelo.Empleados;

import Modelo.InnerPersonaEmpleado;
import Modelo.Puesto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDao extends DAO {

    private String sql;
    private PreparedStatement sta;

    public ArrayList<Empleados> listarNoEmpleado() throws Exception {
        ArrayList<Empleados> lstEmpleado = null;
        ResultSet res;
        try {
            this.conectar();
            sql = "SELECT concat(persona.nombre,' ',persona.apellido) as persona, persona.id_persona\n"
                    + " from persona \n"
                    + " where id_persona not in (select empleados.id_empleado from empleados)";
            sta = this.getCn().prepareStatement(sql);
            res = sta.executeQuery();
            lstEmpleado = new ArrayList();

            while (res.next()) {
                Empleados modEmpleado = new Empleados();
                modEmpleado.setEmpleado(res.getString("persona"));
                modEmpleado.setId_empleado(res.getInt("id_persona"));
                lstEmpleado.add(modEmpleado);
            }

        } catch (SQLException ex) {
            System.err.println("Error al listar no empleado: " + ex);
        }

        return lstEmpleado;
    }

    public void ingresar(Empleados empModelo) {
        try {
            this.conectar();
            sql = "insert into empleados(id_empleado, id_puesto, sueldo) values(?,?,?)";
            sta = this.getCn().prepareStatement(sql);
            sta.setInt(1, empModelo.getId_empleado());
            sta.setInt(2, empModelo.getId_puesto());
            sta.setDouble(3, empModelo.getSueldo());
            sta.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error al ingresar un empleado: " + e);
        }
    }

    public ArrayList<Puesto> listarPuesto() {
        ResultSet res;
        ArrayList<Puesto> lstModPuesto = null;
        try {
            this.conectar();
            sql = "select * from puestos";
            sta = this.getCn().prepareStatement(sql);
            res = sta.executeQuery();
            lstModPuesto = new ArrayList();

            while (res.next()) {
                Puesto modPuesto = new Puesto();
                modPuesto.setIdPuesto(res.getInt("id_puesto"));
                modPuesto.setNombre(res.getString("nombre"));
                lstModPuesto.add(modPuesto);
            }

        } catch (Exception e) {
            System.err.println("Error al listar puesto: " + e);
        }

        return lstModPuesto;
    }

    public void eliminarEmpleado(InnerPersonaEmpleado innEmpMod) throws Exception {
        try {
            this.conectar();
            sql = "delete * from empleados where id_empleado=?";
            sta = this.getCn().prepareStatement(sql);
            sta.setInt(1, innEmpMod.getIdEmpleado());
            sta.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al eliminar empleado: " + e);
        } finally {
            this.cerrar();
        }
    }

    public ArrayList<InnerPersonaEmpleado> listarPorId(InnerPersonaEmpleado modEmpleado) throws Exception {
        ArrayList<InnerPersonaEmpleado> lstModEmpleado = null;
        ResultSet res;
        try {
            this.conectar();
            sql = "SELECT empleados.id_empleado, empleados.sueldo, empleados.id_puesto, concat(persona.nombre,' ',persona.apellido) as nombre_empleado, puestos.nombre as nombre_puesto, persona.direccion, persona.dpi, persona.nit, persona.telefono_movil "
                    + " FROM empleados "
                    + " INNER JOIN persona on persona.id_persona = empleados.id_empleado "
                    + " INNER JOIN puestos on puestos.id_puesto = empleados.id_puesto "
                    + " WHERE empleados.id_empleado = ?";
            sta = this.getCn().prepareStatement(sql);
            sta.setInt(1, modEmpleado.getIdEmpleado());
            System.out.println("id empleado: "+modEmpleado.getIdEmpleado());
            res = sta.executeQuery();
            lstModEmpleado = new ArrayList<>();
            
            while (res.next()) {
                System.out.println("hola");
                InnerPersonaEmpleado empModelo = new InnerPersonaEmpleado();
                empModelo.setIdEmpleado(res.getInt("id_empleado"));
                empModelo.setNombreEmpleado(res.getString("nombre_empleado"));
                empModelo.setIdPuesto(res.getInt("id_puesto"));
                empModelo.setSueldo(res.getDouble("sueldo"));
                empModelo.setTelefono(res.getInt("telefono_movil"));
                empModelo.setDpiEmpleado(res.getLong("dpi"));
                empModelo.setNit(res.getInt("nit"));
                empModelo.setPuesto("nombre_puesto");
                empModelo.setDireccion("direccion");
                lstModEmpleado.add(empModelo);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar por id: " + e);
        }finally{
            this.cerrar();
        }
        return lstModEmpleado;
    }

    public ArrayList<InnerPersonaEmpleado> listarPorNombre(InnerPersonaEmpleado modEmpleado) throws Exception {
        ArrayList<InnerPersonaEmpleado> lstModEmpleado = null;
        ResultSet res;
        try {
            this.conectar();
            sql = "SELECT empleados.id_empleado, empleados.sueldo, empleados.id_puesto, concat(persona.nombre,' ',persona.apellido) as nombre_empleado, puestos.nombre as nombre_puesto, persona.direccion, persona.dpi, persona.nit, persona.telefono_movil "
                    + " FROM empleados "
                    + " INNER JOIN persona on persona.id_persona = empleados.id_empleado "
                    + " INNER JOIN puestos on puestos.id_puesto = empleados.id_puesto "
                    + " WHERE MATCH(persona.nombre,persona.apellido) AGAINST(?)";
            sta = this.getCn().prepareStatement(sql);
            sta.setString(1, modEmpleado.getNombreEmpleado());
            res = sta.executeQuery();
            lstModEmpleado = new ArrayList<>();
            while (res.next()) {
                InnerPersonaEmpleado empModelo = new InnerPersonaEmpleado();
                empModelo.setIdEmpleado(res.getInt("id_empleado"));
                empModelo.setNombreEmpleado(res.getString("nombre_empleado"));
                empModelo.setIdPuesto(res.getInt("id_puesto"));
                empModelo.setSueldo(res.getDouble("sueldo"));
                empModelo.setTelefono(res.getInt("telefono_movil"));
                empModelo.setDpiEmpleado(res.getLong("dpi"));
                empModelo.setNit(res.getInt("nit"));
                empModelo.setPuesto("nombre_puesto");
                empModelo.setDireccion("direccion");
                lstModEmpleado.add(empModelo);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar por nombre: " + e);
        }finally{
            this.cerrar();
        }
        return lstModEmpleado;
    }    
     public ArrayList<InnerPersonaEmpleado> listarTodoEmpleado() throws Exception {
        ArrayList<InnerPersonaEmpleado> lstModEmpleado = null;
        ResultSet res;
        try {
            this.conectar();
            sql = "SELECT empleados.id_empleado, empleados.sueldo, empleados.id_puesto, concat(persona.nombre,' ',persona.apellido) as nombre_empleado, puestos.nombre as nombrepuesto, persona.direccion, persona.dpi, persona.nit, persona.telefono_movil "
                    + " FROM empleados "
                    + " INNER JOIN persona on persona.id_persona = empleados.id_empleado "
                    + " INNER JOIN puestos on puestos.id_puesto = empleados.id_puesto ";
            sta = this.getCn().prepareStatement(sql);
            res = sta.executeQuery();
            lstModEmpleado = new ArrayList<>();
            
            while (res.next()) {
                InnerPersonaEmpleado empModelo = new InnerPersonaEmpleado();
                empModelo.setIdEmpleado(res.getInt("id_empleado"));
                empModelo.setNombreEmpleado(res.getString("nombre_empleado"));
                empModelo.setIdPuesto(res.getInt("id_puesto"));
                empModelo.setSueldo(res.getDouble("sueldo"));
                empModelo.setTelefono(res.getInt("telefono_movil"));
                empModelo.setDpiEmpleado(res.getLong("dpi"));
                empModelo.setNit(res.getInt("nit"));
                empModelo.setPuesto(res.getString("nombrepuesto"));
                empModelo.setDireccion(res.getString("direccion"));
                lstModEmpleado.add(empModelo);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar por id: " + e);
        }finally{
            this.cerrar();
        }
        return lstModEmpleado;
    }
     
     public void modificarEmpleado(Empleados empleado) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareStatement("UPDATE empleados\n"
                    + "SET id_puesto = ?, sueldo = ? \n"
                    + "WHERE id_empleado =?");

            st.setInt(1, empleado.getId_puesto());
            System.out.println("idpuesto"+empleado.getId_puesto());
            st.setDouble(2, empleado.getSueldo()); 
            System.out.println("sueldo"+empleado.getSueldo());
            st.setInt(3, empleado.getId_empleado());
            System.out.println("id puesto"+empleado.getId_puesto());
          
            
            st.executeUpdate();
            

        } catch (Exception e) {
            System.out.println(" Error Al intentar Modificar empleado DAO" + e);
        } finally {
            this.cerrar();
        }
    }
     
     public List<InnerPersonaEmpleado> listaEmpleados() throws Exception {

        List<InnerPersonaEmpleado> lista2;
        lista2 = new ArrayList();
        ResultSet result;

        try {
            this.conectar();
            PreparedStatement st = this.getCn().prepareCall("select persona.id_persona,persona.nombre,persona.direccion,empleados.sueldo,puestos.nombre as NamePuesto\n"
                    + "from persona INNER JOIN empleados on persona.id_persona=empleados.id_empleado\n"
                    + "INNER JOIN puestos on empleados.id_puesto=puestos.id_puesto");

            result = st.executeQuery();

            while (result.next()) {
                InnerPersonaEmpleado con = new InnerPersonaEmpleado();
                con.setIdEmpleado(Integer.parseInt(result.getString("id_persona")));
                con.setNombreEmpleado(result.getString("nombre"));
                con.setDireccion(result.getString("direccion"));
                con.setPuesto(result.getString("NamePuesto"));
                con.setSueldo(result.getDouble("sueldo"));

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
