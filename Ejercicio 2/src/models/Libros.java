package models;

    public class Libros
    {
        public String name;
        public String author;
        public  int anio;

        public Libros()
        {

        }
        public Libros(String name, String author, int anio) {
            this.name = name;
            this.author = author;
            this.anio = anio;
        }

        public void showInfo()
        {
            System.out.println("Nombre: " + this.name);
            System.out.println("Autor: " + this.author);
            System.out.println("Año: " + this.anio);
        }
    }

