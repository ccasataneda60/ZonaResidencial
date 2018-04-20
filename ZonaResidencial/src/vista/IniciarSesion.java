package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controlador.Facade;
import modelo.AdministradorApp;

public class IniciarSesion extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JLabel usuario;
	private JLabel contrasena;
	private JTextField txtUsuario;
	private JPasswordField txtContrasena;
	private JButton btnIniciarSesion;
	private JButton btnSalir;
	private AdministradorApp a = Facade.getInstance().getAdministradorApp();
	
	public IniciarSesion(){
		super();
		this.setTitle("Login");
		this.setSize(400, 200);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.crearEtiquetas();
		this.crearIngresoDeDatos();
		this.crearBotones();
	}
	
	private void crearEtiquetas() {
		this.usuario=new JLabel();
		this.usuario.setText("Usuario");
		this.usuario.setBounds(10, 10, 200, 80);
		this.add(usuario);
		
		this.contrasena=new JLabel();
		this.contrasena.setText("Contrasena");
		this.contrasena.setBounds(10, 35, 200, 80);
		this.add(contrasena);
	}

	private void crearIngresoDeDatos() {
		this.txtUsuario=new JTextField();
		this.txtUsuario.setBounds(90, 35, 180, 20);
		this.add(txtUsuario);
		
		this.txtContrasena=new JPasswordField();
		this.txtContrasena.setBounds(90, 65, 180, 20);
		this.add(txtContrasena);
	}

	private void crearBotones() {
		this.btnIniciarSesion=new JButton();
		this.btnIniciarSesion.setText("Iniciar Sesion");
		this.btnIniciarSesion.setBounds(60, 110, 120, 20);
		btnIniciarSesion.addActionListener(this);
		this.add(btnIniciarSesion);
		
		this.btnSalir=new JButton();
		this.btnSalir.setText("Salir");
		this.btnSalir.setBounds(200, 110, 120, 20);
		btnSalir.addActionListener(this);
		this.add(btnSalir);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnSalir){
			VentanaPrincipal login = new VentanaPrincipal();
			login.setVisible(true);
			setVisible(false);
		}
		
		if(e.getSource().equals(btnIniciarSesion)){
			a.comprobarContrasena((String)txtUsuario.getText(), (String)txtContrasena.getText());
		}
	}

	public void limpiarFormulario() {
		txtUsuario.setText("");
		txtContrasena.setText("");
	}	
}
