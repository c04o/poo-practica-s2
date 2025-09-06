package run;

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

    // 1. Convertir a mayúsculas
    public String convertirAMayusculas() {
        return texto.toUpperCase();
    }

    // 2. Convertir a minúsculas
    public String convertirAMinusculas() {
        return texto.toLowerCase();
    }

    // 3. Invertir cadena
    public String invertir() {
        return new StringBuilder(texto).reverse().toString();
    }

    // 4. Verificar si es palíndromo
    public boolean esPalindromo() {
        // Eliminar espacios y convertir a minúsculas para mejor comparación
        String textoLimpio = texto.replaceAll("\\s+", "").toLowerCase();
        String invertido = new StringBuilder(textoLimpio).reverse().toString();
        return textoLimpio.equals(invertido);
    }

    // 5. Contar vocales y consonantes
    public int[] contarVocalesYConsonantes() {
        int vocales = 0;
        int consonantes = 0;
        String textoLimpio = texto.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚ]", "").toLowerCase();

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

    // Método para mostrar estadísticas (opcional)
    public void mostrarEstadisticas() {
        int[] contadores = contarVocalesYConsonantes();
        System.out.println("Cadena: " + texto);
        System.out.println("Mayúsculas: " + convertirAMayusculas());
        System.out.println("Minúsculas: " + convertirAMinusculas());
        System.out.println("Invertida: " + invertir());
        System.out.println("¿Es palíndromo? " + (esPalindromo() ? "Sí" : "No"));
        System.out.println("Vocales: " + contadores[0]);
        System.out.println("Consonantes: " + contadores[1]);
        System.out.println("-----------------------------");
    }

    // Clase principal para probar la funcionalidad
    public static void main(String[] args) {
        // Ejemplos de prueba
        Cadena cadena1 = new Cadena("Anita lava la tina");
        Cadena cadena2 = new Cadena("Hola Mundo");
        Cadena cadena3 = new Cadena("Java");
        Cadena cadena4 = new Cadena("Reconocer");

        // Probar los métodos
        cadena1.mostrarEstadisticas();
        cadena2.mostrarEstadisticas();
        cadena3.mostrarEstadisticas();
        cadena4.mostrarEstadisticas();

        // Pruebas individuales
        System.out.println("Pruebas individuales:");
        System.out.println("'Java' en mayúsculas: " + cadena3.convertirAMayusculas());
        System.out.println("'Hola Mundo' invertido: " + cadena2.invertir());
        System.out.println("'Reconocer' es palíndromo: " + cadena4.esPalindromo());

        int[] contadores = cadena2.contarVocalesYConsonantes();
        System.out.println("'Hola Mundo' - Vocales: " + contadores[0] + ", Consonantes: " + contadores[1]);
    }
}