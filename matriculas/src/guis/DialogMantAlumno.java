package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;


public class DialogMantAlumno extends JDialog {

	private static final long serialVersionUID = 1L;
	private JLabel lblCodigo;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblDni;
	private JLabel lblCelular;
	private JLabel lblEstado;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDni;
	private JTextField txtCelular;
	private JComboBox <String> cboEstado;
	private JScrollPane scrollPane;
	private JTable tblTabla;
	private DefaultTableModel prueba;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogMantAlumno dialog = new DialogMantAlumno();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DialogMantAlumno() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Mantenimiento | Alumno");
		setBounds(100, 100, 506, 385);
		getContentPane().setLayout(null);
		
		lblCodigo = new JLabel("Código");
		lblCodigo.setBounds(10, 22, 46, 14);
		getContentPane().add(lblCodigo);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 47, 46, 14);
		getContentPane().add(lblNombre);
		
		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(186, 47, 66, 14);
		getContentPane().add(lblApellidos);
		
		lblDni = new JLabel("DNI");
		lblDni.setBounds(10, 72, 46, 14);
		getContentPane().add(lblDni);
		
		lblCelular = new JLabel("Celular");
		lblCelular.setBounds(10, 100, 46, 14);
		getContentPane().add(lblCelular);
		
		lblEstado = new JLabel("Estado");
		lblEstado.setBounds(10, 133, 46, 14);
		getContentPane().add(lblEstado);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(31, 178, 89, 23);
		getContentPane().add(btnAdicionar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(143, 178, 89, 23);
		getContentPane().add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(242, 178, 89, 23);
		getContentPane().add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(349, 178, 89, 23);
		getContentPane().add(btnEliminar);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(66, 19, 110, 20);
		getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(66, 44, 110, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(262, 44, 151, 20);
		getContentPane().add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setBounds(66, 69, 110, 20);
		getContentPane().add(txtDni);
		txtDni.setColumns(10);
		
		txtCelular = new JTextField();
		txtCelular.setBounds(66, 97, 110, 20);
		getContentPane().add(txtCelular);
		txtCelular.setColumns(10);
		
		cboEstado = new JComboBox<String>();
		cboEstado.setModel(new DefaultComboBoxModel<String>(new String[] {"Registrado", "Matriculado", "Retirado"}));
		cboEstado.setBounds(66, 129, 110, 22);
		getContentPane().add(cboEstado);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 221, 470, 114);
		getContentPane().add(scrollPane);
		
		tblTabla = new JTable();
		tblTabla.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblTabla);
		
		prueba = new DefaultTableModel();

	}
}
