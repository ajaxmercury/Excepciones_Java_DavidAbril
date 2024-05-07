
    import java.sql.SQLException;
    import java.sql.SQLInvalidAuthorizationSpecException;
    
    public class Excepciones41 {
        public static void main(String[] args) {
            try {
                throw new SQLInvalidAuthorizationSpecException("¡Especificación de autorización SQL inválida!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    