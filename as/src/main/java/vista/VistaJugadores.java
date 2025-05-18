package vista;

import javax.swing.*;
import java.awt.*;

public class VistaJugadores extends JFrame {

    public JTextField txtNombre = new JTextField();
    public JTextField txtEdad = new JTextField();
    public JComboBox<String> comboPosicion = new JComboBox<>(new String[]{"Portero", "Defensa", "Centrocampista", "Delantero"});
    public JCheckBox checkEnForma = new JCheckBox("Está en forma");
    public JButton btnAgregar = new JButton("Agregar jugador");
    public JTextArea areaJugadores = new JTextArea();
    public JLabel lblEstadoNombre = new JLabel("Longitud nombre: 0");
    public JPanel panelCampo = new JPanel();
    public JPanel panelFormulario = new JPanel();

    public VistaJugadores() {
        super("Gestión de Jugadores de Equipo Deportivo");
        setLayout(new BorderLayout(10, 10));
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel de formulario
        panelFormulario = new JPanel(new GridLayout(5, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Nuevo Jugador"));

        panelFormulario.add(new JLabel("Nombre:"));
        panelFormulario.add(txtNombre);
        panelFormulario.add(new JLabel("Edad:"));
        panelFormulario.add(txtEdad);
        panelFormulario.add(new JLabel("Posición:"));
        panelFormulario.add(comboPosicion);
        panelFormulario.add(new JLabel(""));
        panelFormulario.add(checkEnForma);
        panelFormulario.add(lblEstadoNombre);
        panelFormulario.add(btnAgregar);

        add(panelFormulario, BorderLayout.NORTH);

        areaJugadores.setEditable(false);
        add(new JScrollPane(areaJugadores), BorderLayout.CENTER);

        panelCampo.setPreferredSize(new Dimension(200, 100));
        panelCampo.setBackground(Color.GREEN);
        panelCampo.setToolTipText("Haz clic en el campo para registrar entrada");
        add(panelCampo, BorderLayout.SOUTH);

        setVisible(true);
    }
}
