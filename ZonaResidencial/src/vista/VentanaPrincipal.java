package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JButton btnCrearAdmin;
	private JButton btnConsultarAdmin;
	private JButton btnModificarAdmin;
	private JButton btnEliminarAdmin;
	private JButton btnInicioSesionAdmin;
	
	public VentanaPrincipal(){
		super();
		this.setTitle("Administrador Aplicacion");
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.crearBotones();
	}
	private void crearBotones() {
		this.btnCrearAdmin=new JButton();
		this.btnCrearAdmin.setText("Crear Administrador");
		this.btnCrearAdmin.setBounds(50, 50, 180, 20);
		btnCrearAdmin.addActionListener(this);
		this.add(btnCrearAdmin);
		
		this.btnConsultarAdmin=new JButton();
		this.btnConsultarAdmin.setText("Consultar Administrador");
		this.btnConsultarAdmin.setBounds(50, 80, 180, 20);
		btnConsultarAdmin.addActionListener(this);
		this.add(btnConsultarAdmin);
		
		this.btnModificarAdmin=new JButton();
		this.btnModificarAdmin.setText("Modificar Administrador");
		this.btnModificarAdmin.setBounds(50, 110, 180, 20);
		btnModificarAdmin.addActionListener(this);
		this.add(btnModificarAdmin);
		
		this.btnEliminarAdmin=new JButton();
		this.btnEliminarAdmin.setText("Eliminar Administrador");
		this.btnEliminarAdmin.setBounds(50, 140, 180, 20);
		btnEliminarAdmin.addActionListener(this);
		this.add(btnEliminarAdmin);
		
		this.btnInicioSesionAdmin=new JButton();
		this.btnInicioSesionAdmin.setText("Iniciar Sesion");
		this.btnInicioSesionAdmin.setBounds(50, 170, 180, 20);
		btnInicioSesionAdmin.addActionListener(this);
		this.add(btnInicioSesionAdmin);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnInicioSesionAdmin)){
			IniciarSesion login = new IniciarSesion();
			login.setVisible(true);
			setVisible(false);
		}
		
		if(e.getSource().equals(btnCrearAdmin)){
			CrearAdministrador vc = new CrearAdministrador();
			vc.setVisible(true);
			setVisible(false);
		}
		
		if(e.getSource().equals(btnConsultarAdmin)){
			ConsultarAdministrador vb = new ConsultarAdministrador();
			vb.setVisible(true);
			setVisible(false);
		}
		
		if(e.getSource().equals(btnModificarAdmin)){
			ModificarAdministrador mod = new ModificarAdministrador();
			mod.setVisible(true);dispose();
			setVisible(false);
		}
		
		if(e.getSource().equals(btnEliminarAdmin)){
			EliminarAdministrador vb = new EliminarAdministrador();
			vb.setVisible(true);
			setVisible(false);
		}
	}
}
