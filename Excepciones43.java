
    import java.sql.SQLException;
    import java.sql.SQLRecoverableException;
    
    public class Excepciones43 {        public static void main(String[] args) {
            try {
                throw new SQLRecoverableException("¡Error SQL recuperable!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    