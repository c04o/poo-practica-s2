package run;

public class Cadena {
    private String texto;

    public Cadena(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String convertirAMayusculas() {
        return texto.toUpperCase();
    }

    public String convertirAMinusculas() {
        return texto.toLowerCase();
    }

    public String invertir() {
        return new StringBuilder(texto).reverse().toString();
    }

    public boolean esPalindromo() {
        String textoLimpio = texto.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚñÑ]", "").toLowerCase();
        String invertido = new StringBuilder(textoLimpio).reverse().toString();
        return textoLimpio.equals(invertido);
    }

    public int[] contarVocalesYConsonantes() {
        int vocales = 0;
        int consonantes = 0;
        String textoLimpio = texto.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚñÑ]", "").toLowerCase();

        for (int i = 0; i < textoLimpio.length(); i++) {
            char c = textoLimpio.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú') {
                vocales++;
            } else {
                consonantes++;
            }
        }

        return new int[]{vocales, consonantes};
    }

    public int contarLetras() {
        String textoLimpio = texto.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚñÑ]", "");
        return textoLimpio.length();
    }
}