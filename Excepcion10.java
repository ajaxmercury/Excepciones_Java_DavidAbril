
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Excepcion10 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("archivo.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


