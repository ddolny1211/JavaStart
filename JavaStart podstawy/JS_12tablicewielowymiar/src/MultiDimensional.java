public class MultiDimensional {
    public static void main(String[] args){
        int[][] tab = new int [3][3];
        tab[0][0] = 5;
        tab[1][1] = 5;
        tab[2][2] = 5;

        System.out.println("tab[0][0] = "+tab[0][0]);

        int[][] array = new int[3][];
        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[1];

        String[] firstName = {"Karol","Basia","Cezary"};
        String[] lastName = {"Kopiec","Gregoriańska","Pazura"};

        String[][] firstLast = {firstName, lastName};

        System.out.println("Pierwsza osoba to "+firstLast[0][0]+ " "+firstLast[1][0]);
        System.out.println("Druga osoba to "+firstLast[0][1]+" "+firstLast[1][1]);
        System.out.println("Trzecia osoba to "+firstLast[0][2]+" "+firstLast[1][2]);


        int[] longTab = new int[1000];
        longTab[99]=100;
        int[] midTab = new int[100];
        int[] smallTab = new int[10];

        int[][] hugeTab=new int[3][];
        hugeTab[0]=longTab;
        hugeTab[1]=midTab;
        hugeTab[2]=smallTab;

        System.out.println("Długość tablic:");
        System.out.println(hugeTab[0].length +" ; "+hugeTab[1].length+" ; "+hugeTab[2].length);
        System.out.println("Setny element pierwszej tablicy to "+hugeTab[0][99]);
    }
}
