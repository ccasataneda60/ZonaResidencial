package modelo;

import java.util.ArrayList;

import conexionBD.DAO_Consulta;

public class AdministradorApp {
	private String nombreAdministradorApp = "Zona Residencial UAN";
	private ArrayList<AdministradorZona> lstAdmin = new ArrayList<AdministradorZona>();
	
	public AdministradorApp(){
		
	}
	
	public void crearAdministrador(AdministradorZona adminZon) {
		lstAdmin.add(adminZon);
	}
	
	public AdministradorZona buscarAdmin(AdministradorZona adZon, String nombre){
		for(int i=0; i<getLstAdmin().size();i++){
			if(getLstAdmin().get(i).getNombre().equals(nombre)){
				adZon = (AdministradorZona) getLstAdmin().get(i);
			}
		}
		return adZon;
	}
	
	public void eliminarAdmin(String nombre) {
		for (int i = 0; i < lstAdmin.size(); i++) {
			if (lstAdmin.get(i).getNombre().equals(nombre)) {
				lstAdmin.remove(i);
			}
		}
	}
	
	public void comprobarContrasena(String correo, String contrasena){
		System.out.println("dao");
		DAO_Consulta dao = new DAO_Consulta();
		if(dao.consultarAdmin(correo).getContrasena().equals(contrasena)){
			System.out.println("sisas");
		}
	}

	public String getNombreAdministradorApp() {
		return nombreAdministradorApp;
	}

	public void setNombreAdministradorApp(String nombreAdministradorApp) {
		this.nombreAdministradorApp = nombreAdministradorApp;
	}

	public ArrayList<AdministradorZona> getLstAdmin() {
		return lstAdmin;
	}

	public void setLstAdmin(ArrayList<AdministradorZona> lstAdmin) {
		this.lstAdmin = lstAdmin;
	}
}
