import java.io.FileInputStream;
import java.io.IOException;

public class Excepcion1 {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("archivo.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


