package conexionBD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Inmueble;


public class InmuebleDAO {
	public void crearInmueble(Inmueble p) 
	{
		ConexionBD conex= new ConexionBD();
		try {
			Statement sentencia = conex.getConnection().createStatement();
			sentencia.executeUpdate
			("INSERT INTO inmueble (codigoInmueble,idpersona"
					+ ",metroscuadrados,"
					+ "idarrendatario,"
					+ "numeroParqueaderos,numeroBanios,numeroAlcobas,arrendado,"
					+ "estado,costoadministracion) VALUES  "
					+ "('"+p.getCodigoInmueble()+"', '"+p.getDue�o()+"', '"
					+p.getMetrosCuadrados()+"','"
					+p.getArrendatario()+"','"
					+p.getNumeroParqueaderos()+"','"
					+p.getNumeroBa�os()+"','"
					+p.getNumeroAlcobas()+"',"
					+p.isArrendado()+",'"
					+p.getEstado()+"','"
					+p.getCostoAdministracion()
					+"')");
			//JOptionPane.showMessageDialog(null, "Se ha registrado el inmueble","Informaci�n",JOptionPane.INFORMATION_MESSAGE);
			sentencia.close();
			conex.desconectar();
    
		}catch (SQLException e) {
           System.out.println(e.getMessage());
          // JOptionPane.showMessageDialog(null, "No se Registro la persona");
		}
	}

}
