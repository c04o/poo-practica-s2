import java.util.Scanner;

public class Main {
    private static Contacto[] contactos = new Contacto[100];
    private static int contador = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar por nombre");
            System.out.println("3. Mostrar todos");
            System.out.println("4. Buscar por dominio");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            if (opcion == 1) {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Teléfono: ");
                String telefono = sc.nextLine();
                System.out.print("Correo: ");
                String correo = sc.nextLine();
                contactos[contador++] = new Contacto(nombre, telefono, correo);
            } else if (opcion == 2) {
                System.out.print("Nombre a buscar: ");
                String nombre = sc.nextLine();
                for (int i = 0; i < contador; i++) {
                    if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                        System.out.println(contactos[i]);
                    }
                }
            } else if (opcion == 3) {
                for (int i = 0; i < contador; i++) {
                    System.out.println(contactos[i]);
                }
            } else if (opcion == 4) {
                System.out.print("Dominio a buscar (@gmail.com, etc): ");
                String dominio = sc.nextLine();
                for (int i = 0; i < contador; i++) {
                    if (contactos[i].getCorreo().endsWith(dominio)) {
                        System.out.println(contactos[i]);
                    }
                }
            }
        } while (opcion != 5);
        sc.close();
    }
}
