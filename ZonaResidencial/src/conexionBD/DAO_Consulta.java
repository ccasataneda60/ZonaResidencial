package conexionBD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import modelo.AdministradorZona;

public class DAO_Consulta {
	
	public AdministradorZona consultarAdmin(String correo) {
		AdministradorZona medico = new AdministradorZona();
		 
		Conexion conex= new Conexion();
		    
		 try {
		  PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM administradoreszona where usuarioAdmin= ? ");
		  consulta.setString(1, correo);
		  ResultSet res = consulta.executeQuery();
		   
		 if(res.next()){
		   medico.setNombre(res.getString("nombreAdmin"));
		   medico.setUsuario(res.getString("usuarioAdmin"));
		   medico.setContrasena(res.getString("contrasenaAdmin"));

		         }
		         res.close();
		         consulta.close();
		         conex.desconectar();
		   
		 } catch (Exception e) {
		  JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);
		 }
		 return medico;
		}
}
