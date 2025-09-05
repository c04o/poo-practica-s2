package run;

public class AnalizadorTexto {
    private String texto;

    // Constructor
    public AnalizadorTexto(String texto) {
        this.texto = texto;
    }

    // Contar palabras
    public int contarPalabras() {
        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }
        String[] palabras = texto.trim().split("\\s+"); // separa por espacios
        return palabras.length;
    }

    // Contar cuántas veces aparece una palabra específica
    public int contarOcurrencias(String palabra) {
        if (texto == null || palabra == null) {
            return 0;
        }
        String[] palabras = texto.toLowerCase().split("\\s+");
        int contador = 0;
        for (String p : palabras) {
            if (p.equals(palabra.toLowerCase())) {
                contador++;
            }
        }
        return contador;
    }

    // Reemplazar una palabra por otra
    public String reemplazarPalabra(String palabraVieja, String palabraNueva) {
        if (texto == null) {
            return "";
        }
        return texto.replaceAll("\\b" + palabraVieja + "\\b", palabraNueva);
    }

    // Getter para obtener el texto actual
    public String getTexto() {
        return texto;
    }
}
