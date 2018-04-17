package modelo;

public class Alcoba extends PartesInmueble {
	private boolean hayBaño;
	private Baño baño;
	public boolean isHayBaño() {
		return hayBaño;
	}
	public void setHayBaño(boolean hayBaño) {
		this.hayBaño = hayBaño;
	}
	public Baño getBaño() {
		return baño;
	}
	public void setBaño(Baño baño) {
		this.baño = baño;
	}
}
