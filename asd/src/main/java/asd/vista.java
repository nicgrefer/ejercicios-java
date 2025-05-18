package asd;

import javax.swing.*;
import java.awt.*;

public class VistaLibros extends JFrame {
    public JTextField campoTitulo = new JTextField();
    public JTextField campoAutor = new JTextField();
    public JButton btnAgregar = new JButton("Agregar libro");
    public JTextArea areaLibros = new JTextArea();

    public VistaLibros() {
        super("Gestor de Libros");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        JPanel panelFormulario = new JPanel(new GridLayout(3, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Nuevo Libro"));

        panelFormulario.add(new JLabel("Título:"));
        panelFormulario.add(campoTitulo);
        panelFormulario.add(new JLabel("Autor:"));
        panelFormulario.add(campoAutor);
        panelFormulario.add(new JLabel());
        panelFormulario.add(btnAgregar);

        add(panelFormulario, BorderLayout.NORTH);

        areaLibros.setEditable(false);
        add(new JScrollPane(areaLibros), BorderLayout.CENTER);

        setVisible(true);
    }
}
