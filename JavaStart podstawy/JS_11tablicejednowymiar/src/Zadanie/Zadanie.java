package Zadanie;

public class Zadanie {
    public static void main(String[] args){
        int[] firstTable = {1,2,3};
        int[] secondTable = {4,5,6};

        int summary=firstTable[0]+firstTable[1]+firstTable[2]+secondTable[0]+
                secondTable[1]+secondTable[2];
        System.out.println("Suma elementów obu tablic wynosi: "+summary);
    }
}
