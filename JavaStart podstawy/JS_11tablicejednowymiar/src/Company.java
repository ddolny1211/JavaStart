public class Company {
    public static void main(String[] args){
        Employee[] employees = new Employee[20];
        employees[0]=new Employee("Marek","Kostrzewski",7900);
        employees[1]=new Employee("Józef","Stalin",5600);
        employees[2]=new Employee("Andrzej","Borzyszczak",4200);
        employees[3]=new Employee("Daniel","Magical",2900);
        employees[4]=new Employee("Rafał","Rafoniks",2500);
        System.out.println(employees[1].getFirstName()+" "+employees[1].getLastName()+" ma pensję "+employees[1].getSalary());

        int employeesSize = employees.length;
        System.out.println("Wielkosc tablicy: "+employeesSize);
        System.out.println("Ostatni element tablicy to: "+employees[employeesSize-1]);

    }
}
