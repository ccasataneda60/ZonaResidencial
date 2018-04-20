package conexionBD;

import java.sql.SQLException;
import java.sql.Statement;

import modelo.AdministradorZona;

public class DAO_Eliminar {
	
	public DAO_Eliminar(){
		
	}
	
	public void eliminarServicioDAO(AdministradorZona adminZon) {
		Conexion conex = new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("DELETE from administradoreszona WHERE nombreAdmin= '" + 
			adminZon.getNombre()+"'");
			conex.desconectar();

		} catch (SQLException e1) {
			
		}
	}
}
