package T6ejemplos.AtributosEstaticos;

/**
 * Clase que representa una Persona con un identificador y un nombre.
 * Ejemplo de uso de atributos estáticos y constructores.
 * 
 * @author jovcubni
 * @version 1.0
 */
public class Persona {
    // Atributos
    private int idPersona;
    private String nombre;

    /**
     * Atributo estático que se comparte entre todas las instancias de la clase.
     * Se utiliza para asignar identificadores únicos a cada Persona.
     */
    private static int contador = 0;

    // Constructores
    public Persona() {
        contador++;
        this.idPersona = contador;
        this.nombre = "";
    }

    public Persona(String nombre) {
        contador++;
        this.idPersona = contador;
        this.nombre = nombre;
    }

    public Persona(int idPersona, String nombre) {
        this.idPersona = idPersona;
        this.nombre = nombre;
    }

    // Getters y setters
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método estático que devuelve la especie de la clase.
     * No necesita una instancia para ser invocado.
     * 
     * @return "Persona"
     */
    public static String getEspecie() {
        return "Persona";
    }

    // Sobrescritura del método toString
    @Override
    public String toString() {
        return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + "]";
    }
}