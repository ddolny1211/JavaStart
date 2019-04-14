package Zadanie;

public class Zadanie {
    public static void main(String[] args){
        double[][] table = new double[3][3];
        table[0][0]=1;
        table[0][1]=1.5;
        table[0][2]=2;
        table[1][0]=1.5;
        table[1][1]=2;
        table[1][2]=2.5;
        table[2][0]=2;
        table[2][1]=2.5;
        table[2][2]=3;

        double firstMultiplyCross;
        double secondMultiplyCross;
        double midRecordSum;
        double midColumnSum;

        double sumMultiplyCross;
        double recColSumMultiply;

        double edgeSum;

        firstMultiplyCross=table[0][0]*table[1][1]*table[2][2];
        secondMultiplyCross=table[0][2]*table[1][1]*table[2][0];

        midRecordSum=table[1][0]+table[1][1]+table[1][2];
        midColumnSum=table[0][1]+table[1][1]+table[2][1];

        sumMultiplyCross=firstMultiplyCross+secondMultiplyCross;
        recColSumMultiply=midColumnSum+midRecordSum;

        edgeSum=table[0][0]+table[0][1]+table[0][2]+
                table[1][0]+table[1][2]+table[2][0]+table[2][1]+table[2][2];

        System.out.println("Suma iloczynów przekątnej tablicy wynosi "+sumMultiplyCross);
        System.out.println("Iloczyn sum środkowego wiersza i środkowej kolumny tablicy wynosi "+recColSumMultiply);
        System.out.println("Suma wszystkich elementów przy krawędzi tablicy wynosi "+edgeSum);



    }
}
