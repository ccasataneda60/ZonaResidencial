package modelo;

public class Alcoba extends PartesInmueble {
	private boolean hayBa�o;
	private Ba�o ba�o;
	public boolean isHayBa�o() {
		return hayBa�o;
	}
	public void setHayBa�o(boolean hayBa�o) {
		this.hayBa�o = hayBa�o;
	}
	public Ba�o getBa�o() {
		return ba�o;
	}
	public void setBa�o(Ba�o ba�o) {
		this.ba�o = ba�o;
	}
}
