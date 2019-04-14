import java.util.Random;
public class Operations {
    public static void main(String args[]){
        /*int x = 5;
        int y = 10;
        boolean logic = true;/*
        double sum = x + y;
        double sub = x - y;
        double multi = x * y;
        double div = x / y;
        double modulo = x % y;

        System.out.println(sum);//dodawanie
        System.out.println(sub);//odejmowanie
        System.out.println(multi);//mnozenie
        System.out.println(div);//dzielenie
        System.out.println(modulo);//modulo
        x += 5;
        System.out.println(x);*/
       /* System.out.print("Czy x jest większy od y?");
        System.out.println(x > y);

        System.out.print("Czy x jest różny od y?");
        System.out.println(x != y);

        boolean instance = "Kasia" instanceof java.lang.String;
        System.out.println(instance);
        System.out.print("x<10 && y<11?");
        System.out.println(x<10 && y<11);

        System.out.print("x<10 && y<10?");
        System.out.println(x<10 && y<10);

        System.out.print("x<10 || y<10?");
        System.out.println(x<10 || y<10);

        System.out.print(logic);
        System.out.print(" ,!logic = ");
        System.out.println(!logic);

        System.out.print("Warunek złożony !(x<10 && y<10)");
        System.out.println(!(x<10 && y<10));

        int num = 3;

        System.out.println(num++);
        System.out.println(num);

        System.out.println(++num);
        System.out.println(num);

        String s1 = "Dzień";
        String s2 = " Dobry";
        String s3 = s1 + s2;

        System.out.println(s3);

        System.out.println("Uczę się Javy od " + 3 + " godzin.");
        System.out.println("Kinga is beautiful, it is " + true);*/

        /*double number1 = 10.987;
        int number2 = 5;
        //konwersja zawężająca (ang. narrowing)
        int narrowing = (int)number1;

        //konwersja rozszerzająca (ang. widening)
        double widening = (double)number2;

        System.out.println("Narrowing: " + narrowing);
        System.out.println("Widening: " + widening);*/

        /*char letter1 = 'k';
        char letter2 = 'o';
        char letter3 = 't';

        System.out.println("Błędne \"sumowanie\"znaków");
        System.out.println(letter1 + letter2 + letter3);
        System.out.println("Tekst jawny");
        System.out.println("" + letter1 + letter2 + letter3);
        letter1++;
        letter2++;
        letter3++;
        System.out.println("Tekst zaszyfrowany");
        System.out.println("" + letter1 + letter2 + letter3);*/
        int x = new Random().nextInt(20);
        int y = new Random().nextInt(20);

        System.out.println(x);
        System.out.println(y);

        System.out.print("czy X jest większe od y? :");
        System.out.println(x>y);

        System.out.print("Czy x pomnożone przez 2 jest większe od y? : ");
        System.out.println((x*2)>y);

        System.out.print("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego od 2? :");
        System.out.println(y<(x+3) && y>(x-2));

        System.out.print("Czy iloczyn liczb x i y jest parzysty?: ");
        int modulo = (x*y)%2;
        System.out.println(modulo==0);


    }
}
