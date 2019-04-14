package Zadanie;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private Map<String, Employee> company = new HashMap<>();


    public void add(String key, Employee emp){
        company.put(key, emp);
        System.out.println("Dodano pracownika!");
    }

    public void search(String name, String lname){
        String key = name+lname;
        Employee emp = company.get(key);
        System.out.println(emp);
    }


}
