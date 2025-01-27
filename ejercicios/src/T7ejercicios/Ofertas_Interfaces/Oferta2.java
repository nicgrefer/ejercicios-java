package T7ejercicios.Ofertas_Interfaces;

public class Oferta2 extends Cliente {

	  private double descuento;

	    public Oferta2(double tarifaPorSegundo, double descuento) {
	        super(tarifaPorSegundo);
	        this.descuento = descuento;
	    }

	    @Override
	    public double importe() {
	        return super.importe() * (1 - this.descuento);
	    }
	
}
