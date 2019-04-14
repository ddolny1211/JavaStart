public class NumberAdder {
    public static void main(String[] args) {
        int number = sum(50);
        System.out.println(number);
        checkNumber(10);
        checkNumber(11);
        System.out.println();
    }
//    static int sum(int n){
//        if(n>1){
//            System.out.println(n+" + "+" sum("+(n-1)+")");
//            return n + sum(n-1);
//        }else{
//            return n;
//        }
//    }
    static int sum(int n){
        return n > 1 ? n + sum(n-1) : n;
    }

    static void checkNumber(int n){
        String check = n%2==0 ? "Parzysta": "Nieparzysta";
        System.out.println(n+" "+check);
    }
}
