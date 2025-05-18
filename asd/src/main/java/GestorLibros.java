import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class GestorLibros extends JFrame {


    static class Libro {
        private String titulo;
        private String autor;

        public Libro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        @Override
        public String toString() {
            return "📚 " + titulo + " - " + autor;
        }
    }


    private JTextField campoTitulo;
    private JTextField campoAutor;
    private JButton btnAgregar;
    private JTextArea areaLibros;

    private List<Libro> listaLibros = new ArrayList<>();

    public GestorLibros() {
        super("Gestor de Libros");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Panel superior (formulario)
        JPanel panelFormulario = new JPanel(new GridLayout(3, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Nuevo Libro"));

        campoTitulo = new JTextField();
        campoAutor = new JTextField();
        btnAgregar = new JButton("Agregar libro");

        panelFormulario.add(new JLabel("Título:"));
        panelFormulario.add(campoTitulo);
        panelFormulario.add(new JLabel("Autor:"));
        panelFormulario.add(campoAutor);
        panelFormulario.add(new JLabel());
        panelFormulario.add(btnAgregar);

        add(panelFormulario, BorderLayout.NORTH);


        areaLibros = new JTextArea();
        areaLibros.setEditable(false);
        add(new JScrollPane(areaLibros), BorderLayout.CENTER);

  
        btnAgregar.addActionListener(e -> agregarLibro());

        setVisible(true);
    }

    private void agregarLibro() {
        String titulo = campoTitulo.getText();
        String autor = campoAutor.getText();

        if (!titulo.isEmpty() && !autor.isEmpty()) {
            Libro nuevo = new Libro(titulo, autor);
            listaLibros.add(nuevo);
            actualizarListado();
            campoTitulo.setText("");
            campoAutor.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Completa todos los campos", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void actualizarListado() {
        StringBuilder sb = new StringBuilder("📋 Lista de libros:\n");
        for (Libro libro : listaLibros) {
            sb.append(libro).append("\n");
        }
        areaLibros.setText(sb.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GestorLibros::new);
    }
}
