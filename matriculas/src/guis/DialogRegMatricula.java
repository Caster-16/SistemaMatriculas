package guis;

import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DialogRegMatricula extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblAlumno;
	private JTextField txtCurso;
	private JTextField txtAlumno;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogRegMatricula dialog = new DialogRegMatricula();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogRegMatricula() {
		setTitle("Registro | Matricula");
		setBounds(100, 100, 514, 336);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCurso = new JLabel("Curso");
			lblCurso.setBounds(28, 50, 46, 14);
			contentPanel.add(lblCurso);
		}
		
		lblAlumno = new JLabel("Alumno");
		lblAlumno.setBounds(28, 23, 46, 14);
		contentPanel.add(lblAlumno);
		
		txtCurso = new JTextField();
		txtCurso.setBounds(86, 47, 118, 20);
		contentPanel.add(txtCurso);
		txtCurso.setColumns(10);
		
		txtAlumno = new JTextField();
		txtAlumno.setBounds(86, 20, 118, 20);
		contentPanel.add(txtAlumno);
		txtAlumno.setColumns(10);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(377, 7, 89, 23);
		contentPanel.add(btnAdicionar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(377, 44, 89, 23);
		contentPanel.add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(377, 69, 89, 23);
		contentPanel.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(377, 95, 89, 23);
		contentPanel.add(btnEliminar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 143, 478, 143);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
