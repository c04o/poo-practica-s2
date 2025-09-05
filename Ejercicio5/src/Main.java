import run.AnalizadorTexto;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar el texto
        System.out.println("Ingrese un texto:");
        String entrada = sc.nextLine();

        AnalizadorTexto analizador = new AnalizadorTexto(entrada);

        int opcion;
        do {
            System.out.println("\n=== Analizador de Texto ===");
            System.out.println("1. Contar palabras");
            System.out.println("2. Contar ocurrencias de una palabra");
            System.out.println("3. Reemplazar palabra");
            System.out.println("4. Mostrar texto actual");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Cantidad de palabras: " + analizador.contarPalabras());
                    break;

                case 2:
                    System.out.print("Ingrese la palabra a buscar: ");
                    String palabra = sc.nextLine();
                    System.out.println("La palabra '" + palabra + "' aparece " +
                            analizador.contarOcurrencias(palabra) + " veces.");
                    break;

                case 3:
                    System.out.print("Palabra a reemplazar: ");
                    String vieja = sc.nextLine();
                    System.out.print("Nueva palabra: ");
                    String nueva = sc.nextLine();
                    String reemplazado = analizador.reemplazarPalabra(vieja, nueva);
                    System.out.println("Texto modificado: " + reemplazado);
                    break;

                case 4:
                    System.out.println("Texto actual: " + analizador.getTexto());
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
