
    
    import java.net.URISyntaxException;

    public class Excepciones83 {
        public static void main(String[] args) {
            URISyntaxException exception = new URISyntaxException("¡URI sintaxis incorrecta!", "URI");
            exception.printStackTrace();
        }
    }
    