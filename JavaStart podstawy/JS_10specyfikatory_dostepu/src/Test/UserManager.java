package Test;

public class UserManager {
    public static void main(String[] args) {
        User user = new User("Jan", "Kowalski");

        System.out.println("Wybierz opcję:");
        System.out.println("1 - wyświetl dane o użytkowniku");
        System.out.println("2 - Modyfikuj dane użytkownika");
        System.out.println("0 - wyjdź z programu");

        int option = 0;

        if (option == 0) {
            System.out.println("PROGRAM ZOSTAŁ ZAKOŃCZONY");
        }
        else if(option==1){
            System.out.println("Użytkownik: "+user.getFirstName()+" "+user.getLastName());
        }
        else if(option==2){
            user.setFirstName("Marian");
            user.setLastName("Powolny");
            System.out.println("Zmieniono użytkownika na "+user.getFirstName()+ " "+user.getLastName() );
        }
    }
}
