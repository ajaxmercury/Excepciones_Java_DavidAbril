
    import java.sql.BatchUpdateException;
    import java.sql.SQLException;
    
    public class Excepciones36 {
                public static void main(String[] args) {
            try {
                throw new BatchUpdateException("¡Error en la actualización en lote!", new int[] {1, 2});
            } catch (BatchUpdateException e) {
                e.printStackTrace();
            }
        }
    }
    