package Controlador;

import modelo.AdministradorApp;

public class Facade {
	private static String nombre = "Centro Medico UAN";
	private AdministradorApp a;
	private static Facade fachada = null;

	private Facade() {
		a = new AdministradorApp();
		a.setNombreAdministradorApp(nombre);
	}

	public static Facade getInstance() {
		if (fachada == null) {
			fachada = new Facade();
		}
		return fachada;
	}

	public AdministradorApp getAdministradorApp() {
		return a;
	}

}
