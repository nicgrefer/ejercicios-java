package asd;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import GestorLibros.Libro;

public class controlador {

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
	
}
