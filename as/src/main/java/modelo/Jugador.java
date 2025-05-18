package modelo;

public class Jugador {
	private String nombre;
    private String posicion;
    private int edad;
    private boolean enForma;

    public Jugador(String nombre, String posicion, int edad, boolean enForma) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.enForma = enForma;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s | Posición: %s | Edad: %d | En forma: %s",
                nombre, posicion, edad, enForma ? "Sí" : "No");
    }
}
