
public class Direccion {
	private int portal;
	private String calle;
	private int piso;
	private int puerta;
	public int getPortal() {
		return portal;
	}
	public void setPortal(int portal) {
		this.portal = portal;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public int getPuerta() {
		return puerta;
	}
	public void setPuerta(int puerta) {
		this.puerta = puerta;
	}
	public Direccion(int portal, String calle, int piso, int puerta) {

		this.portal = portal;
		this.calle = calle;
		this.piso = piso;
		this.puerta = puerta;
	}
	public Direccion() {

		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Direccion [portal=" + portal + ", calle=" + calle + ", piso=" + piso + ", puerta=" + puerta + "]";
	}
	
	
	
	
	
}
