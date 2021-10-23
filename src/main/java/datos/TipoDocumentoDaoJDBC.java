package datos;

import domain.TipoDocumento;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TipoDocumentoDaoJDBC {

    private static final String SQL_SELECT = "SELECT * FROM tiposDocumento";

    public List<TipoDocumento> listarDocumentos{
    Connection conn = null;
    PreparedStatement smt = null;
    ResultSet rs = null;
    List<TipoDocumento> tiposDoc = new ArrayList<TipoDocumento>();
        /*
    Connection conn = null;
        PreparedStatement smt = null;
        ResultSet rs = null;
        EmpleadoDTO empleado = null;

        List<EmpleadoDTO> empleados = new ArrayList<EmpleadoDTO>();
        try {
            conn = Conexion.getConnection();
            smt = conn.prepareStatement(SQL_SELECT_EMPLEADOS);
            rs = smt.executeQuery();
            while (rs.next()) {
                int idEmpleado = rs.getInt("id_cliente");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String tipoDocumento = rs.getString("TipoDocumento");
                String numDoc = rs.getString("numDoc");
                String Area = rs.getString("Area");
                String SubArea = rs.getString("SubArea");

                empleado = new EmpleadoDTO(idEmpleado, nombre, apellido, tipoDocumento, numDoc, Area, SubArea);
                empleados.add(empleado);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(smt);
            Conexion.close(conn);
        }

        return empleados;
    
    */
    }

}
