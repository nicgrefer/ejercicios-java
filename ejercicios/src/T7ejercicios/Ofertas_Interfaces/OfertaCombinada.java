package T7ejercicios.Ofertas_Interfaces;

public class OfertaCombinada extends Cliente {

    private double descuento;

    public OfertaCombinada(String nombre, String email, double tarifaPorSegundo, double descuento) {
        super(nombre, email, tarifaPorSegundo);
        this.descuento = descuento;
    }

    @Override
    public void conexion(int s) {
        if (s > 180) {
            super.conexion(s - 180);
        } else {
            super.conexion(s);
        }
    }

    @Override
    public double importe() {
        return super.importe() * (1 - this.descuento);
    }
}