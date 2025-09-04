package run;

public class Inventario {
    private Producto[] productos;
    private int contador;

    public Inventario(int capacidadInicial) {
        productos = new Producto[capacidadInicial];
        contador = 0;
    }

    // Añadir productos
    public void añadirProducto(Producto nuevoProducto) {
        if (contador == productos.length) {
            duplicarCapacidad();
        }
        productos[contador] = nuevoProducto;
        contador++;
    }

    private void duplicarCapacidad() {
        Producto[] nuevoArreglo = new Producto[productos.length * 2];
        System.arraycopy(productos, 0, nuevoArreglo, 0, productos.length);
        productos = nuevoArreglo;
    }

    // Buscar por código
    public Producto buscarPorCodigo(String codigo) {
        for (int i = 0; i < contador; i++) {
            if (productos[i].getCodigo().equals(codigo)) {
                return productos[i];
            }
        }
        return null;
    }

    // Mostrar productos con stock < 5
    public void mostrarProductosStockBajo() {
        System.out.println("\nProductos con stock bajo (<5):");
        for (int i = 0; i < contador; i++) {
            if (productos[i].getCantidad() < 5) {
                System.out.println(productos[i]);
            }
        }
    }
}