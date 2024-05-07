
    
    import java.io.EOFException;
    import java.io.DataInputStream;
    import java.io.FileInputStream;
    import java.io.IOException;
    
    public class Excepciones77 {
        public static void main(String[] args) {
            try {
                FileInputStream file = new FileInputStream("archivo.bin");
                DataInputStream data = new DataInputStream(file);
                while (true) {
                    int dato = data.readInt();
                    System.out.println(dato);
                }
            } catch (EOFException e) {
                System.out.println("Fin del archivo");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    