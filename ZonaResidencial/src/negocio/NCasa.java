package negocio;

import java.util.ArrayList;

import conexionBD.*;
import modelo.Casa;

public class NCasa extends NInmueble {
	private CasaDAO cDAO= new CasaDAO();
	private ArrayList<Casa> casas=new ArrayList<Casa>();
	public void crearCasa(Casa p){
		cDAO.crearInmueble(p);
		cDAO.crearCasa(p);
	}
	public ArrayList<Casa> listarCasas(){
		casas=cDAO.listarCasas();
		return casas;
	}
	public Casa buscaCasa(String codigo){
		return cDAO.consultarMedico(codigo);
		
	}

}
