package conexionBD;

import java.sql.SQLException;
import java.sql.Statement;

import modelo.AdministradorZona;

public class DAO_Crear {
	
	public DAO_Crear() {

	}

	public void crearAdministradorZonaDAO(AdministradorZona adminZon) {
		Conexion conex = new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate(
			"INSERT INTO administradoreszona (nombreAdmin, usuarioAdmin, contrasenaAdmin) "
			+ "VALUES ('"
			+ adminZon.getNombre() + "', '" 
			+ adminZon.getUsuario() + "', '" 
			+ adminZon.getContrasena() +  "')");			
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
