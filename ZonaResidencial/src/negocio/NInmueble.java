package negocio;

import conexionBD.InmuebleDAO;
import modelo.Inmueble;

public class NInmueble {
	private InmuebleDAO pDAO= new InmuebleDAO();
	public void crearInmueble(Inmueble p){
		pDAO.crearInmueble(p);
	}
}
