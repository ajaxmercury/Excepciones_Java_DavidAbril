
    import org.xml.sax.SAXParseException;

    public class Excepciones73 {
        public static void main(String[] args) {
            SAXParseException exception = new SAXParseException("¡Error de análisis SAX!", null);
            exception.printStackTrace();
        }
    }
    