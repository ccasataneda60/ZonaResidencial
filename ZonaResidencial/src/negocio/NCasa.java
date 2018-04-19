package negocio;

import conexionBD.InmuebleDAO;
import modelo.Casa;

public class NCasa extends NInmueble {
	private InmuebleDAO pDAO= new InmuebleDAO();
	public void crearInmueble(Casa p){
		pDAO.crearInmueble(p);
	}

}
