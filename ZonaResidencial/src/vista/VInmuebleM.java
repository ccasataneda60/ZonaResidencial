package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.Apartamento;
import modelo.Casa;
import modelo.Inmueble;
import negocio.NApartamento;
import negocio.NCasa;

public class VInmuebleM extends JFrame implements ActionListener {
	private Inmueble p = new Inmueble();
	private Casa c=new Casa();
	private Apartamento a=new Apartamento();
	private NCasa nc=new NCasa();
	private JPanel contentPane;
	private JTextField dueñoJT;
	private JTextField costoAdmin;
	private JTextField arrendatarioJT;
	private JTextField metrosCuadrados;
	private JLabel dueñoE;
	private JLabel numeroBaños;
	private JLabel lblNumeroDeAlcobas;
	private JLabel nParqueaderos;
	private JLabel costoAdminLB;
	private JLabel lblTipoInmueble;
	private JLabel estado;
	private JLabel lblMetrosCuadrados;
	private JLabel lblInmuebleArrendado;
	private JLabel arrendatario;
	private JLabel pisoAptoLB;
	private JLabel pisosCasa;
	private JComboBox numeroBañosCB;
	private JComboBox numeroAlcobasCB;
	private JComboBox nParqueaderosCB;
	private JComboBox tipoInmuebleCB;
	private JComboBox estadoInmuebleCB;
	private JComboBox pisosCasaCB;
	private JComboBox pisoApto;
	private JCheckBox no;
	private JCheckBox si;
	private JButton btnAgregarDueño;
	private JButton btnModificarD;
	private JButton registrarArrendatario;
	private JButton guardar;
	private JButton cancelar;
	private String tipoInmueble;
	private JLabel codigoInmueble;
	private JTextField codigoInmuebleJT;

	public VInmuebleM(Inmueble casaCargada) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		p=casaCargada;
		this.etiqueta(casaCargada);
		this.campos(casaCargada);
		this.combobox(casaCargada);
		this.checkbox(casaCargada);
		this.botones(casaCargada);

	}

	private void etiqueta(Inmueble casaCargada) {
		dueñoE = new JLabel("Due\u00F1o del inmueble");
		dueñoE.setBounds(32, 57, 163, 14);
		contentPane.add(this.dueñoE);

		numeroBaños = new JLabel("Numero de Ba\u00F1os");
		numeroBaños.setBounds(32, 132, 122, 14);
		contentPane.add(numeroBaños);

		lblNumeroDeAlcobas = new JLabel("Numero de Alcobas");
		lblNumeroDeAlcobas.setBounds(32, 154, 122, 14);
		contentPane.add(lblNumeroDeAlcobas);

		nParqueaderos = new JLabel("N\u00FAmero de Parqueaderos");
		nParqueaderos.setBounds(32, 179, 147, 14);
		contentPane.add(nParqueaderos);

		costoAdminLB = new JLabel("Costo Administraci\u00F3n");
		costoAdminLB.setBounds(32, 204, 135, 14);
		contentPane.add(costoAdminLB);

		lblTipoInmueble = new JLabel("Tipo Inmueble");
		lblTipoInmueble.setBounds(32, 82, 93, 14);
		contentPane.add(lblTipoInmueble);

		lblMetrosCuadrados = new JLabel("Metros Cuadrados");
		lblMetrosCuadrados.setBounds(32, 229, 108, 14);
		contentPane.add(lblMetrosCuadrados);

		estado = new JLabel("Estado del Inmueble");
		estado.setBounds(32, 254, 135, 14);
		contentPane.add(estado);

		lblInmuebleArrendado = new JLabel("Inmueble Arrendado");
		lblInmuebleArrendado.setBounds(32, 304, 117, 14);
		contentPane.add(lblInmuebleArrendado);

		arrendatario = new JLabel("Arrendatario");
		arrendatario.setBounds(32, 332, 93, 14);
		arrendatario.setVisible(false);
		contentPane.add(arrendatario);

		pisoAptoLB = new JLabel("Piso Apartamento");
		pisoAptoLB.setBounds(32, 279, 123, 14);
		contentPane.add(pisoAptoLB);
		pisoAptoLB.setVisible(false);

		pisosCasa = new JLabel("Cantidad de Pisos");
		pisosCasa.setBounds(32, 279, 122, 14);
		contentPane.add(pisosCasa);
		pisosCasa.setVisible(false);
	}

	private void campos(Inmueble casaCargada) {

		arrendatarioJT = new JTextField();
		arrendatarioJT.setColumns(10);
		arrendatarioJT.setBounds(151, 329, 136, 20);
		arrendatarioJT.setVisible(false);
		contentPane.add(arrendatarioJT);

		metrosCuadrados = new JTextField();
		metrosCuadrados.setText(String.valueOf(casaCargada.getMetrosCuadrados()));
		metrosCuadrados.setBounds(185, 226, 76, 20);
		contentPane.add(metrosCuadrados);
		metrosCuadrados.setColumns(10);

		costoAdmin = new JTextField();
		costoAdmin.setBounds(185, 201, 76, 20);
		costoAdmin.setText(String.valueOf(casaCargada.getCostoAdministracion()));
		contentPane.add(costoAdmin);
		costoAdmin.setColumns(10);

		dueñoJT = new JTextField();
		dueñoJT.setText(String.valueOf(casaCargada.getDueño()));
		dueñoJT.setBounds(151, 54, 100, 20);
		contentPane.add(dueñoJT);
		dueñoJT.setColumns(10);
		
		codigoInmuebleJT = new JTextField();
		codigoInmuebleJT.setText(String.valueOf(casaCargada.getCodigoInmueble()));
		codigoInmuebleJT.setBounds(185, 104, 76, 20);
		contentPane.add(codigoInmuebleJT);
		codigoInmuebleJT.setColumns(10);

	}

	private void botones(Inmueble casaCargada) {
		btnAgregarDueño = new JButton("Adicionar Dueño");
		btnAgregarDueño.setBounds(256, 53, 122, 23);
		contentPane.add(btnAgregarDueño);

		guardar = new JButton("Guardar");
		guardar.setBounds(126, 374, 135, 23);
		guardar.addActionListener(this);
		contentPane.add(guardar);

		cancelar = new JButton("Cancelar");
		cancelar.setBounds(307, 374, 135, 23);
		cancelar.addActionListener(this);
		contentPane.add(cancelar);

		btnModificarD = new JButton("Modificar Dueño");
		btnModificarD.setBounds(388, 53, 121, 23);
		contentPane.add(btnModificarD);

		registrarArrendatario = new JButton("Registrar Arrendatario");
		registrarArrendatario.setBounds(338, 328, 171, 23);
		registrarArrendatario.setVisible(false);
		contentPane.add(registrarArrendatario);

		codigoInmueble = new JLabel("C\u00F3digo Inmueble");
		codigoInmueble.setBounds(32, 107, 122, 14);
		contentPane.add(codigoInmueble);
	}

	private void combobox(Inmueble casaCargada) {

		numeroBañosCB = new JComboBox();
		numeroBañosCB.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
		numeroBañosCB.setSelectedIndex(casaCargada.getNumeroBaños()-1);
		numeroBañosCB.setBounds(185, 126, 76, 20);
		contentPane.add(numeroBañosCB);

		numeroAlcobasCB = new JComboBox();
		numeroAlcobasCB.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
		numeroAlcobasCB.setSelectedIndex(casaCargada.getNumeroAlcobas());
		numeroAlcobasCB.setBounds(185, 151, 76, 20);
		contentPane.add(numeroAlcobasCB);

		nParqueaderosCB = new JComboBox();
		nParqueaderosCB.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
		nParqueaderosCB.setSelectedIndex(casaCargada.getNumeroParqueaderos()-1);
		nParqueaderosCB.setBounds(185, 176, 76, 20);
		contentPane.add(nParqueaderosCB);

		estadoInmuebleCB = new JComboBox();
		estadoInmuebleCB.setModel(new DefaultComboBoxModel(new String[] { "Bueno", "Regular", "Malo" }));
		if(casaCargada.getEstado().equals("Bueno")){
			estadoInmuebleCB.setSelectedIndex(0);
		}
		if(casaCargada.getEstado().equals("Regular")){
			estadoInmuebleCB.setSelectedIndex(1);
		}
		if(casaCargada.getEstado().equals("Malo")){
			estadoInmuebleCB.setSelectedIndex(2);
		}
		estadoInmuebleCB.setBounds(185, 251, 76, 20);
		contentPane.add(estadoInmuebleCB);

		pisosCasaCB = new JComboBox();
		pisosCasaCB.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
		pisosCasaCB.setBounds(185, 276, 76, 20);
		contentPane.add(pisosCasaCB);
		pisosCasaCB.setVisible(false);

		pisoApto = new JComboBox();
		pisoApto.setBounds(185, 276, 76, 20);
		contentPane.add(pisoApto);
		pisoApto.setVisible(false);
		
		tipoInmuebleCB = new JComboBox();
		tipoInmuebleCB.setModel(new DefaultComboBoxModel(new String[] { "Seleccionar", "Casa", "Apartamento" }));
		if(casaCargada instanceof Casa){
			System.out.println("Casa");
			tipoInmuebleCB.setSelectedIndex(1);
			pisosCasa.setVisible(true);
			pisosCasaCB.setVisible(true);
			pisoApto.setVisible(false);
			pisoAptoLB.setVisible(false);
		}
		if(casaCargada instanceof Apartamento){
			tipoInmuebleCB.setSelectedIndex(2);
			pisosCasa.setVisible(false);
			pisosCasaCB.setVisible(false);
			pisoApto.setVisible(true);
			pisoAptoLB.setVisible(true);
		}
		tipoInmuebleCB.setBounds(185, 79, 100, 20);
		tipoInmuebleCB.addActionListener(this);
		contentPane.add(tipoInmuebleCB);
	}

	private void checkbox(Inmueble casaCargada) {
		si = new JCheckBox("Si");
		si.setBounds(185, 300, 42, 23);
		si.addActionListener(this);
		si.setSelected(casaCargada.isArrendado());
		si.setEnabled(casaCargada.isArrendado());
		contentPane.add(si);

		no = new JCheckBox("No");
		no.setBounds(228, 300, 44, 23);
		no.addActionListener(this);
		no.setSelected(!casaCargada.isArrendado());
		no.setEnabled(!casaCargada.isArrendado());
		contentPane.add(no);
	}

	private void validarcheck() {
		if (si.isSelected()) {
			no.setEnabled(false);
			arrendatario.setVisible(true);
			arrendatarioJT.setVisible(true);
			registrarArrendatario.setVisible(true);
		}
		if (si.isSelected() == false) {
			no.setEnabled(true);
			arrendatario.setVisible(false);
			arrendatarioJT.setVisible(false);
			registrarArrendatario.setVisible(false);
		}
		if (no.isSelected()) {
			si.setEnabled(false);
		}
		if (no.isSelected() == false) {
			si.setEnabled(true);
		}
	}

	private void validarComboBox() {
		tipoInmueble = (String) tipoInmuebleCB.getSelectedItem();
		if (tipoInmueble.equals("Casa")) {
			p=new Casa();
			pisosCasa.setVisible(true);
			pisosCasaCB.setVisible(true);
			pisoApto.setVisible(false);
			pisoAptoLB.setVisible(false);
		}
		if (tipoInmueble.equals("Apartamento")) {
			p=new Apartamento();
			pisosCasa.setVisible(false);
			pisosCasaCB.setVisible(false);
			pisoApto.setVisible(true);
			pisoAptoLB.setVisible(true);
		}
		if (tipoInmueble.equals("Seleccionar")) {
			pisosCasa.setVisible(false);
			pisosCasaCB.setVisible(false);
			pisoApto.setVisible(false);
			pisoAptoLB.setVisible(false);
		}

	}

	private void llenar() {
		if (p instanceof Casa) {
			if (si.isSelected()) {
				nc.crearCasa(c.llenarCasa(Integer.parseInt(dueñoJT.getText()), si.isSelected(),
						Double.parseDouble(costoAdmin.getText()), codigoInmuebleJT.getText(),
						Double.parseDouble(metrosCuadrados.getText()), Integer.parseInt(arrendatarioJT.getText()),
						(Integer) numeroAlcobasCB.getSelectedIndex(), (Integer) numeroBañosCB.getSelectedIndex(),
						(Integer) nParqueaderosCB.getSelectedIndex(), (String) estadoInmuebleCB.getSelectedItem(),
						pisosCasaCB.getSelectedIndex()));
			}

			if (no.isSelected()) { 
				nc.crearCasa(c.llenarCasa(Integer.parseInt(dueñoJT.getText()), si.isSelected(),
						Double.parseDouble(costoAdmin.getText()), codigoInmuebleJT.getText(),
						Double.parseDouble(metrosCuadrados.getText()), 0, (Integer) numeroAlcobasCB.getSelectedIndex(),
						(Integer) numeroBañosCB.getSelectedIndex(), (Integer) nParqueaderosCB.getSelectedIndex(),
						(String) estadoInmuebleCB.getSelectedItem(), pisosCasaCB.getSelectedIndex()));
			}
		}
		if (p instanceof Apartamento) {
			if (si.isSelected()) {
				a.llenarApartamento(Integer.parseInt(dueñoJT.getText()), si.isSelected(),
						Double.parseDouble(costoAdmin.getText()), codigoInmuebleJT.getText(),
						Double.parseDouble(metrosCuadrados.getText()), Integer.parseInt(arrendatarioJT.getText()),
						(Integer) numeroAlcobasCB.getSelectedIndex(), (Integer) numeroBañosCB.getSelectedIndex(),
						(Integer) nParqueaderosCB.getSelectedIndex(), (String) estadoInmuebleCB.getSelectedItem(),
						pisoApto.getSelectedIndex());
			}

			if (no.isSelected()) {
				a.llenarApartamento(Integer.parseInt(dueñoJT.getText()), si.isSelected(),
						Double.parseDouble(costoAdmin.getText()), codigoInmuebleJT.getText(),
						Double.parseDouble(metrosCuadrados.getText()), 0, (Integer) numeroAlcobasCB.getSelectedIndex(),
						(Integer) numeroBañosCB.getSelectedIndex(), (Integer) nParqueaderosCB.getSelectedIndex(),
						(String) estadoInmuebleCB.getSelectedItem(), pisoApto.getSelectedIndex());
			}
		}

	}

	public void actionPerformed(ActionEvent e)  {
		validarComboBox();
		validarcheck();
		if (e.getSource() == guardar) {
			llenar();
		}
		if(e.getSource()==cancelar){
			this.setVisible(false);
		}
	}

}
