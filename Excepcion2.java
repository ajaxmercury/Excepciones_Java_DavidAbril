public class Excepcion2 {
    
        public static void main(String[] args) {
            setEdad(-5);
        }
    
        public static void setEdad(int edad) {
            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa");
            }
        }
    }
    

