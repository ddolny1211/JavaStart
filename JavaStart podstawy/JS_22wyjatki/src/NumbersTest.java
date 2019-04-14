public class NumbersTest {
    public static void main(String[] args) {
        Numbers nums = new Numbers();

        try{
            nums.add(3,12);
            int number3=nums.get(3);
            System.out.println(number3);

            nums.add(20,20);
            int number20 = nums.get(20);

            System.out.println(number20);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
