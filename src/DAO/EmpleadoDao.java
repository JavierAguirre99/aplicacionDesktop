package DAO;

import Modelo.Empleados;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javam
 */
public class EmpleadoDao extends DAO{
    private String sql;
    private PreparedStatement sta;
    
    public ArrayList<Empleados> listarEmpleado(){
        ArrayList<Empleados> lstEmpleado = null;
        try {
            this.conectar();
            sql="SELECT concat(persona.nombre,' ',persona.apellido) as empleado, empleados.id_empleado "
                    + "FROM empleados INNER JOIN persona on persona.id_persona=empleados.id_empleado";
            sta = this.getCn().prepareStatement(sql);
            sta.executeQuery();
            
        } catch (Exception ex) {
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lstEmpleado;
    }
    
}
