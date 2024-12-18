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

public class Empresa {
	private String nombre;
	private String cif;
	private Direccion direccion;
	


}
