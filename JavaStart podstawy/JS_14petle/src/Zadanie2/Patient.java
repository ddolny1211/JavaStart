package Zadanie2;

public class Patient {
    private String name;
    private String lastName;
    private String pesel;

    public Patient(){

    }

    public Patient(String name, String lastName, String pesel){
        setName(name);
        setLastName(lastName);
        setPesel(pesel);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
