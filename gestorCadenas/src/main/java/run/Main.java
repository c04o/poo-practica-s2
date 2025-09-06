package run;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();
        scanner.close();

        Cadena cadena = new Cadena(texto);

        System.out.println("\n🔤 ANÁLISIS DE CADENA");
        System.out.println("═".repeat(40));
        System.out.println("Texto original: \"" + cadena.getTexto() + "\"");
        System.out.println("Mayúsculas: \"" + cadena.convertirAMayusculas() + "\"");
        System.out.println("Minúsculas: \"" + cadena.convertirAMinusculas() + "\"");
        System.out.println("Invertida: \"" + cadena.invertir() + "\"");
        System.out.println("¿Es palíndromo? " + (cadena.esPalindromo() ? "Sí" : "No"));

        int[] vocalesConsonantes = cadena.contarVocalesYConsonantes();
        System.out.println("Total letras: " + cadena.contarLetras());
        System.out.println("Vocales: " + vocalesConsonantes[0]);
        System.out.println("Consonantes: " + vocalesConsonantes[1]);
        System.out.println("═".repeat(40));
    }
}