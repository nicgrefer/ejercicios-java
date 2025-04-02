package app;

import javax.swing.SwingUtilities;

import view.Aplicacion2;

public class app {
	public static void main(String[] args) {
        SwingUtilities.invokeLater(Aplicacion2::new);
    }
}
