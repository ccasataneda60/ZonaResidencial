package modelo;

import java.util.ArrayList;

public class Inmueble {

	private String nombre;
	private Integer numeroInmueble;
	private Double metrosCuadrados;
	private String bloque;
	private Integer capacidad;
	private boolean calentador;
	private ArrayList<Alcoba> alcobas;
	private ArrayList<Cocina> cocinas;
	private ArrayList<Baño> baños;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
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
	public String getBloque() {
		return bloque;
	}
	public void setBloque(String bloque) {
		this.bloque = bloque;
	}
	public Integer getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	public boolean isCalentador() {
		return calentador;
	}
	public void setCalentador(boolean calentador) {
		this.calentador = calentador;
	}
	public ArrayList<Alcoba> getAlcobas() {
		return alcobas;
	}
	public void setAlcobas(ArrayList<Alcoba> alcobas) {
		this.alcobas = alcobas;
	}
	public ArrayList<Cocina> getCocinas() {
		return cocinas;
	}
	public void setCocinas(ArrayList<Cocina> cocinas) {
		this.cocinas = cocinas;
	}
	public ArrayList<Baño> getBaños() {
		return baños;
	}
	public void setBaños(ArrayList<Baño> baños) {
		this.baños = baños;
	}
}
