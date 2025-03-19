import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana = new JFrame("Aplicación");
		ventana.setSize(400, 200);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		
		JPanel panel = new JPanel();
		GridLayout layout = new GridLayout(3, 2);// 3 filas, 2 columnas
		panel.setLayout(layout);
		
		JLabel labelNombre = new JLabel("Nombre");
		panel.add(labelNombre);
		JTextField nombre=new JTextField();
		panel.add(nombre);
		JLabel labelEdad = new JLabel("Edad");
		panel.add(labelEdad);
		JTextField edad=new JTextField();
		panel.add(edad);
		
		JLabel labelNumeroTelefono = new JLabel("Numero de telefono");
		panel.add(labelNumeroTelefono);
		JTextField numeroTelefono=new JTextField();
		panel.add(numeroTelefono);
		
		JButton boton = new JButton("Recuperar datos");
		JLabel resultado = new JLabel("......");
		
		ventana.getContentPane().add(panel, BorderLayout.NORTH);
		ventana.getContentPane().add(boton, BorderLayout.CENTER);
		ventana.getContentPane().add(resultado, BorderLayout.SOUTH);
		
		
		
		
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nombreTMP=nombre.getText();
				int edadTMP=Integer.parseInt(edad.getText());
				String numeroTelefonoTMP=numeroTelefono.getText();
				Persona persona = new Persona(nombreTMP, edadTMP, numeroTelefonoTMP);
				
				resultado.setText(persona.toString());
				
			}
			
		});
		
		
		
		ventana.setVisible(true);
		
			
	}

}
