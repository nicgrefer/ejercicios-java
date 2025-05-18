package controlador;
import javax.swing.*;

import modelo.Jugador;
import vista.VistaJugadores;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class ControladorJugadores {
    private VistaJugadores vista;
    private List<Jugador> jugadores;

    public ControladorJugadores(VistaJugadores vista) {
        this.vista = vista;
        this.jugadores = new ArrayList<>();

        initControladores();
    }

    private void initControladores() {
        vista.btnAgregar.addActionListener(e -> agregarJugador());

        vista.txtNombre.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                vista.lblEstadoNombre.setText("Longitud nombre: " + vista.txtNombre.getText().length());
            }
        });

        vista.comboPosicion.addActionListener(e -> {
            String pos = (String) vista.comboPosicion.getSelectedItem();
            switch (pos) {
                case "Portero":
                    vista.panelFormulario.setBackground(Color.CYAN);
                    break;
                case "Defensa":
                    vista.panelFormulario.setBackground(Color.LIGHT_GRAY);
                    break;
                case "Centrocampista":
                    vista.panelFormulario.setBackground(Color.ORANGE);
                    break;
                case "Delantero":
                    vista.panelFormulario.setBackground(Color.PINK);
                    break;
                default:
                    vista.panelFormulario.setBackground(null);
            }
        });

        vista.checkEnForma.addItemListener(e -> {
            System.out.println("Jugador está en forma: " + (e.getStateChange() == ItemEvent.SELECTED));
        });

        vista.panelCampo.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(vista,
                        "Entrada registrada en el campo (x=" + e.getX() + ", y=" + e.getY() + ")",
                        "Campo deportivo", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        vista.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Aplicación cerrándose. Jugadores guardados: " + jugadores.size());
            }
        });
    }

    private void agregarJugador() {
        try {
            String nombre = vista.txtNombre.getText();
            int edad = Integer.parseInt(vista.txtEdad.getText());
            String posicion = (String) vista.comboPosicion.getSelectedItem();
            boolean enForma = vista.checkEnForma.isSelected();

            Jugador nuevo = new Jugador(nombre, posicion, edad, enForma);
            jugadores.add(nuevo);
            actualizarListado();
            limpiarFormulario();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Edad no válida", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actualizarListado() {
        StringBuilder sb = new StringBuilder("📋 Lista de Jugadores:\n");
        for (Jugador j : jugadores) {
            sb.append(j).append("\n");
        }
        vista.areaJugadores.setText(sb.toString());
    }

    private void limpiarFormulario() {
        vista.txtNombre.setText("");
        vista.txtEdad.setText("");
        vista.checkEnForma.setSelected(false);
        vista.comboPosicion.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VistaJugadores vista = new VistaJugadores();
            new ControladorJugadores(vista);
        });
    }
}
