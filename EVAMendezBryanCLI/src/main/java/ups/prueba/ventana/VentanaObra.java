package ups.prueba.ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import ups.prueba.Obra;
import ups.prueba.ObraServices_ObraServicesPort_Client;
import ups.prueba.ServicesListado;
import ups.prueba.ServicesObraSOAP;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class VentanaObra extends JFrame {

	private JPanel contentPane;
	private JTextField textField_codigo;
	private JTextField textField_nombre;
	private JTextField textField_autor;
	private JTextField textField_tipo;
	private JTextField textField_fecha;
	private DefaultTableModel modelo;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaObra frame = new VentanaObra();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaObra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo: ");
		lblNewLabel.setBounds(10, 39, 45, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre: ");
		lblNewLabel_1.setBounds(10, 76, 45, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Autor: ");
		lblNewLabel_2.setBounds(10, 115, 45, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo: ");
		lblNewLabel_3.setBounds(10, 150, 45, 13);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha: ");
		lblNewLabel_4.setBounds(10, 188, 45, 13);
		panel.add(lblNewLabel_4);
		
		textField_codigo = new JTextField();
		textField_codigo.setBounds(108, 36, 133, 19);
		panel.add(textField_codigo);
		textField_codigo.setColumns(10);
		
		textField_nombre = new JTextField();
		textField_nombre.setBounds(108, 73, 133, 19);
		panel.add(textField_nombre);
		textField_nombre.setColumns(10);
		
		textField_autor = new JTextField();
		textField_autor.setBounds(108, 115, 133, 19);
		panel.add(textField_autor);
		textField_autor.setColumns(10);
		
		textField_tipo = new JTextField();
		textField_tipo.setBounds(108, 147, 133, 19);
		panel.add(textField_tipo);
		textField_tipo.setColumns(10);
		
		textField_fecha = new JTextField();
		textField_fecha.setBounds(108, 185, 133, 19);
		panel.add(textField_fecha);
		textField_fecha.setColumns(10);
		
		JButton insertarObraButton = new JButton("Insertar Obra");
		insertarObraButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Obra obra = new Obra();
				obra.setCodigo(Integer.parseInt(textField_codigo.getText()));
				obra.setAutor(textField_autor.getText());
				obra.setNombre(textField_nombre.getText());
				obra.setTipo(textField_tipo.getText());
				obra.setFecha(textField_fecha.getText());
				ServicesObraSOAP services= new ServicesObraSOAP();
				//ObraServices_ObraServicesPort_Client port= new ObraServices_ObraServicesPort_Client();
				//port.insertarObras();
				services.insertarObras(obra);
				//ServicesListado registro= new ServicesListado();
				
			}
		});
		insertarObraButton.setBounds(10, 236, 120, 21);
		panel.add(insertarObraButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(352, 76, 265, 142);
		panel.add(scrollPane);
		modelo=new DefaultTableModel();
		modelo.addColumn("CODIGO");
		modelo.addColumn("NOMBRE");
		modelo.addColumn("AUTOR");
		modelo.addColumn("TIPO");
		modelo.addColumn("FECHA");
		table = new JTable();
		table.setModel(modelo);
		scrollPane.setViewportView(table);
		
		JButton listarButton = new JButton("Listar");
		listarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ServicesListado listado= new ServicesListado();
				List<Obra> obras= new ArrayList<Obra>();
				obras=listado.listar();
				modelo=(DefaultTableModel) table.getModel();
				Object[] ob = new Object[5];
				for(int i=0; i<obras.size();i++) {
					 ob[0] = obras.get(i).getCodigo();
			         ob[1] = obras.get(i).getNombre();
			         ob[2] = obras.get(i).getAutor();
					 ob[3] = obras.get(i).getTipo();
					ob[4] = obras.get(i).getFecha();
					modelo.addRow(ob);
				}
				table.setModel(modelo);
			}
		});
		listarButton.setBounds(352, 236, 85, 21);
		panel.add(listarButton);
		
	}
}
