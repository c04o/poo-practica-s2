import run.Tablero;
import run.Jugador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del Jugador 1 (X): ");
        Jugador j1 = new Jugador(sc.nextLine(), 'X');

        System.out.print("Nombre del Jugador 2 (O): ");
        Jugador j2 = new Jugador(sc.nextLine(), 'O');

        Tablero t = new Tablero();
        Jugador turno = j1;

        while (true) {
            // Mostrar tablero con posiciones
            System.out.println("Tablero actual (fila,columna):");
            t.mostrarTablero();

            int fila, col;
            while (true) {
                System.out.println(turno.getNombre() + " (" + turno.getFicha() + "), ingresa fila y columna (0-2):");
                System.out.print("Fila: ");
                fila = sc.nextInt();
                System.out.print("Columna: ");
                col = sc.nextInt();

                if (fila < 0 || fila > 2 || col < 0 || col > 2) {
                    System.out.println("¡Error! Fila y columna deben estar entre 0 y 2.");
                } else if (!t.colocarFicha(fila, col, turno.getFicha())) {
                    System.out.println("¡Error! La posición ya está ocupada.");
                } else {
                    break; // entrada válida
                }
            }

            char ganador = t.verificarGanador();
            if (ganador != ' ') {
                t.mostrarTablero();
                System.out.println("¡Felicidades! " + turno.getNombre() + " ha ganado!");
                break;
            }

            if (t.tableroLleno()) {
                t.mostrarTablero();
                System.out.println("¡Empate!");
                break;
            }

            // Cambiar turno
            turno = (turno == j1) ? j2 : j1;
        }

        sc.close();
    }
}