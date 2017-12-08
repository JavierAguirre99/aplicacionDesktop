package DAO;

import Modelo.Empleados;
import Modelo.Puesto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javam
 */
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
                    + " where id_persona not in (select clientes.id_cliente from clientes)";
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
            System.err.println("Error al listar no empleado: "+ex);
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
        }

        return lstModPuesto;
    }
}
