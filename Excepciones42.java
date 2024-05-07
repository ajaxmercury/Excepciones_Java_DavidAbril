
    import java.sql.SQLException;
import java.sql.SQLNonTransientConnectionException;

public class Excepciones42 {
    public static void main(String[] args) {
        try {
            throw new SQLNonTransientConnectionException("¡Error de conexión no transitorio de SQL!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
