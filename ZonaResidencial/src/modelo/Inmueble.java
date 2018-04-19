package modelo;

import java.util.ArrayList;

public class Inmueble {

	private Integer dueño;
	private Integer arrendatario;
	private String codigoInmueble;
	private Double metrosCuadrados;
	private Double costoAdministracion;
	private Integer numeroParqueaderos;
	private Integer numeroBaños;
	private Integer numeroAlcobas;
	private String estado;
	private boolean arrendado;
	private Inmueble p;

	public Double getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(Double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public Integer getDueño() {
		return dueño;
	}
	public void setDueño(Integer dueño) {
		this.dueño = dueño;
	}
	public Integer getArrendatario() {
		return arrendatario;
	}
	public void setArrendatario(Integer arrendatario) {
		this.arrendatario = arrendatario;
	}
	public Double getCostoAdministracion() {
		return costoAdministracion;
	}
	public void setCostoAdministracion(Double costoAdministracion) {
		this.costoAdministracion = costoAdministracion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public boolean isArrendado() {
		return arrendado;
	}
	public void setArrendado(boolean arrendado) {
		this.arrendado = arrendado;
	}
	public Integer getNumeroParqueaderos() {
		return numeroParqueaderos;
	}
	public void setNumeroParqueaderos(Integer numeroParqueaderos) {
		this.numeroParqueaderos = numeroParqueaderos;
	}
	public Integer getNumeroBaños() {
		return numeroBaños;
	}
	public void setNumeroBaños(Integer numeroBaños) {
		this.numeroBaños = numeroBaños;
	}
	public Integer getNumeroAlcobas() {
		return numeroAlcobas;
	}
	public void setNumeroAlcobas(Integer numeroAlcobas) {
		this.numeroAlcobas = numeroAlcobas;
	}
	public String getCodigoInmueble() {
		return codigoInmueble;
	}
	public void setCodigoInmueble(String codigoInmueble) {
		this.codigoInmueble = codigoInmueble;
	}
	public Inmueble llenarInmueble(Integer dueño, boolean isArrendado, Double costo, String codigo, Double m2, Integer idA,
			Integer nAlcobas, Integer nBaños, Integer nPArqueaderos, String estado, Integer piso){
		p= new Inmueble();
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
		return p;
	}

}
