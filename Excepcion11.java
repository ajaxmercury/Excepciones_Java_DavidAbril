
    import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Excepcion11 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);

        Iterator<Integer> iterador = lista.iterator();
        while (iterador.hasNext()) {
            Integer elemento = iterador.next();
            lista.add(3); 
        }
    }
}
