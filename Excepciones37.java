
    import java.sql.DataTruncation;
    import java.sql.SQLException;
    
    public class Excepciones37 {
        public static void main(String[] args) {
            try {
                throw new DataTruncation(10, true, true, 50, 100);
            } catch (DataTruncation e) {
                e.printStackTrace();
            }
        }
    }
    