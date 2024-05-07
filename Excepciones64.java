
    
    import java.nio.charset.UnsupportedCharsetException;

    public class Excepciones64 {
        public static void main(String[] args) {
            UnsupportedCharsetException excepcion = new UnsupportedCharsetException("UTF-16");
            excepcion.printStackTrace();
        }
    }
    