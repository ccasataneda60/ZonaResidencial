package vista;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import conexionBD.CasaDAO;
import modelo.Casa;
import negocio.NCasa;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class VCasaL extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JButton cerrar;
	private JButton modificar;
	private JButton eliminar;
	private JLabel cabecera;
	private JLabel nombreM;
	private JLabel apellido;
	private JLabel espacio;
	private JLabel especialidad;
	private JLabel cedula;
	private JLabel telefono;
	private JTable table;
	private ArrayList<Casa> m=new ArrayList<Casa>();
	private NCasa c = new NCasa();
	private CasaDAO me= new CasaDAO();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VCasaL frame = new VCasaL();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public VCasaL() throws ClassNotFoundException, IOException, Exception {
		m=c.listarCasas();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.scroll();
		this.etiquetas();
		this.boton();
		this.tabla();
		//System.out.println(me.consultarMedicos().size());
	
	}

	private void tabla(){
		Object[] columnNames = {"Código Inmueble", "Dueño", "Estado", "Arrendatario", "Metros Cuadrados","Arrendado","Modificar","Eliminar"};
		Object [][] data = new Object[c.listarCasas().size()][10];
		for(int i=0;i<m.size();i++){
			data[i][0]=m.get(i).getCodigoInmueble();
			data[i][1]=String.valueOf(m.get(i).getDueño());
			data[i][2]=String.valueOf(m.get(i).getEstado());
			data[i][3]=String.valueOf(m.get(i).getArrendatario());
			data[i][4]=String.valueOf(m.get(i).getMetrosCuadrados());
			data[i][5]=String.valueOf(m.get(i).isArrendado());
			data[i][6]=modificar;
			data[i][7]=eliminar;
		}
		this.table=new JTable(data, columnNames);
		table.setEnabled(false);
		table.setDefaultRenderer(Object.class, new Render());
		table.setPreferredScrollableViewportSize(new Dimension(900, 80));
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int column=table.getColumnModel().getColumnIndexAtX(e.getX());
				int row=e.getY()/table.getRowHeight();
				
				if(row<table.getRowCount() && row >=0 && column<table.getColumnCount()&& column>=0){
					Object value= table.getValueAt(row, column);
					if(value instanceof JButton){
						((JButton)value).doClick();
						JButton boton= (JButton) value;
						if(boton.getName().equals("modificar")){
							System.out.println("Modificar "+row);
						}
						
						if(boton.getName().equals("eliminar")){
							System.out.println("Eliminar");
						}
					}
				}
			}
		});
		scrollPane.setViewportView(table);
	}
	private void etiquetas(){
		JLabel medicosTxt = new JLabel("listado Medicos");
		medicosTxt.setBounds(120, 15, 199, 14);
		medicosTxt.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(medicosTxt);

	}
	private void scroll(){
		this.scrollPane = new JScrollPane(table);
		scrollPane.setBounds(45, 50, 900, 300);
		contentPane.add(scrollPane);
	}

	private void boton(){
		cerrar = new JButton("Cerrar");
		cerrar.setBounds(175, 196, 100, 23);
		contentPane.add(cerrar);
		cerrar.addActionListener(this);	
		
		modificar = new JButton("Modificar");
		modificar.setName("modificar");
		
		eliminar = new JButton("Eliminar");
		eliminar.setName("eliminar");
		
	}
	public void actionPerformed(ActionEvent e) {
			try {
				setVisible(false);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
			}
		
		
	}
}

