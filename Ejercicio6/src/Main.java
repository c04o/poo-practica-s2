package run;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] datos = new double[4][7]; // 4 semanas, 7 días

        System.out.println("Ingrese las temperaturas (solo números) para 7 días de cada una de las 4 semanas:");

        for (int i = 0; i < 4; i++) {
            System.out.println("\nSemana " + (i + 1) + ":");
            for (int j = 0; j < 7; j++) {
                while (true) {
                    System.out.print("Día " + (j + 1) + " (°C): ");
                    String entrada = sc.nextLine().trim();
                    try {
                        double temp = Double.parseDouble(entrada);
                        datos[i][j] = temp;
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Ingresa un número válido para la temperatura.");
                    }
                }
            }
        }

        Ciudad ciudad = new Ciudad(datos);

        System.out.println("\n--- Promedios semanales ---");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Semana %d: %.2f °C%n", i + 1, ciudad.promedioSemanal(i));
        }

        System.out.printf("\nTemperatura máxima del mes: %.2f °C%n", ciudad.temperatura_max());

        System.out.println("Día más frío del mes: " + ciudad.dia_mas_frio());

        sc.close();
    }
}
