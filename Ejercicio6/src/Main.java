import run.Ciudad;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] datos = new double[4][7];

        System.out.println("Ingrese las temperaturas (7 días por cada una de las 4 semanas):");
        for (int i = 0; i < 4; i++) {
            System.out.println("Semana " + (i + 1) + ":");
            for (int j = 0; j < 7; j++) {
                System.out.println("Día " + (j + 1) + " (°C):");
                datos[i][j] = sc.nextDouble();
            }
        }

        Ciudad c = new Ciudad(datos);

        for (int i = 0; i < 4; i++) {
            System.out.printf("Promedio por semana %d %.2f °C%n", i + 1, c.promedioSemanal(i));
        }

        System.out.println("Temperatura máx del mes: " + c.temperatura_max() + " °C");
        System.out.println("Día más frío: " + c.dia_mas_frio());

        sc.close();
    }
}
