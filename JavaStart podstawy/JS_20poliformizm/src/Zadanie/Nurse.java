package Zadanie;

public class Nurse extends Person {
    private double overtime;

    public Nurse(String imie, String nazwisko, double wyplata, double overtime) {
        super(imie, nazwisko, wyplata);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    @Override
    public String toString() {
        return super.toString()+", nadgodziny: "+getOvertime();
    }
}
