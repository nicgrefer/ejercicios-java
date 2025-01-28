
package T7ejercicios.Ofertas_Interfaces;

public class Usuario implements Operaciones {
	private String nombre;
	private String email;
	private int segundos;
	private double tarifaPorSegundo;
	private double descuento;

	public Usuario(String nombre, String email, double tarifaPorSegundo, double descuento) {
		this.nombre = nombre;
		this.email = email;
		this.tarifaPorSegundo = tarifaPorSegundo;
		this.descuento = descuento;
		this.segundos = 0;
	}

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getTarifaPorSegundo() {
		return tarifaPorSegundo;
	}

	public void setTarifaPorSegundo(double tarifaPorSegundo) {
		this.tarifaPorSegundo = tarifaPorSegundo;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public void conexion(int s) {
		this.segundos += s;
	}

	@Override
	public double importe() {
		double importeBase = this.segundos * this.tarifaPorSegundo;
		return importeBase * (1 - this.descuento);
	}

	@Override
	public void reset() {
		this.segundos = 0;
	}
}
