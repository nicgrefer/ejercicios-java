import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.Controlador;
import modelo.Persona;
import vista.Interfaz;

public class Aplicacion {

	public static void main(String[] args) {

		Controlador controlador = new Controlador();
		Interfaz ventana = new Interfaz(controlador);
		controlador.setInterfaz(ventana);
			
			
	}

}
