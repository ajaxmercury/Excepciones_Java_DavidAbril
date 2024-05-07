
    import java.io.IOException;

    public class Excepciones48 {
    public static void main(String[] args) {
        IOException excepcion = new IOException("¡Error de E/S!");
        IOException excepcionConCausa = new IOException("¡Error con causa!", excepcion);
        excepcionConCausa.printStackTrace();
    }
}
