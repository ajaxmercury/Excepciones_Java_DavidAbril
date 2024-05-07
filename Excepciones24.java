public class Excepciones24 {
    
        public static void main(String[] args) {
            System.setSecurityManager(new SecurityManager());
            System.setProperty("java.home", "/ruta/nueva"); // Lanzará SecurityException
        }
    }
    