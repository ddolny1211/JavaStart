package Zadanie;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Person doktor = new Doctor("Alojzy","Miauczyński",9500,2000);
        Person pieleg1 = new Nurse("Maria","Igła",3500,55);
        Person pieleg2 = new Nurse("Elżbieta","Wredna",3600,120);
        hospital.add(doktor);
        hospital.add(pieleg1);
        hospital.add(pieleg2);

        System.out.println(hospital);
        //hospital.toString();
    }
}
