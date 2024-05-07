
    import java.sql.SQLException;
    import java.sql.SQLIntegrityConstraintViolationException;
    
    public class Excepciones40 {
                public static void main(String[] args) {
            try {
                throw new SQLIntegrityConstraintViolationException("¡Violación de integridad de SQL!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    