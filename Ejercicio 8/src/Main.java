import run.EstadisticaTexto;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elija modo de ingreso:");
        System.out.println("1. Ingresar palabras individualmente");
        System.out.println("2. Ingresar frase o párrafo");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        String[] palabras;

        if (opcion == 1) {
            System.out.print("¿Cuántas palabras va a ingresar? ");
            int n = sc.nextInt();
            sc.nextLine();

            palabras = new String[n];
            for (int i = 0; i < n; i++) {
                while (true) {
                    System.out.print("Palabra " + (i + 1) + ": ");
                    String entrada = sc.nextLine().trim();
                    if (entrada.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
                        palabras[i] = entrada;
                        break;
                    } else {
                        System.out.println("Error: Solo se permiten palabras (letras). Intenta de nuevo.");
                    }
                }
            }
        } else {
            System.out.print("Ingrese su frase o párrafo: ");
            String frase = sc.nextLine();

            String[] todasPalabras = frase.split("\\s+");
            ArrayList<String> listaPalabras = new ArrayList<>();
            for (String palabra : todasPalabras) {
                palabra = palabra.replaceAll("^[^a-zA-ZáéíóúÁÉÍÓÚñÑ]+", "");
                palabra = palabra.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚñÑ]+$", "");
                if (!palabra.isEmpty()) {
                    listaPalabras.add(palabra);
                }
            }
            palabras = listaPalabras.toArray(new String[0]);
        }

        EstadisticaTexto estadistica = new EstadisticaTexto(palabras);

        System.out.println("\nCantidad de palabras: " + estadistica.contarPalabras());

        System.out.println("Palabras únicas:");
        Set<String> unicas = estadistica.palabrasUnicas();
        for (String palabra : unicas) {
            System.out.println("- " + palabra);
        }

        System.out.println("Palabra más larga: " + estadistica.palabraMasLarga());
        System.out.println("Palabra más corta: " + estadistica.palabraMasCorta());

        sc.close();
    }
}
