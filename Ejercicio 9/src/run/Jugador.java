package run;

public class Jugador {
    private String nombre;
    private char ficha; // 'X' o 'O'

    public Jugador(String nombre, char ficha) {
        this.nombre = nombre;
        this.ficha = ficha;
    }

    public String getNombre() {
        return nombre;
    }

    public char getFicha() {
        return ficha;
    }
}