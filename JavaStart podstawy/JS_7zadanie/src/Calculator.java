public class Calculator {
    int a, b, c;

    /*Calculator(int a, int b, int c){
        this(a, b);
        this.c = c;
    }
    Calculator(int a, int b){
        this.a = a;
        this.b = b;

    }*/
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        int y = add(a, b);
        return y + c;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        int y = subtract(a, b);
        return y - c;
    }
}
