package guis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame implements  ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menu;
	private JMenu mnMantenimiento;
	private JMenu mnRegistro;
	private JMenu mnConsulta;
	private JMenu mnReporte;
	private JMenuItem mntmAlumno;
	private JMenuItem mntmCurso;
	private JMenuItem mntmMatricula;
	private JMenuItem mntmRetiro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setTitle("Sistema de matriculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menu = new JMenuBar();
		menu.setBounds(0, 0, 424, 22);
		contentPane.add(menu);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menu.add(mnMantenimiento);
		
		mntmAlumno = new JMenuItem("Alumno");
		mntmAlumno.addActionListener(this);
		mnMantenimiento.add(mntmAlumno);
		
		mntmCurso = new JMenuItem("Curso");
		mntmCurso.addActionListener(this);
		mnMantenimiento.add(mntmCurso);
		
		mnRegistro = new JMenu("Registro");
		menu.add(mnRegistro);
		
		mntmMatricula = new JMenuItem("Matriucla");
		mntmMatricula.addActionListener(this);
		mnRegistro.add(mntmMatricula);
		
		mntmRetiro = new JMenuItem("Retiro");
		mntmRetiro.addActionListener(this);
		mnRegistro.add(mntmRetiro);
		
		mnConsulta = new JMenu("Consulta");
		menu.add(mnConsulta);
		
		mnReporte = new JMenu("Reporte");
		menu.add(mnReporte);

	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmRetiro) {
			actionPerformedMntmRetiro(e);
		}
		if (e.getSource() == mntmMatricula) {
			actionPerformedMntmMatricula(e);
		}
		if (e.getSource() == mntmCurso) {
			actionPerformedMntmCurso(e);
		}
		if (e.getSource() == mntmAlumno) {
			actionPerformedMntmAlumno(e);
		}
	}
	protected void actionPerformedMntmAlumno(ActionEvent e) 
	{
		DialogMantAlumno x = new DialogMantAlumno();
		x.setLocationRelativeTo(this);
		x.setModal(true);
		x.setVisible(true);
	}
	protected void actionPerformedMntmCurso(ActionEvent e) 
	{
		DialogMantCurso x = new DialogMantCurso();
		x.setLocationRelativeTo(this);
		x.setModal(true);
		x.setVisible(true);
	}
	protected void actionPerformedMntmMatricula(ActionEvent e) 
	{
		DialogRegMatricula x = new DialogRegMatricula();
		x.setLocationRelativeTo(this);
		x.setModal(true);
		x.setVisible(true);
	}
	protected void actionPerformedMntmRetiro(ActionEvent e) 
	{
		
	}
}
