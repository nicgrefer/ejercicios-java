package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Persona;
import vista.Interfaz;

public class Controlador implements ActionListener {

	private Interfaz ventana;
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

System.out.println("Boton pulsado");
		String nombreTMP=ventana.nombre.getText();
		int edadTMP=Integer.parseInt(ventana.edad.getText());
		String telefonoTMP=ventana.telefono.getText();
		Persona persona = new Persona(nombreTMP, edadTMP,telefonoTMP);
		
		ventana.resultado.setText(persona.toString());
		
	}

	public void setInterfaz(Interfaz ventana) {
		this.ventana=ventana;
	}

}
