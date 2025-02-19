import javax.swing.JFrame;

public class Interfaz{
    private JFrame ventana;

    public Interfaz(){
        ventana = new JFrame("Hola Mundo");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    
}