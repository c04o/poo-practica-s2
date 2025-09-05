package run;

import models.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true)
        {
            System.out.println("Desea Ingresar un estudiante? (si/no): ");
            String r = sc.nextLine();
            if (r.equals("no"))
            {
                break;
            }
            System.out.println("Ingrese en nombre del estudiante: ");
            String name = sc.nextLine();

            System.out.println("Inrese la edad del estudiante: ");
            int edad = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingrese las notas del estudiante separa por espacios (0 a 10)");
            String line = sc.nextLine();

            String[] parts = line.split(" ");


            int numGrades = parts.length;

            Student student = new Student(name, edad, numGrades);
            for (int i = 0; i < numGrades; i++)
            {
                student.grades[i] = Double.parseDouble(parts[i]);
            }

            students.add(student);

        }
        System.out.println("Lista de Estudiantes con promedio mayor o igual a 8 ");

        for (Student s : students)
        {
            if (s.Avarage() >= 8.0)
            {
                s.showInfo();
            }
        }
    }
}
