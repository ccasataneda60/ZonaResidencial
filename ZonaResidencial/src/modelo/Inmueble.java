package modelo;

import java.util.ArrayList;

public class Inmueble {

	private String due�o;
	private String arrendatario;
	private String codigoInmueble;
	private Double metrosCuadrados;
	private Double costoAdministracion;
	private Integer numeroParqueaderos;
	private Integer numeroBa�os;
	private Integer numeroAlcobas;
	private String estado;
	private boolean arrendado;


	public Double getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(Double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public String getDue�o() {
		return due�o;
	}
	public void setDue�o(String due�o) {
		this.due�o = due�o;
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

}
