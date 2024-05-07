
    import java.sql.SQLException;
    import java.sql.SQLSyntaxErrorException;
    
    public class Excepciones44 {
        public static void main(String[] args) {
            try {
                throw new SQLSyntaxErrorException("¡Error de sintaxis SQL!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    