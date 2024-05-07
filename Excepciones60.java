
    import java.nio.file.FileAlreadyExistsException;

    public class Excepciones60 {
        public static void main(String[] args) {
            FileAlreadyExistsException excepcion = new FileAlreadyExistsException("archivo.txt");
            excepcion.printStackTrace();
        }
    }
    