
    import java.io.IOException;
    import java.net.Socket;
    
    public class Excepciones81 {
        public static void main(String[] args) {
            try {
                Socket socket = new Socket("host.inexistente", 80);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    