public class Numbers {
    private int[] numbers;

    public Numbers(){
        numbers = new int[10];
    }

    public void add(int index, int number) throws ArrayIndexOutOfBoundsException{
        if(index<0){
            throw new ArrayIndexOutOfBoundsException("Indeks musi być większy lub równy 0!");
        }else if(index >= numbers.length){
            throw new ArrayIndexOutOfBoundsException("Indeks musi być mniejszy niż rozmiar tablicy "+numbers.length);
        }
        numbers[index]=number;
    }

    public int get(int index) throws ArrayIndexOutOfBoundsException{
        if(index<0){
            throw new ArrayIndexOutOfBoundsException("Indeks musi być większy lub równy 0!");
        }else if(index >= numbers.length){
            throw new ArrayIndexOutOfBoundsException("Indeks musi być mniejszy niż rozmiar tablicy "+numbers.length);
        }
        return numbers[index];
    }
}
