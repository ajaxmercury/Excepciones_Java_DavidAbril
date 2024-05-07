
    import java.nio.file.DirectoryNotEmptyException;

    public class Excepciones61 {
        public static void main(String[] args) {
            DirectoryNotEmptyException excepcion = new DirectoryNotEmptyException("directorio");
            excepcion.printStackTrace();
        }
    }
    