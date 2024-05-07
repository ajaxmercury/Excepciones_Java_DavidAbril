
    import java.sql.SQLException;
    import java.sql.SQLTransactionRollbackException;
    
    public class Excepciones45 {
        public static void main(String[] args) {
            try {
                throw new SQLTransactionRollbackException("¡Error de reversión de transacción SQL!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    