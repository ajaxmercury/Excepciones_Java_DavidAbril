
    import javax.xml.datatype.DatatypeConfigurationException;

    public class Excepciones70 {
        public static void main(String[] args) {
            DatatypeConfigurationException exception = new DatatypeConfigurationException("¡Error en configuración de tipo de datos!");
            exception.printStackTrace();
        }
    }
    