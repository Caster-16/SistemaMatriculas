package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;

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
	private JComboBox cboEstado;
	private JScrollPane scrollPane;
	private JTable table;

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
		lblApellidos.setBounds(10, 72, 46, 14);
		getContentPane().add(lblApellidos);
		
		lblDni = new JLabel("DNI");
		lblDni.setBounds(10, 97, 46, 14);
		getContentPane().add(lblDni);
		
		lblCelular = new JLabel("Celular");
		lblCelular.setBounds(10, 122, 46, 14);
		getContentPane().add(lblCelular);
		
		lblEstado = new JLabel("Estado");
		lblEstado.setBounds(10, 147, 46, 14);
		getContentPane().add(lblEstado);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(391, 18, 89, 23);
		getContentPane().add(btnAdicionar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(391, 43, 89, 23);
		getContentPane().add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(391, 68, 89, 23);
		getContentPane().add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(391, 93, 89, 23);
		getContentPane().add(btnEliminar);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(66, 19, 86, 20);
		getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(66, 44, 149, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(66, 69, 183, 20);
		getContentPane().add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setBounds(66, 94, 86, 20);
		getContentPane().add(txtDni);
		txtDni.setColumns(10);
		
		txtCelular = new JTextField();
		txtCelular.setBounds(66, 119, 86, 20);
		getContentPane().add(txtCelular);
		txtCelular.setColumns(10);
		
		cboEstado = new JComboBox();
		cboEstado.setBounds(66, 143, 86, 22);
		getContentPane().add(cboEstado);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 191, 470, 144);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);

	}
}
