package Zadanie;

public class Student {

    private String imie;
    private String nazwisko;
    private int index;
    public static int licznik;

    public Student(){}

    public Student(String imie, String nazwisko, int index){
        setImie(imie);
        setNazwisko(nazwisko);
        setIndex(index);
        licznik++;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getIndex() {
        return index;
    }
}
