
    import java.nio.file.NoSuchFileException;

    public class Excepciones59 {
        public static void main(String[] args) {
            NoSuchFileException excepcion = new NoSuchFileException("archivo.txt");
            excepcion.printStackTrace();
        }
    }
    