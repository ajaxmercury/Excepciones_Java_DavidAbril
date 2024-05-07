public class Excepciones30 {
  
        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder(10);
            sb.setLength(-1); // Esto lanzará IllegalStateException
        }
    }
    