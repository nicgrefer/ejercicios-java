package T7ejercicios.Ofertas_Interfaces;

public class Cliente1 extends Usuario implements Oferta1 {
	
	
	
	public Cliente1(String nombre, String email, double tarifaPorSegundo, double descuento) {
		super(nombre, email, tarifaPorSegundo, descuento);
		// TODO Auto-generated constructor stub
	}
	public double importe() {
		return super.importe();
	}
	@Override
	public void descuento() {
		// TODO Auto-generated method stub
	}
	
}
