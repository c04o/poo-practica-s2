package run;

import models.Libros;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Libros> libros = new ArrayList<>();
        int option = 0;
        do
        {
            System.out.println("-- Menu --");
            System.out.println("1. Ingresar libro");
            System.out.println("2. Lista libros");
            System.out.println("3. Busqueda de libros");
            System.out.println("4. Libros despues de 2010");
            System.out.println("5. Salir");
            option = sc.nextInt();
            sc.nextLine();
            switch (option)
            {
                case 1:
                    System.out.println("Ingrese el Titulo del libro");
                    String name = sc.nextLine();
                    System.out.println("Ingrese el nombre del autor del libro");
                    String author = sc.nextLine();
                    System.out.println("Ingrese el año de publicación del libro");
                    int anio = sc.nextInt();
                    sc.nextLine();

                    Libros libro = new Libros(name, author, anio);
                    libros.add(libro);

                    System.out.println("Libro ingresado correctamente");
                    break;

                case 2:
                    for (Libros l : libros)
                    {
                        l.showInfo();
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el author o el TItulo del libro que desea buscar");
                    String key = sc.nextLine();
                    boolean found = false;
                    for (Libros l : libros)
                        if (l.name.toLowerCase().contains(key.toLowerCase()) || l.author.toLowerCase().contains(key.toLowerCase()))
                        {
                            l.showInfo();
                            found = true;
                        }
                    if (!found)
                    {
                        System.out.println("No hau coincidencias en su busqueda");
                    }
                    break;

                case 4:
                    for  (Libros l : libros)
                    {
                        if (l.anio >2010)
                        {
                            l.showInfo();
                        }
                        break;
                    }
                case 5:
                    System.out.println("Saliendo del progama...");
                    break;

                default:
                    System.out.println("Opción no valida");

            }


        } while (option != 5);
        sc.close();


    }
}
