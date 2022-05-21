package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JToggleButton;
import java.awt.BorderLayout;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProyectoCurso {

	private JFrame frmRegistro;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldDepartamento;
	private JTextField textFieldHijos;
	private JTextField textFieldFechaNac;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProyectoCurso window = new ProyectoCurso();
					window.frmRegistro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProyectoCurso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistro = new JFrame();
		frmRegistro.getContentPane().setBackground(new Color(240, 255, 255));
		frmRegistro.getContentPane().setLayout(null);
		
		JLabel nombre = new JLabel("Nombre:");
		nombre.setBounds(10, 106, 138, 20);
		nombre.setFont(new Font("Corbel", Font.PLAIN, 16));
		frmRegistro.getContentPane().add(nombre);
		
		JLabel apellido = new JLabel("Apellido:");
		apellido.setFont(new Font("Corbel", Font.PLAIN, 16));
		apellido.setBounds(10, 137, 138, 20);
		frmRegistro.getContentPane().add(apellido);
		
		JLabel departamento = new JLabel("Departamento:");
		departamento.setFont(new Font("Corbel", Font.PLAIN, 16));
		departamento.setBounds(10, 168, 138, 20);
		frmRegistro.getContentPane().add(departamento);
		
		JLabel cantHijos = new JLabel("Cantidad de hijos:");
		cantHijos.setFont(new Font("Corbel", Font.PLAIN, 16));
		cantHijos.setBounds(10, 199, 138, 20);
		frmRegistro.getContentPane().add(cantHijos);
		
		JLabel fechaNac = new JLabel("Fecha de nacimiento:");
		fechaNac.setFont(new Font("Corbel", Font.PLAIN, 16));
		fechaNac.setBounds(10, 230, 142, 20);
		frmRegistro.getContentPane().add(fechaNac);
		
		JLabel registroTitle = new JLabel("Resgistro de personas");
		registroTitle.setForeground(Color.DARK_GRAY);
		registroTitle.setHorizontalAlignment(SwingConstants.CENTER);
		registroTitle.setFont(registroTitle.getFont().deriveFont(40f));
		registroTitle.setBounds(10, 11, 450, 84);
		frmRegistro.getContentPane().add(registroTitle);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Corbel", Font.PLAIN, 14));
		textFieldNombre.setBounds(158, 104, 180, 20);
		frmRegistro.getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setFont(new Font("Corbel", Font.PLAIN, 14));
		textFieldApellido.setBounds(158, 135, 180, 20);
		frmRegistro.getContentPane().add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		textFieldDepartamento = new JTextField();
		textFieldDepartamento.setFont(new Font("Corbel", Font.PLAIN, 14));
		textFieldDepartamento.setBounds(158, 166, 180, 20);
		frmRegistro.getContentPane().add(textFieldDepartamento);
		textFieldDepartamento.setColumns(10);
		
		textFieldHijos = new JTextField();
		textFieldHijos.setFont(new Font("Corbel", Font.PLAIN, 14));
		textFieldHijos.setBounds(158, 197, 180, 20);
		frmRegistro.getContentPane().add(textFieldHijos);
		textFieldHijos.setColumns(10);
		
		textFieldFechaNac = new JTextField();
		textFieldFechaNac.setFont(new Font("Corbel", Font.PLAIN, 14));
		textFieldFechaNac.setBounds(158, 228, 180, 20);
		frmRegistro.getContentPane().add(textFieldFechaNac);
		textFieldFechaNac.setColumns(10);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ferna\\Pictures\\logo chico.png"));
		lblNewLabel.setBounds(445, 11, 128, 97);
		frmRegistro.getContentPane().add(lblNewLabel);
		
		JButton buttonLimpiar = new JButton("Limpiar");
		buttonLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonLimpiar.setBounds(158, 274, 75, 23);
		frmRegistro.getContentPane().add(buttonLimpiar);
		
		JButton buttonRegistro = new JButton("Registro");
		buttonRegistro.setBounds(243, 274, 95, 23);
		frmRegistro.getContentPane().add(buttonRegistro);
		frmRegistro.setBackground(Color.DARK_GRAY);
		frmRegistro.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ferna\\Pictures\\Logo.png"));
		frmRegistro.setTitle("Registro");
		frmRegistro.setBounds(100, 100, 574, 486);
		frmRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
