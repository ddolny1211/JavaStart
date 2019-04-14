public class Company {
    public static void main(String[] args){
        Employee pracownik1 = new Employee();
        pracownik1.firstName = "Dawid";
        pracownik1.lastName = "Dolny";
        pracownik1.yearBorn = 1995;
        pracownik1.workDays = 654;

        Employee pracownik2 = new Employee();
        pracownik2.firstName = "Kamil";
        pracownik2.lastName = "Dolny";
        pracownik2.yearBorn = 1992;
        pracownik2.workDays = 778;

        Employee pracownik3 = new Employee();
        pracownik3.firstName = "Robert";
        pracownik3.lastName = "Bouszewski";
        pracownik3.yearBorn = 1996;
        pracownik3.workDays = 198;

        String pracownik1Info = pracownik1.firstName + " " + pracownik1.lastName
                + ", Urodzony: " + pracownik1.yearBorn
                + ", Pracuje " + pracownik1.workDays + " dni.";

        String pracownik2Info = pracownik2.firstName + " " + pracownik2.lastName
                + ", Urodzony: " + pracownik2.yearBorn
                + ", Pracuje " + pracownik2.workDays + " dni.";

        String pracownik3Info = pracownik3.firstName + " " + pracownik3.lastName
                + ", Urodzony: " + pracownik3.yearBorn
                + ", Pracuje " + pracownik3.workDays + " dni.";

        System.out.println(pracownik1Info);
        System.out.println(pracownik2Info);
        System.out.println(pracownik3Info);
    }
}
