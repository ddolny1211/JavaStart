package Zadanie;

public class University {

    public static void main(String[] args){
        System.out.println(Student.licznik);

        Student student1 = new Student("Marek", "Nowak", 255202);
        Student student2 = new Student("Kinga", "Gerej", 250569);
        Student student3 = new Student();

        System.out.println(Student.licznik);

    }
}
