
    import java.net.InetAddress;
    import java.net.UnknownHostException;
    
    public class Excepciones79 {
        public static void main(String[] args) {
            try {
                InetAddress address = InetAddress.getByName("host.inexistente");
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }
    }
    