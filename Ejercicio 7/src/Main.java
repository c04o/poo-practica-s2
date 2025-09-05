import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad de estudiantes: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        Estudiante[] estudiantes = new Estudiante[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Estudiante #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            System.out.print("Cantidad de notas: ");
            int n = scanner.nextInt();
            double[] notas = new double[n];
            for (int j = 0; j < n; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[j] = scanner.nextDouble();
            }
            scanner.nextLine();
            estudiantes[i] = new Estudiante(nombre, edad, notas);
        }

        System.out.println("\nEstudiantes con promedio > 8.0:");
        for (Estudiante e : estudiantes) {
            if (e.calcularPromedio() > 8.0) {
                e.mostrarDatos();
            }
        }

        scanner.close();
    }
}
