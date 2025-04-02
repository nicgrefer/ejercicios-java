import java.awt.*;
import java.awt.event.*;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


@JsonIgnoreProperties(ignoreUnknown = true)
class Calificacion {
    String alumno;
    String asignatura;
    double nota;

    // Constructor vacío necesario para Jackson
    public Calificacion() {}

    public Calificacion(String alumno, String asignatura, double nota) {
        this.alumno = alumno;
        this.asignatura = asignatura;
        this.nota = nota;
    }

    // Getters y Setters obligatorios para Jackson
    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}

public class Aplicacion2 {
    private JFrame frame;
    private JComboBox<String> comboAlumnos;
    private JComboBox<String> comboAsignaturas;
    private JTextField txtNota;
    private JButton btnGuardar;
    private JTable tablaCalificaciones;
    private DefaultTableModel modeloTabla;
    private List<Calificacion> listaCalificaciones;

    public Aplicacion2() {
        listaCalificaciones = new ArrayList<>();
        frame = new JFrame("Calificación de Alumnos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());

        // Crear menú
        JMenuBar menuBar = new JMenuBar();
        JMenu menuOpciones = new JMenu("Opciones");
        JMenuItem limpiarTabla = new JMenuItem("Limpiar Tabla");
        JMenuItem salir = new JMenuItem("Salir");

        limpiarTabla.addActionListener(e -> limpiarTabla());
        salir.addActionListener(e -> System.exit(0));

        menuOpciones.add(limpiarTabla);
        menuOpciones.add(salir);
        menuBar.add(menuOpciones);
        frame.setJMenuBar(menuBar);

        // Panel superior
        JPanel panelSuperior = new JPanel(new GridLayout(3, 2, 10, 10));
        panelSuperior.setBorder(BorderFactory.createTitledBorder("Ingresar Calificación"));

        comboAlumnos = new JComboBox<>(new String[]{"Juan Pérez", "Ana López", "Carlos Ramírez"});
        comboAsignaturas = new JComboBox<>(new String[]{"Matemáticas", "Historia", "Programación"});
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
        modeloTabla = new DefaultTableModel(new Object[]{"Alumno", "Asignatura", "Nota"}, 0);
        tablaCalificaciones = new JTable(modeloTabla);
        frame.add(new JScrollPane(tablaCalificaciones), BorderLayout.CENTER);

        // Panel inferior (Botón)
        JPanel panelInferior = new JPanel();
        panelInferior.add(btnGuardar);
        frame.add(panelInferior, BorderLayout.SOUTH);

        btnGuardar.addActionListener(e -> guardarCalificacion());

        // Cargar calificaciones desde JSON al inicio
        cargarCalificacionesDesdeJSON();

        frame.setVisible(true);
    }

    private void guardarCalificacion() {
        try {
            String alumno = (String) comboAlumnos.getSelectedItem();
            String asignatura = (String) comboAsignaturas.getSelectedItem();
            double nota = Double.parseDouble(txtNota.getText());

            listaCalificaciones.add(new Calificacion(alumno, asignatura, nota));
            modeloTabla.addRow(new Object[]{alumno, asignatura, nota});
            txtNota.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Por favor, introduce una nota válida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarTabla() {
        listaCalificaciones.clear();
        modeloTabla.setRowCount(0);
    }

    private void cargarCalificacionesDesdeJSON() {
        try (InputStream fichero = getClass().getClassLoader().getResourceAsStream("calificaciones.json")) {
            if (fichero == null) {
                System.out.println("Error: No se encontró el archivo calificaciones.json");
                return;
            }

            String json;
            try (Scanner scanner = new Scanner(fichero, StandardCharsets.UTF_8.name())) {
                json = scanner.useDelimiter("\\A").next();
            }

            ObjectMapper objectMapper = new ObjectMapper();
            List<Calificacion> calificaciones = objectMapper.readValue(json, new TypeReference<List<Calificacion>>() {});

            listaCalificaciones.addAll(calificaciones);

            // Cargar datos en la tabla
            for (Calificacion c : calificaciones) {
                modeloTabla.addRow(new Object[]{c.alumno, c.asignatura, c.nota});
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Aplicacion2::new);
    }
}
