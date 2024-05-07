
    import java.net.URISyntaxException;

    public class Excepciones66 {
        public static void main(String[] args) {
            URISyntaxException exception = new URISyntaxException("¡Sintaxis de URI incorrecta!", "URI");
            exception.printStackTrace();
        }
    }
    