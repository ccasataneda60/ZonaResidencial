package conexionBD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;


import modelo.Casa;

public class CasaDAO extends InmuebleDAO {
	private Casa m = new Casa();
	public void crearCasa(Casa p) {
		ConexionBD conex = new ConexionBD();
		try {

			Statement sentencia = conex.getConnection().createStatement();
			sentencia.executeUpdate("INSERT INTO casa (Inmueble_codigoInmueble,pisos) VALUES  " + "('"
					+ p.getCodigoInmueble() + "', '" + p.getPisos() + "')");
			JOptionPane.showMessageDialog(null, "Se ha registrado la Casa", "Información",
					JOptionPane.INFORMATION_MESSAGE);
			sentencia.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			// JOptionPane.showMessageDialog(null, "No se Registro la persona");
		}
	}

	public ArrayList<Casa> listarCasas() {
		ArrayList<Casa> casas = new ArrayList<Casa>();
		ConexionBD conex = new ConexionBD();

		try {
			PreparedStatement consulta = conex.getConnection()
					.prepareStatement("SELECT * FROM inmueble join casa on Inmueble_codigoInmueble=codigoInmueble");
			ResultSet res = consulta.executeQuery();
			while (res.next()) {

				
				casas.add(m.llenarCasa(res.getInt("idPersona"), (Boolean.valueOf(res.getString("arrendado"))),
						Double.valueOf(res.getString("costoAdministracion")), res.getString("codigoInmueble"),
						res.getDouble("metrosCuadrados"), res.getInt("idArrendatario"), res.getInt("numeroAlcobas"),
						res.getInt("numeroBanios"), res.getInt("numeroParqueaderos"), res.getString("estado"),
						res.getInt("pisos")));
			}
			res.close();
			consulta.close();
			conex.desconectar();

		} catch (Exception e) {
			conex.desconectar();

		}
		return casas;
	}
 	public Casa consultarMedico(String codigoInmueble) {
		  Casa c = new Casa();
		  ConexionBD conex= new ConexionBD();
		     
		  try {
		   PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM inmueble join casa on Inmueble_codigoInmueble=codigoInmueble where codigoInmueble= ? ");
		   consulta.setString(1, codigoInmueble);
		   ResultSet res = consulta.executeQuery();
		    
		  if(res.next()){
		   c=m.llenarCasa(res.getInt("idPersona"), (Boolean.valueOf(res.getString("arrendado"))),
					Double.valueOf(res.getString("costoAdministracion")), res.getString("codigoInmueble"),
					res.getDouble("metrosCuadrados"), res.getInt("idArrendatario"), res.getInt("numeroAlcobas"),
					res.getInt("numeroBanios"), res.getInt("numeroParqueaderos"), res.getString("estado"),
					res.getInt("pisos"));

		          }
		          res.close();
		          consulta.close();
		          conex.desconectar();
		    
		  } catch (Exception e) {
		   JOptionPane.showMessageDialog(null, "no se pudo consultar la Persona\n"+e);
		  }
		  return c;
		 }
}
