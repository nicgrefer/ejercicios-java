package T7ejercicios.Ofertas_Interfaces;

public class Oferta1 extends Cliente {
	
	public Oferta1(double tarifaPorSegundo) {
        super(tarifaPorSegundo);
    }

    @Override
    public void conexion(int s) {
        if (s > 180) {
            super.conexion(s - 180);
        }
    }
	
}
