package run;

public class Ciudad {
    private double [][] temperaturas;

    public Ciudad(double [][] temperaturas) {
        this.temperaturas = temperaturas;
    }

    // promedio de una semana (semana va de 0 a 3)
    public double promedioSemanal(int semana) {
        double suma = 0;
        for (int j = 0; j < 7; j++) { // recorrer días
            suma += temperaturas[semana][j];
        }
        return suma / 7.0;
    }

    // buscar la temperatura máxima
    public double temperatura_max() {
        double max = temperaturas[0][0];
        for (int i = 0; i < 4; i++) { // semanas
            for (int j = 0; j < 7; j++) { // días
                if (temperaturas[i][j] > max) {
                    max = temperaturas[i][j];
                }
            }
        }
        return max;
    }

    // día más frío
    public String dia_mas_frio() {
        double min = temperaturas[0][0];
        int semana_fria = 0;
        int dia_frio = 0;

        for (int i = 0; i < 4; i++) { // semanas
            for (int j = 0; j < 7; j++) { // días
                if (temperaturas[i][j] < min) {
                    min = temperaturas[i][j];
                    semana_fria = i;
                    dia_frio = j;
                }
            }
        }
        return String.format("Semana %d, Día %d con %.2f°C", semana_fria + 1, dia_frio + 1, min);
    }
}