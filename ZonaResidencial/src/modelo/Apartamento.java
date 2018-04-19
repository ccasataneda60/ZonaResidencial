package modelo;

public class Apartamento extends Inmueble {
	private Integer piso;

	public Integer getPiso() {
		return piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}
	public Apartamento llenarApartamento(Integer dueño, boolean isArrendado, Double costo, String codigo, Double m2, Integer idA,
			Integer nAlcobas, Integer nBaños, Integer nPArqueaderos, String estado, Integer piso) {
		Apartamento p = new Apartamento();
		p.setArrendado(isArrendado);
		p.setArrendatario(idA);
		p.setCodigoInmueble(codigo);
		p.setCostoAdministracion(costo);
		p.setDueño(dueño);
		p.setEstado(estado);
		p.setMetrosCuadrados(m2);
		p.setNumeroAlcobas(nAlcobas);
		p.setNumeroBaños(nBaños);
		p.setNumeroParqueaderos(nPArqueaderos);
		p.setPiso(piso);

		return p;
	}


}
