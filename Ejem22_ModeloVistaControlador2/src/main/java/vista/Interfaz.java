package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.Controlador;

public class Interfaz extends JFrame {

	private Controlador controlador;
	
	public JTextField nombre;
	public JTextField edad;
	public JTextField telefono;
	public JLabel resultado;
	
	
	public Interfaz(Controlador controlador) {
		super("Aplicación");
		this.controlador=controlador;
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		crearComponentes();
		setVisible(true);
    }
	
	public void crearComponentes() {
		JPanel panel = new JPanel();
		GridLayout layout = new GridLayout(3, 2);
		panel.setLayout(layout);
		
		JLabel labelNombre = new JLabel("Nombre");
		panel.add(labelNombre);
		nombre=new JTextField();
		panel.add(nombre);
		JLabel labelEdad = new JLabel("Edad");
		panel.add(labelEdad);
		edad=new JTextField();
		panel.add(edad);
		JLabel labelTelefono=new JLabel("Telefono");
		panel.add(labelTelefono);
		telefono=new JTextField();
		panel.add(telefono);
		
		JButton boton = new JButton("Recuperar datos");
		resultado = new JLabel("......");
		
		getContentPane().add(panel, BorderLayout.NORTH);
		getContentPane().add(boton, BorderLayout.CENTER);
		getContentPane().add(resultado, BorderLayout.SOUTH);
		
		boton.addActionListener(controlador);
		
		
	}
	
	
}
