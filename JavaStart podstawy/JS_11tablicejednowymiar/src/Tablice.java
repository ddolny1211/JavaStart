public class Tablice {
    public static void main(String[] args){
        //utworzenie tablicy, domyślnie wypełniona zerami
        int[] numbers = new int[5];
        //uzupełnienie wartości w poszczególnych komórkach tablicy
        numbers[0]=0;
        numbers[1]=5;
        numbers[2]=10;
        numbers[3]=15;
        numbers[4]=20;
        //wyświetlanie wartości:
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
    }
}
