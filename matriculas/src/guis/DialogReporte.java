package guis;

import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;

public class DialogReporte extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogReporte dialog = new DialogReporte();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogReporte() {
		setTitle("Reporte");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Tipo de Reporte");
			lblNewLabel.setBounds(24, 29, 89, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JComboBox<String> comboBox = new JComboBox<String>();
			comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Seleccione", "Matrículas Pendientes", "Matrículas Vigentes", "Alumnos por Curso"}));
			comboBox.setBounds(154, 25, 134, 22);
			contentPanel.add(comboBox);
		}
		{
			JButton btnNewButton = new JButton("Generar");
			btnNewButton.setBounds(308, 25, 89, 23);
			contentPanel.add(btnNewButton);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 84, 414, 166);
			contentPanel.add(scrollPane);
			{
				table = new JTable();
				scrollPane.setViewportView(table);
			}
		}
	}

}
