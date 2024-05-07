
    import java.io.IOException;
    import java.net.Socket;
    import java.net.SocketTimeoutException;
    
    public class Excepciones80 {
        public static void main(String[] args) {
            try {
                Socket socket = new Socket("ejemplo.com", 80);
                socket.setSoTimeout(1000);
            } catch (SocketTimeoutException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    