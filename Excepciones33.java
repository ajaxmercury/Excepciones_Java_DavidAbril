
    import java.sql.SQLException;
    import java.sql.SQLNonTransientException;
    
    public class Excepciones33 {
        public static void main(String[] args) {
            try {
                throw new SQLNonTransientException("¡Error no transitorio de SQL!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    