
    import java.sql.SQLException;
    import java.sql.SQLDataException;
    
    public class Excepciones31 {
        public static void main(String[] args) {
            try {
                throw new SQLDataException("¡Error de datos SQL!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    