package T7ejercicios.Ofertas_Interfaces;

public class Oferta2 extends Cliente1 {

    private double descuento;

    public Oferta2(String nombre, String email, double tarifaPorSegundo, double descuento) {
        super(nombre, email, tarifaPorSegundo);
        this.descuento = descuento;
    }

    @Override
    public double importe() {
        return super.importe() * (1 - this.descuento);
    }
}