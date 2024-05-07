
    import java.sql.SQLException;
    import java.sql.SQLTransientConnectionException;
    
    public class Excepciones46 {
        public static void main(String[] args) {
            try {
                throw new SQLTransientConnectionException("¡Error de conexión transitorio de SQL!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    