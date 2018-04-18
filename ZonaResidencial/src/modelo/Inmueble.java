package modelo;

import java.util.ArrayList;

public class Inmueble {

	private String due�o;
	private String arrendatario;
	private Integer numeroInmueble;
	private Double metrosCuadrados;
	private Double costoAdministracion;
	private Integer capacidad;
	private Integer numeroParqueaderos;
	private String estado;
	private boolean arrendado;

	public Integer getNumeroInmueble() {
		return numeroInmueble;
	}
	public void setNumeroInmueble(Integer numeroInmueble) {
		this.numeroInmueble = numeroInmueble;
	}
	public Double getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(Double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public Integer getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
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

}
