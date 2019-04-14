public class warunki {
    public static void main(String[] args){
        int a=10;
        int b=100;
        int c=50;

        if(a>b){
            if(a>c){
                System.out.println("A jest większe od B i od C");
            }
            System.out.println("A jest większe od B ale mniejsze od C");
        }
        else{
            System.out.println("A jest mniejsze od B i od C");
        }
    }
}
