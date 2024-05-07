
    import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
public class Excepciones39 {
    public static void main(String[] args) {
        try {
            throw new SQLFeatureNotSupportedException("¡Función SQL no soportada!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
