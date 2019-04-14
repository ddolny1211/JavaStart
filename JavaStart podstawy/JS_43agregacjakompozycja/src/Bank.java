public class Bank {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstName="Jan";
        person1.lastName="Kowalski";
        person1.pesel="95111201257";
        person1.officialAddres="Warszawa, 01-401, Płocka 2";
        person1.realAddres="Warszawa, 01-401, Płocka 2";

        Person person2 = new Person();
        person1.firstName="Marta";
        person1.lastName="Kowalska";
        person1.pesel="97031112345";
        person1.officialAddres="Warszawa, 01-401, Płocka 2";
        person1.realAddres="Łódź, 14-222, Anihilów 12";


        BankAccount account1 = new BankAccount();
        account1.owner=person1;
        account1.balance=10_000;

        BankAccount account2 = new BankAccount();
        account2.owner=person2;
        account2.balance=1000;

        Credit credit1 = new Credit();
        credit1.owner=person1;
        credit1.cashBorrowed=2000;
        credit1.interestRate=0.05;
        credit1.termMonths=12;

        Credit credit2 = new Credit();
        credit2.owner=person2;
        credit2.cashBorrowed=10000;
        credit2.interestRate=0.02;
        credit2.termMonths=24;

        System.out.println("Osoba: ");
        System.out.println(person1.firstName+" "+person1.lastName+", PESEL: "+person1.pesel);
        System.out.println("Posiada konto bankowe z kwotą: "+account1.balance);
        System.out.println("Posiada kredyt na kwotę: "+credit1.cashBorrowed);
    }
}
