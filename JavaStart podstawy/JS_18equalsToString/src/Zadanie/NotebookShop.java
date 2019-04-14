package Zadanie;

public class NotebookShop {
    public static void main(String[] args) {
        DataStore ds = new DataStore();

        /*Computer comp1 = new Computer("ASUS",1234);
        Computer comp2 = new Computer("ACER",4332);
        Computer comp3 = new Computer("HPs",8889);
        Computer comp4 = new Computer("ASUS",1234);
        Computer comp5 = new Computer("Toshiba",1222);

        ds.add(comp1);
        ds.add(comp2);
        ds.add(comp3);
        ds.add(comp4);
        ds.add(comp5);*/

        ds.add(new Computer("ASUS",1234));

        Computer compToFind = new Computer("ASUS",1234);
        int computersFound = ds.checkAvailability(compToFind);
        System.out.println("Liczba komputerów "+compToFind+": "+computersFound);

        System.out.println("Wszystkie dostępne komputery: ");
        for(Computer c: ds.getComputers()){
            System.out.println(c);
        }

    }
}
