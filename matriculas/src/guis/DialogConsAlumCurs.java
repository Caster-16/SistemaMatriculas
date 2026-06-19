package guis;

import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DialogConsAlumCurs extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigoAlum;
	private JTextField txtCodigoCurs;
	private JTable table;
	private JTextField txtConsultarAlum;
	private JTextField txtConsultarCurs;
	private JButton btnConsultarAlum;
	private JButton btnConsultarCurs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogConsAlumCurs dialog = new DialogConsAlumCurs();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogConsAlumCurs() {
		setTitle("Consulta | Alumnos - Cursos");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 498, 322);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Alumnos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 11, 212, 128);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblCodigoAlum = new JLabel("Codigo");
				lblCodigoAlum.setBounds(26, 25, 46, 14);
				panel.add(lblCodigoAlum);
			}
			{
				txtCodigoAlum = new JTextField();
				txtCodigoAlum.setBounds(82, 22, 106, 20);
				panel.add(txtCodigoAlum);
				txtCodigoAlum.setColumns(10);
			}
			{
				JLabel lblConsultarAlum = new JLabel("Alumno");
				lblConsultarAlum.setBounds(26, 56, 46, 14);
				panel.add(lblConsultarAlum);
			}
			{
				txtConsultarAlum = new JTextField();
				txtConsultarAlum.setBounds(82, 53, 106, 20);
				panel.add(txtConsultarAlum);
				txtConsultarAlum.setColumns(10);
			}
			{
				btnConsultarAlum = new JButton("Consultar");
				btnConsultarAlum.setBounds(59, 94, 89, 23);
				panel.add(btnConsultarAlum);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Cursos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(250, 11, 212, 128);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblCodigoCurs = new JLabel("Codigo");
				lblCodigoCurs.setBounds(25, 31, 46, 14);
				panel.add(lblCodigoCurs);
			}
			{
				txtCodigoCurs = new JTextField();
				txtCodigoCurs.setBounds(81, 28, 107, 20);
				panel.add(txtCodigoCurs);
				txtCodigoCurs.setColumns(10);
			}
			{
				JLabel lblConsultarCurs = new JLabel("Curso");
				lblConsultarCurs.setBounds(25, 56, 46, 14);
				panel.add(lblConsultarCurs);
			}
			{
				txtConsultarCurs = new JTextField();
				txtConsultarCurs.setBounds(81, 53, 107, 20);
				panel.add(txtConsultarCurs);
				txtConsultarCurs.setColumns(10);
			}
			{
				btnConsultarCurs = new JButton("Consultar");
				btnConsultarCurs.setBounds(68, 94, 89, 23);
				panel.add(btnConsultarCurs);
			}
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 150, 462, 122);
			contentPanel.add(scrollPane);
			{
				table = new JTable();
				scrollPane.setViewportView(table);
			}
		}
	}

}
