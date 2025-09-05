package models;

public class Student
{
    public String name;
    public int age;
    public double[] grades;
    ;

    public Student()
    {

    }
    public Student(String name, int age, int numGrades)
    {
        this.name = name;
        this.age = age;
        this.grades = new double[numGrades];
    }

    public void setGrade(int index, double grade)
    {
        if (index >= 0 && index < this.grades.length)
        {
            this.grades[index] = grade;
        }

    }
    public void showInfo()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        for (int i = 0; i < this.grades.length; i++)
        {
            System.out.println(grades[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Promedio: " + Avarage());
        System.out.println(" ");
    }

    public double Avarage()
    {
        double sum = 0.0;
        for (double grade : grades)
        {
            sum += grade;
        }
        return grades.length > 0 ? sum / grades.length : 0.0;
    }
}
