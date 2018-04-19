package modelo;

public class Casa extends Inmueble {
	private Integer pisos;

	public Integer getPisos() {
		return pisos;
	}

	public void setPisos(Integer pisos) {
		this.pisos = pisos;
	}

	public Casa llenarCasa(Integer due�o, boolean isArrendado, Double costo, String codigo, Double m2, Integer idA,
		Integer nAlcobas, Integer nBa�os, Integer nPArqueaderos, String estado, Integer piso) {
		Casa p = new Casa();
		p.setCodigoInmueble(codigo);
		p.setCostoAdministracion(costo);
		p.setDue�o(due�o);
		p.setEstado(estado);
		p.setMetrosCuadrados(m2);
		p.setNumeroAlcobas(nAlcobas);
		p.setNumeroBa�os(nBa�os);
		p.setNumeroParqueaderos(nPArqueaderos);
		p.setPisos(piso);
		
		
		return p;
	}


}
