
    import java.sql.SQLException;

    public class Excepciones35 {
        public static void main(String[] args) {
            try {
                throw new SQLException("¡Error de SQL!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    