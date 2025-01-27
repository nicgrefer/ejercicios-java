package T7ejercicios.Ofertas_Interfaces;

	public class Cliente implements Usuario {
	
	private int segundos;
	private final double TARIFA = 0.10;
	
	public Cliente(double tarifaPorSegundo) {
		this.segundos = 0;
	}

	@Override
	public void conexion(int s) {
		this.segundos += s;
	}
	
	@Override
	public void reset() {
        this.segundos = 0;
    }
	
}
