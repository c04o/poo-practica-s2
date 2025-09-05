package run;

public class Tablero {
    private char[][] matriz;
    private boolean primerTurno; // para mostrar posiciones al inicio

    public Tablero() {
        matriz = new char[3][3];
        primerTurno = true;

        // Inicializar con espacios
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matriz[i][j] = ' ';
    }

    // Mostrar tablero
    public void mostrarTablero() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == ' ' && primerTurno) {
                    System.out.print(i + "" + j + " | "); // mostrar posición solo al inicio
                } else {
                    System.out.print(matriz[i][j] + " | ");
                }
            }
            System.out.println();
            System.out.println("-------------");
        }
        primerTurno = false; // después de mostrar por primera vez, se desactiva
    }

    // Colocar ficha
    public boolean colocarFicha(int fila, int col, char ficha) {
        if (fila < 0 || fila > 2 || col < 0 || col > 2)
            return false; // fuera de rango
        if (matriz[fila][col] == ' ') {
            matriz[fila][col] = ficha;
            return true;
        }
        return false; // casilla ocupada
    }

    // Verificar ganador
    public char verificarGanador() {
        // Filas y columnas
        for (int i = 0; i < 3; i++) {
            if (matriz[i][0] != ' ' && matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2])
                return matriz[i][0];
            if (matriz[0][i] != ' ' && matriz[0][i] == matriz[1][i] && matriz[1][i] == matriz[2][i])
                return matriz[0][i];
        }
        // Diagonales
        if (matriz[0][0] != ' ' && matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2])
            return matriz[0][0];
        if (matriz[0][2] != ' ' && matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0])
            return matriz[0][2];

        return ' '; // sin ganador
    }

    // Verificar si tablero lleno
    public boolean tableroLleno() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (matriz[i][j] == ' ')
                    return false;
        return true;
    }
}
