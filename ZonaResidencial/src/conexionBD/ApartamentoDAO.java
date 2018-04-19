package conexionBD;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import modelo.*;

public class ApartamentoDAO extends InmuebleDAO {
	public void crearApartamento(Apartamento p) 
	{
		ConexionBD conex= new ConexionBD();
		try {
			Statement sentencia = conex.getConnection().createStatement();
			sentencia.executeUpdate
			("INSERT INTO casa (Inmueble_codigoInmueble,pisos) VALUES  "
					+ "('"+p.getCodigoInmueble()+"', '"+p.getPiso()
					+"')");

			JOptionPane.showMessageDialog(null, "Se ha registrado la Casa","Información",JOptionPane.INFORMATION_MESSAGE);
			sentencia.close();
			conex.desconectar();
    
		}catch (SQLException e) {
           System.out.println(e.getMessage());
          // JOptionPane.showMessageDialog(null, "No se Registro la persona");
		}
	}
}
