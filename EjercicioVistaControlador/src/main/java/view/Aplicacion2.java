
// src/main/java/view/Aplicacion2.java
package view;

import controller.GuardarCalificacion;
import controller.LimpiarTabla;
import controller.CargarCalificaciones;
import model.Calificacion;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Aplicacion2 {
	private JFrame frame;
	private JComboBox<String> comboAlumnos;
	private JComboBox<String> comboAsignaturas;
	private JTextField txtNota;
	private JButton btnGuardar;
	private JTable tablaCalificaciones;
	private DefaultTableModel modeloTabla;
	private List<Calificacion> listaCalificaciones;

	private GuardarCalificacion guardarCalificacion;
	private LimpiarTabla limpiarTabla;
	private CargarCalificaciones cargarCalificaciones;

	public Aplicacion2() {
		listaCalificaciones = new ArrayList<>();
		guardarCalificacion = new GuardarCalificacion();
		limpiarTabla = new LimpiarTabla();
		cargarCalificaciones = new CargarCalificaciones();

		frame = new JFrame("Calificación de Alumnos");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 400);
		frame.setLayout(new BorderLayout());

		// Crear menú
		JMenuBar menuBar = new JMenuBar();
		JMenu menuOpciones = new JMenu("Opciones");
		JMenuItem limpiarTablaItem = new JMenuItem("Limpiar Tabla");
		JMenuItem salir = new JMenuItem("Salir");

		limpiarTablaItem.addActionListener(e -> limpiarTabla.limpiar(listaCalificaciones, modeloTabla));
		salir.addActionListener(e -> System.exit(0));

		menuOpciones.add(limpiarTablaItem);
		menuOpciones.add(salir);
		menuBar.add(menuOpciones);
		frame.setJMenuBar(menuBar);

		// Panel superior
		JPanel panelSuperior = new JPanel(new GridLayout(3, 2, 10, 10));
		panelSuperior.setBorder(BorderFactory.createTitledBorder("Ingresar Calificación"));

		comboAlumnos = new JComboBox<>(new String[] { "Juan Pérez", "Ana López", "Carlos Ramírez" });
		comboAsignaturas = new JComboBox<>(new String[] { "Matemáticas", "Historia", "Programación" });
		txtNota = new JTextField();
		btnGuardar = new JButton("Guardar Nota");

		panelSuperior.add(new JLabel("Alumno:"));
		panelSuperior.add(comboAlumnos);
		panelSuperior.add(new JLabel("Asignatura:"));
		panelSuperior.add(comboAsignaturas);
		panelSuperior.add(new JLabel("Nota:"));
		panelSuperior.add(txtNota);

		frame.add(panelSuperior, BorderLayout.NORTH);

		// Panel central (Tabla de calificaciones)
		modeloTabla = new DefaultTableModel(new Object[] { "Alumno", "Asignatura", "Nota" }, 0);
		tablaCalificaciones = new JTable(modeloTabla);
		frame.add(new JScrollPane(tablaCalificaciones), BorderLayout.CENTER);

		// Panel inferior (Botón)
		JPanel panelInferior = new JPanel();
		panelInferior.add(btnGuardar);
		frame.add(panelInferior, BorderLayout.SOUTH);

		btnGuardar.addActionListener(e -> guardarCalificacion.guardar(comboAlumnos, comboAsignaturas, txtNota,
				listaCalificaciones, modeloTabla, frame));

		// Cargar calificaciones desde JSON al inicio
		cargarCalificaciones.cargar(listaCalificaciones, modeloTabla);

		frame.setVisible(true);
	}
}
