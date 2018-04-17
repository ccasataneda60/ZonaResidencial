package modelo;

public class Baño extends PartesInmueble{
	private boolean bañera;
	private boolean jacuzzi;
	public boolean isBañera() {
		return bañera;
	}
	public void setBañera(boolean bañera) {
		this.bañera = bañera;
	}
	public boolean isJacuzzi() {
		return jacuzzi;
	}
	public void setJacuzzi(boolean jacuzzi) {
		this.jacuzzi = jacuzzi;
	}
}
