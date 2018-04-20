package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import conexionBD.DAO_Modificar;
import Controlador.Facade;
import modelo.AdministradorApp;
import modelo.AdministradorZona;

public class ModificarAdministrador extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JButton btnVolver;
	private JButton btnVerAdmin;
	private JButton btnModificarAdmin;
	private JLabel nomAdmin;
	private JLabel usuAdmin;
	private JLabel conAdmin;
	private JTextField txtNomAdmin;
	private JTextField txtUsuAdmin;
	private JTextField txtConAdmin;
	private JComboBox<String> listaAdmin;
	private DAO_Modificar dao=new DAO_Modificar();
	private AdministradorZona adminZon = new AdministradorZona();
	private AdministradorApp a = Facade.getInstance().getAdministradorApp();
	
	public ModificarAdministrador(){
		super();
		this.setTitle("Modificar Administrador");
		this.setSize(400, 300);
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
		this.conAdmin.setText("Contraseña");
		this.conAdmin.setBounds(10, 90, 200, 80);
		this.add(conAdmin);
	}
	private void crearIngresoDatos() {
		this.txtNomAdmin=new JTextField();
		this.txtNomAdmin.setBounds(90, 60, 180, 20);
		this.add(txtNomAdmin);
		
		this.txtUsuAdmin=new JTextField();
		this.txtUsuAdmin.setBounds(90, 90, 180, 20);
		this.add(txtUsuAdmin);
		
		this.txtConAdmin=new JTextField();
		this.txtConAdmin.setBounds(90, 120, 180, 20);
		this.add(txtConAdmin);
	}
	private void crearBotones() {
		this.btnVolver=new JButton();
		this.btnVolver.setText("Volver");
		this.btnVolver.setBounds(200, 210, 120, 20);
		btnVolver.addActionListener(this);
		this.add(btnVolver);
		
		this.btnVerAdmin=new JButton();
		this.btnVerAdmin.setText("Visualizar Servicio");
		this.btnVerAdmin.setBounds(200, 20, 140, 20);
		btnVerAdmin.addActionListener(this);
		this.add(btnVerAdmin);
		
		this.btnModificarAdmin=new JButton();
		this.btnModificarAdmin.setText("Modificar Servicio");
		this.btnModificarAdmin.setBounds(20, 210, 140, 20);
		btnModificarAdmin.addActionListener(this);
		this.add(btnModificarAdmin);
		
		this.listaAdmin = new JComboBox<String>();
		this.listaAdmin.setBounds(10, 20, 149, 20);
		this.add(listaAdmin);
		this.leerServicios();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String nombre = (String) listaAdmin.getSelectedItem();
		adminZon = a.buscarAdmin(adminZon, nombre);
		
		if(e.getSource()==btnVolver){
			VentanaPrincipal ventana = new VentanaPrincipal();
			ventana.setVisible(true);
			setVisible(false);
		}
		
		if(e.getSource()==btnVerAdmin){
			llenarServicios();
		}
		
		if(e.getSource()==btnModificarAdmin){
			adminZon.setNombre(txtNomAdmin.getText());
			adminZon.setUsuario(txtUsuAdmin.getText());
			adminZon.setContrasena(txtConAdmin.getText());
			dao.modificarAdministradorDAO(adminZon);
			ModificarAdministrador eli= new ModificarAdministrador();
			this.setVisible(false);
			eli.setVisible(true);
			JOptionPane.showMessageDialog(null, "Administrador Modificado");
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
