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
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class DialogRegRetiro extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCurso;
	private JTextField txtAlumno;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogRegRetiro dialog = new DialogRegRetiro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogRegRetiro() {
		setTitle("Registro | Retiro");
		setBounds(100, 100, 450, 325);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCurso = new JLabel("Curso");
			lblCurso.setBounds(208, 31, 46, 14);
			contentPanel.add(lblCurso);
		}
		{
			JLabel lblAlumno = new JLabel("Alumno");
			lblAlumno.setBounds(24, 31, 46, 14);
			contentPanel.add(lblAlumno);
		}
		{
			txtCurso = new JTextField();
			txtCurso.setBounds(263, 28, 123, 20);
			contentPanel.add(txtCurso);
			txtCurso.setColumns(10);
		}
		{
			txtAlumno = new JTextField();
			txtAlumno.setBounds(80, 28, 118, 20);
			contentPanel.add(txtAlumno);
			txtAlumno.setColumns(10);
		}
		{
			JButton btnAdicionar = new JButton("Adicionar");
			btnAdicionar.setBounds(24, 79, 89, 23);
			contentPanel.add(btnAdicionar);
		}
		{
			JButton btnConsultar = new JButton("Consultar");
			btnConsultar.setBounds(123, 79, 89, 23);
			contentPanel.add(btnConsultar);
		}
		{
			JButton btnModificar = new JButton("Modificar");
			btnModificar.setBounds(222, 79, 89, 23);
			contentPanel.add(btnModificar);
		}
		{
			JButton btnEliminar = new JButton("Eliminar");
			btnEliminar.setBounds(321, 79, 89, 23);
			contentPanel.add(btnEliminar);
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Retiros registrados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(10, 113, 414, 166);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 21, 394, 134);
				panel.add(scrollPane);
				{
					table = new JTable();
					scrollPane.setViewportView(table);
				}
			}
		}
	}

}
