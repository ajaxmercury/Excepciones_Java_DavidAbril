
    import java.sql.SQLException;
    import java.sql.SQLTransientException;
    
    public class Excepciones34 {
        public static void main(String[] args) {
            try {
                throw new SQLTransientException("¡Error transitorio de SQL!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    