package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Controlador.Facade;
import modelo.AdministradorApp;
import modelo.AdministradorZona;

public class ConsultarAdministrador extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JButton btnVolver;
	private JButton btnVerAdmin;
	private JLabel nomAdmin;
	private JLabel usuAdmin;
	private JLabel conAdmin;
	private JTextField txtNomAdmin;
	private JTextField txtUsuAdmin;
	private JTextField txtConAdmin;
	private JComboBox<String> listaAdmin;
	private AdministradorZona adminZon = new AdministradorZona();
	
	private AdministradorApp a = Facade.getInstance().getAdministradorApp();
	
	public ConsultarAdministrador(){
		super();
		this.setTitle("Consultar Administrador");
		this.setSize(400, 340);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.crearEtiquetas();
		this.crearIngresoDatos();
		this.crearBotones();
	}

	private void crearEtiquetas() {
		this.nomAdmin=new JLabel();
		this.nomAdmin.setText("Nombre");
		this.nomAdmin.setBounds(10, 30, 200, 80);
		this.add(nomAdmin);
		
		this.usuAdmin=new JLabel();
		this.usuAdmin.setText("Usuario");
		this.usuAdmin.setBounds(10, 60, 200, 80);
		this.add(usuAdmin);
		
		this.conAdmin=new JLabel();
		this.conAdmin.setText("Complejidad");
		this.conAdmin.setBounds(10, 90, 200, 80);
		this.add(conAdmin);
	}
	
	private void crearIngresoDatos() {
		this.txtNomAdmin=new JTextField();
		this.txtNomAdmin.setEditable(false);
		this.txtNomAdmin.setBounds(90, 60, 180, 20);
		this.add(txtNomAdmin);
		
		this.txtUsuAdmin=new JTextField();
		this.txtUsuAdmin.setEditable(false);
		this.txtUsuAdmin.setBounds(90, 90, 180, 20);
		this.add(txtUsuAdmin);
		
		this.txtConAdmin=new JTextField();
		this.txtConAdmin.setEditable(false);
		this.txtConAdmin.setBounds(90, 120, 180, 20);
		this.add(txtConAdmin);
	}
	
	private void crearBotones() {
		this.btnVolver=new JButton();
		this.btnVolver.setText("Volver");
		this.btnVolver.setBounds(130, 275, 120, 20);
		btnVolver.addActionListener(this);
		this.add(btnVolver);
		
		this.btnVerAdmin=new JButton();
		this.btnVerAdmin.setText("Visualizar Administrador");
		this.btnVerAdmin.setBounds(200, 20, 174, 20);
		btnVerAdmin.addActionListener(this);
		this.add(btnVerAdmin);
		
		this.listaAdmin = new JComboBox<String>();
		this.listaAdmin.setBounds(10, 20, 149, 20);
		this.add(listaAdmin);
		this.leerServicios();
	}
	public void actionPerformed(ActionEvent e) {	
		if(e.getSource()==btnVolver){
			VentanaPrincipal ventana = new VentanaPrincipal();
			ventana.setVisible(true);
			setVisible(false);
		}
		
		if(e.getSource()==btnVerAdmin){
			llenarServicios();
		}
	}
	
	private void leerServicios() {
		DefaultComboBoxModel<String> slista = new DefaultComboBoxModel<String>();
		for (int i = 0; i < a.getLstAdmin().size(); i++) {
			slista.addElement(a.getLstAdmin().get(i).getNombre());
		}
		listaAdmin.setModel(slista);
		getContentPane().add(listaAdmin);
	}
	
	private void llenarServicios() {
		String nombre = (String) listaAdmin.getSelectedItem();
		adminZon = a.buscarAdmin(adminZon, nombre);
		txtNomAdmin.setText(adminZon.getNombre());
		txtUsuAdmin.setText(adminZon.getUsuario());
		txtConAdmin.setText(adminZon.getContrasena());
	}
}
