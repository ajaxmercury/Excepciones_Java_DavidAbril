
    import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Excepciones26 {
    public static void main(String[] args) {
        String fechaString = "2022-05-07";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fecha = dateFormat.parse(fechaString); // Esto lanzará ParseException
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
