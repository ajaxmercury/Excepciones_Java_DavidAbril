import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Excepciones12 {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        Class<?> clase = String.class;
        Method metodo = clase.getMethod("length");
        Field campo = clase.getField("CASE_INSENSITIVE_ORDER");
    }
}


