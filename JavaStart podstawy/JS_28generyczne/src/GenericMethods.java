public class GenericMethods {
    public static void main(String[] args) {
        print5Times(5);
        print5Times("NAcczelnik");
    }

    public static <T> void print5Times(T arg){
        for(int i=0;i<5;i++){
            System.out.println(arg);
        }
    }
}
