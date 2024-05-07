
    import java.time.LocalDate;
    import java.time.format.DateTimeFormatter;
    import java.time.format.DateTimeParseException;
    
    public class Excepciones27 {
        public static void main(String[] args) {
            String fechaString = "2022-05-07";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            try {
                LocalDate fecha = LocalDate.parse(fechaString, formatter); // Esto lanzará DateTimeParseException
            } catch (DateTimeParseException e) {
                e.printStackTrace();
            }
        }
    }
    
