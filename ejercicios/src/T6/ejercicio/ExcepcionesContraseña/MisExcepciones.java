package T6.ejercicio.ExcepcionesContraseña;

// Definimos las excepciones personalizadas dentro de su propia clase
public class MisExcepciones {

    public static class LongitudExcep extends Exception {
        public LongitudExcep(String msg) {
            super(msg);
        }
    }

    public static class MayusExcep extends Exception {
        public MayusExcep(String msg) {
            super(msg);
        }
    }

    public static class MinusExcep extends Exception {
        public MinusExcep(String msg) {
            super(msg);
        }
    }
}
