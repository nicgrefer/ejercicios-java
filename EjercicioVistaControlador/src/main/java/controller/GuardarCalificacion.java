
// src/main/java/controller/GuardarCalificacion.java
package controller;

import model.Calificacion;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class GuardarCalificacion {
	public void guardar(JComboBox<String> comboAlumnos, JComboBox<String> comboAsignaturas, JTextField txtNota,
			List<Calificacion> listaCalificaciones, DefaultTableModel modeloTabla, JFrame frame) {
		try {
			String alumno = (String) comboAlumnos.getSelectedItem();
			String asignatura = (String) comboAsignaturas.getSelectedItem();
			double nota = Double.parseDouble(txtNota.getText());

			listaCalificaciones.add(new Calificacion(alumno, asignatura, nota));
			modeloTabla.addRow(new Object[] { alumno, asignatura, nota });
			txtNota.setText("");
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(frame, "Por favor, introduce una nota válida.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
