package conexionBD;

import java.sql.SQLException;
import java.sql.Statement;

import modelo.AdministradorZona;

public class DAO_Modificar {
	
	public DAO_Modificar(){
		
	}
	
	public void modificarAdministradorDAO(AdministradorZona adZon) {
		Conexion conex = new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("UPDATE administradoreszona SET usuarioAdmin = '" 
			+ adZon.getUsuario() + "', contrasenaAdmin = '" 
			+ adZon.getContrasena()+ "' WHERE nombreAdmin = '"
			+ adZon.getNombre() + "' ");
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
	}
}
