package guis;

import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class DialogConsMatRet extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JPanel panel;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNumMatricula;
	private JTextField txtNumMatricula;
	private JButton btnConsMatricula;
	private JLabel lblNumRetiro;
	private JTextField txtNumRetiro;
	private JButton btnConsRetiro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogConsMatRet dialog = new DialogConsMatRet();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogConsMatRet() {
		setResizable(false);
		setTitle("Consulta | Matrículas - Retiros");
		setBounds(100, 100, 450, 334);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Matr\u00EDculas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 195, 122);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		lblNumMatricula = new JLabel("N matrícula");
		lblNumMatricula.setBounds(10, 33, 67, 14);
		panel.add(lblNumMatricula);
		
		txtNumMatricula = new JTextField();
		txtNumMatricula.setBounds(99, 30, 86, 20);
		panel.add(txtNumMatricula);
		txtNumMatricula.setColumns(10);
		
		btnConsMatricula = new JButton("Consultar");
		btnConsMatricula.addActionListener(this);
		btnConsMatricula.setBounds(50, 75, 89, 23);
		panel.add(btnConsMatricula);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Retiros", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(229, 11, 195, 122);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		lblNumRetiro = new JLabel("N retiro");
		lblNumRetiro.setBounds(10, 35, 55, 14);
		panel_1.add(lblNumRetiro);
		
		txtNumRetiro = new JTextField();
		txtNumRetiro.setBounds(99, 32, 86, 20);
		panel_1.add(txtNumRetiro);
		txtNumRetiro.setColumns(10);
		
		btnConsRetiro = new JButton("Consultar");
		btnConsRetiro.setBounds(59, 75, 89, 23);
		panel_1.add(btnConsRetiro);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 151, 414, 133);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConsMatricula) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
	}
}
