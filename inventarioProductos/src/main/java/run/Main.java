package run;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario(5);

        // Añadir productos
        inventario.añadirProducto(new Producto("Lápiz", "P001", 10));
        inventario.añadirProducto(new Producto("Borrador", "P002", 3));
        inventario.añadirProducto(new Producto("Regla", "P003", 2));
        inventario.añadirProducto(new Producto("Cuaderno", "P004", 15));

        // Buscar producto
        Producto encontrado = inventario.buscarPorCodigo("P002");
        System.out.println("Producto encontrado: " + encontrado);

        // Mostrar productos con stock bajo
        inventario.mostrarProductosStockBajo();
    }
}