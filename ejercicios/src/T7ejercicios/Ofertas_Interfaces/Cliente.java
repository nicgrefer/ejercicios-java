package T7ejercicios.Ofertas_Interfaces;

public class Cliente extends Usuario {

    private int segundos;
    private final double TARIFA;

    public Cliente(String nombre, String email, double tarifaPorSegundo) {
        super(nombre, email);
        this.segundos = 0;
        this.TARIFA = tarifaPorSegundo;
    }

    @Override
    public void conexion(int s) {
        this.segundos += s;
    }

    @Override
    public void reset() {
        this.segundos = 0;
    }

    @Override
    public double importe() {
        return this.segundos * this.TARIFA;
    }
}