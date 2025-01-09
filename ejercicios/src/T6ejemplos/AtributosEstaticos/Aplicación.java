package T6ejemplos.AtributosEstaticos;

public class Aplicación {

    public static void main(String[] args) {
        // Crear instancias de Persona
        Persona p1 = new Persona();
        System.out.println(p1.getEspecie()); // Llamada a método estático

        Persona p2 = new Persona("Pepe");
        System.out.println(p2);

        Persona p3 = new Persona("Maria");
        System.out.println(p3);
    }
}
