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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.border.TitledBorder;

public class DialogMantCurso extends JDialog implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblCodigo;
	private JLabel lblAsignatura;
	private JLabel lblCiclo;
	private JLabel lblCreditos;
	private JLabel lblHoras;
	private JTextField txtCodgigo;
	private JTextField txtAsignatura;
	private JTextField txtCiclo;
	private JTextField txtCreditos;
	private JTextField txtHoras;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogMantCurso dialog = new DialogMantCurso();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogMantCurso() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Mantenimiento | Curso");
		setBounds(100, 100, 450, 395);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblCodigo = new JLabel("Código");
		lblCodigo.setBounds(10, 24, 46, 14);
		contentPanel.add(lblCodigo);
		
		lblAsignatura = new JLabel("Asignatura");
		lblAsignatura.setBounds(10, 49, 69, 14);
		contentPanel.add(lblAsignatura);
		
		lblCiclo = new JLabel("Ciclo");
		lblCiclo.setBounds(10, 74, 46, 14);
		contentPanel.add(lblCiclo);
		
		lblCreditos = new JLabel("Créditos");
		lblCreditos.setBounds(10, 99, 46, 14);
		contentPanel.add(lblCreditos);
		
		lblHoras = new JLabel("Horas");
		lblHoras.setBounds(10, 124, 46, 14);
		contentPanel.add(lblHoras);
		
		txtCodgigo = new JTextField();
		txtCodgigo.setBounds(84, 21, 86, 20);
		contentPanel.add(txtCodgigo);
		txtCodgigo.setColumns(10);
		
		txtAsignatura = new JTextField();
		txtAsignatura.setBounds(84, 46, 169, 20);
		contentPanel.add(txtAsignatura);
		txtAsignatura.setColumns(10);
		
		txtCiclo = new JTextField();
		txtCiclo.setBounds(84, 71, 86, 20);
		contentPanel.add(txtCiclo);
		txtCiclo.setColumns(10);
		
		txtCreditos = new JTextField();
		txtCreditos.setBounds(84, 96, 86, 20);
		contentPanel.add(txtCreditos);
		txtCreditos.setColumns(10);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(84, 121, 86, 20);
		contentPanel.add(txtHoras);
		txtHoras.setColumns(10);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(20, 165, 89, 23);
		contentPanel.add(btnAdicionar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(124, 165, 89, 23);
		contentPanel.add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(223, 165, 89, 23);
		contentPanel.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(this);
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(322, 165, 89, 23);
		contentPanel.add(btnEliminar);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Informaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 199, 414, 154);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 21, 394, 122);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(e);
		}
	}
	protected void actionPerformedBtnEliminar(ActionEvent e) {
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == btnEliminar) {
			mouseClickedBtnEliminar(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedBtnEliminar(MouseEvent e) {
	}
}
