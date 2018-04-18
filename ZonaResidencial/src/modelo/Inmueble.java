package modelo;

import java.util.ArrayList;

public class Inmueble {

	private String dueño;
	private String arrendatario;
	private String codigoInmueble;
	private Double metrosCuadrados;
	private Double costoAdministracion;
	private Integer numeroParqueaderos;
	private Integer numeroBaños;
	private Integer numeroAlcobas;
	private String estado;
	private boolean arrendado;


	public Double getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(Double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public String getDueño() {
		return dueño;
	}
	public void setDueño(String dueño) {
		this.dueño = dueño;
	}
	public String getArrendatario() {
		return arrendatario;
	}
	public void setArrendatario(String arrendatario) {
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

}
