package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import conexionBD.DAO_Crear;
import Controlador.Facade;
import modelo.AdministradorApp;
import modelo.AdministradorZona;

public class CrearAdministrador extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JLabel nombreAdmin;
	private JLabel UsuarioAdmin;
	private JLabel ContrasenaAdmin;
	private JTextField txtNombreAdmin;
	private JTextField txtUsuarioAdmin;
	private JTextField txtContrasenaAdmin;
	private JButton btnCrearAdmin;
	private JButton btnVolver;
	private AdministradorZona AdminZon;
	private DAO_Crear dao = new DAO_Crear();
	private AdministradorApp a = Facade.getInstance().getAdministradorApp();
	
	public CrearAdministrador(){
		super();
		this.setTitle("Crear Servicio");
		this.setSize(400, 280);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.crearEtiquetas();
		this.crearIngreseDatos();
		this.crearBotones();
	}
	private void crearEtiquetas() {
		this.nombreAdmin=new JLabel();
		this.nombreAdmin.setText("Nombre");
		this.nombreAdmin.setBounds(10, 5, 200, 80);
		this.add(nombreAdmin);
		
		this.UsuarioAdmin=new JLabel();
		this.UsuarioAdmin.setText("Usuario");
		this.UsuarioAdmin.setBounds(10, 35, 200, 80);
		this.add(UsuarioAdmin);
		
		this.ContrasenaAdmin=new JLabel();
		this.ContrasenaAdmin.setText("Contraseña");
		this.ContrasenaAdmin.setBounds(10, 65, 200, 80);
		this.add(ContrasenaAdmin);
	}
	
	private void crearIngreseDatos() {
		this.txtNombreAdmin=new JTextField();
		this.txtNombreAdmin.setBounds(90, 35, 180, 20);
		this.add(txtNombreAdmin);
		
		this.txtUsuarioAdmin=new JTextField();
		this.txtUsuarioAdmin.setBounds(90, 65, 180, 20);
		this.add(txtUsuarioAdmin);
		
		this.txtContrasenaAdmin=new JTextField();
		this.txtContrasenaAdmin.setBounds(90, 95, 180, 20);
		this.add(txtContrasenaAdmin);
	}
	
	private void crearBotones() {
		this.btnCrearAdmin=new JButton();
		this.btnCrearAdmin.setText("Crear");
		this.btnCrearAdmin.setBounds(40, 200, 120, 20);
		btnCrearAdmin.addActionListener(this);
		this.add(btnCrearAdmin);
		
		this.btnVolver=new JButton();
		this.btnVolver.setText("Volver");
		this.btnVolver.setBounds(180, 200, 120, 20);
		btnVolver.addActionListener(this);
		this.add(btnVolver);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCrearAdmin) {
			if (txtNombreAdmin.getText().equals("") || txtUsuarioAdmin.getText().equals("")
					|| txtContrasenaAdmin.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Completa el formulario");
			} else {
				AdminZon = new AdministradorZona();
				AdminZon.setNombre(txtNombreAdmin.getText());
				AdminZon.setUsuario(txtUsuarioAdmin.getText());
				AdminZon.setContrasena(txtContrasenaAdmin.getText());
				a.crearAdministrador(AdminZon);
				dao.crearAdministradorZonaDAO(AdminZon);
				JOptionPane.showMessageDialog(null, "Administrador Creado Exitosamente");
				limpiarFormulario();
			}
		}
		
		if(e.getSource()==btnVolver){
			VentanaPrincipal ventana = new VentanaPrincipal();
			ventana.setVisible(true);
			setVisible(false);
		}
	}
	
	private void limpiarFormulario() {
		txtNombreAdmin.setText("");
		txtUsuarioAdmin.setText("");
		txtContrasenaAdmin.setText("");
	}
}
