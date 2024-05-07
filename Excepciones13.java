public class Excepciones13 {

        public static void main(String[] args) {
            try {
                Class<?> clase = Class.forName("ClaseInexistente");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    
