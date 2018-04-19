package modelo;

import java.util.ArrayList;

public class Inmueble {

	private Integer due�o;
	private Integer arrendatario;
	private String codigoInmueble;
	private Double metrosCuadrados;
	private Double costoAdministracion;
	private Integer numeroParqueaderos;
	private Integer numeroBa�os;
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

	public Integer getDue�o() {
		return due�o;
	}
	public void setDue�o(Integer due�o) {
		this.due�o = due�o;
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
	public Integer getNumeroBa�os() {
		return numeroBa�os;
	}
	public void setNumeroBa�os(Integer numeroBa�os) {
		this.numeroBa�os = numeroBa�os;
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
	public Inmueble llenarInmueble(Integer due�o, boolean isArrendado, Double costo, String codigo, Double m2, Integer idA,
			Integer nAlcobas, Integer nBa�os, Integer nPArqueaderos, String estado, Integer piso){
		p= new Inmueble();
		p.setArrendado(isArrendado);
		p.setArrendatario(idA);
		p.setCodigoInmueble(codigo);
		p.setCostoAdministracion(costo);
		p.setDue�o(due�o);
		p.setEstado(estado);
		p.setMetrosCuadrados(m2);
		p.setNumeroAlcobas(nAlcobas);
		p.setNumeroBa�os(nBa�os);
		p.setNumeroParqueaderos(nPArqueaderos);
		return p;
	}

}
