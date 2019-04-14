public class ForLoop {
    public static void main(String[] args){
        int[] numbers = new int[10];

        //uzupełniamy tablicę
        for(int i=0;i<10;i++){
            numbers[i]=i+1;
        }

        //wyświetlamy tablicę
        for(int i =0; i<10;i++){
            System.out.println("Liczba: "+numbers[i]);
        }
    }
}
