
    import java.nio.file.AccessDeniedException;

    public class Excepciones57 {
        public static void main(String[] args) {
            AccessDeniedException excepcion = new AccessDeniedException("¡Acceso denegado!");
            excepcion.printStackTrace();
        }
    }
    