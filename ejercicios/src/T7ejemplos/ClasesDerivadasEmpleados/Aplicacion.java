package T7ejemplos.ClasesDerivadasEmpleados;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado emp = new Empleado();
        emp.setNombre("Juan");
        emp.setApellidos("Gomez");
        emp.setSalariobase(1200);
        System.out.println(emp.datosPersonales());

        Programador prog = new Programador();
        prog.setNombre("Marta");
        prog.setApellidos("Martinez");
        prog.setSalariobase(1500);
        prog.setHoras(100);
        prog.setPrecioHora(10);
        System.out.println(prog.datosPersonales());
	}

}
