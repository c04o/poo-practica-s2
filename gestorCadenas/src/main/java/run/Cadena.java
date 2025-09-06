public class Cadena {
    private String texto;

    // Constructor
    public Cadena(String texto) {
        this.texto = texto;
    }

    // Getter y Setter
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    // Convertir a mayúsculas
    public String convertirAMayusculas() {
        return texto.toUpperCase();
    }

    // Convertir a minúsculas
    public String convertirAMinusculas() {
        return texto.toLowerCase();
    }

    // Invertir cadena
    public String invertir() {
        return new StringBuilder(texto).reverse().toString();
    }

    // Verificar si es palíndromo
    public boolean esPalindromo() {
        String textoLimpio = texto.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚñÑ]", "").toLowerCase();
        String invertido = new StringBuilder(textoLimpio).reverse().toString();
        return textoLimpio.equals(invertido);
    }

    // Contar vocales y consonantes
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

    // Contar total de letras
    public int contarLetras() {
        String textoLimpio = texto.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚñÑ]", "");
        return textoLimpio.length();
    }

    // Método para mostrar estadísticas
    public void mostrarEstadisticas() {
        int[] contadores = contarVocalesYConsonantes();
        System.out.println("═".repeat(50));
        System.out.println("Cadena: \"" + texto + "\"");
        System.out.println("Mayúsculas: \"" + convertirAMayusculas() + "\"");
        System.out.println("Minúsculas: \"" + convertirAMinusculas() + "\"");
        System.out.println("Invertida: \"" + invertir() + "\"");
        System.out.println("¿Es palíndromo? " + (esPalindromo() ? "✅ Sí" : "❌ No"));
        System.out.println("Total letras: " + contarLetras());
        System.out.println("Vocales: " + contadores[0]);
        System.out.println("Consonantes: " + contadores[1]);
        System.out.println("═".repeat(50));
    }
}