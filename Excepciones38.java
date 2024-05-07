
    import java.sql.SQLClientInfoException;
    import java.sql.SQLException;
    import java.util.Properties;
    
    public class Excepciones38 {
        public static void main(String[] args) {
            try {
                Properties propiedades = new Properties();
                propiedades.setProperty("Cliente", "Info");
                throw new SQLClientInfoException();
            } catch (SQLClientInfoException e) {
                e.printStackTrace();
            }
        }
    }
    