
    import java.sql.SQLException;
    import java.sql.SQLTimeoutException;
    public class Excepciones32 {
                public static void main(String[] args) {
            try {
                throw new SQLTimeoutException("¡Tiempo de espera de SQL agotado!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    