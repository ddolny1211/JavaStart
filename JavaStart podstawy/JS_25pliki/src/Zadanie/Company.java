package Zadanie;

import java.io.Serializable;

public class Company implements Serializable {
    public static final int EMPLOYEES=3;
    private Employee[] employees = new Employee[EMPLOYEES];

    public Employee[] getEmployees(){
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void add(Employee emp, int index){
        employees[index]=emp;
    }
}
