package run;

import java.util.HashSet;
import java.util.Set;

public class EstadisticaTexto {
    private String[] palabras;

    public EstadisticaTexto(String[] palabras) {
        this.palabras = palabras;
    }

    // Contar cuántas palabras hay
    public int contarPalabras() {
        return palabras.length;
    }

    // Palabras únicas
    public Set<String> palabrasUnicas() {
        Set<String> unicas = new HashSet<>();
        for (String palabra : palabras) {
            unicas.add(palabra.toLowerCase());
        }
        return unicas;
    }

    // Palabra más larga
    public String palabraMasLarga() {
        if (palabras.length == 0) return "";
        String masLarga = palabras[0];
        for (String palabra : palabras) {
            if (palabra.length() > masLarga.length()) {
                masLarga = palabra;
            }
        }
        return masLarga;
    }

    // Palabra más corta
    public String palabraMasCorta() {
        if (palabras.length == 0) return "";
        String masCorta = palabras[0];
        for (String palabra : palabras) {
            if (palabra.length() < masCorta.length()) {
                masCorta = palabra;
            }
        }
        return masCorta;
    }
}