
    
    import java.nio.file.NotDirectoryException;

    public class Excepciones62 {
        public static void main(String[] args) {
            NotDirectoryException excepcion = new NotDirectoryException("archivo.txt");
            excepcion.printStackTrace();
        }
    }
    