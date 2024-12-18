package Usando_Lomboq;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	@ToString

public class Trabajador {
	private String nombre;
	private String dni;
	private Direccion direccion;
	
	
	

	public void copiarDireccion(Trabajador trabajadorDestino)
	{
		//trabajadorDestino.setDireccion(this.direccion);
		trabajadorDestino.direccion=this.direccion;
	}

}
