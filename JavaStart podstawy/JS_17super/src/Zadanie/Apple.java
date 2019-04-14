package Zadanie;

public class Apple extends Fruit {
    private String type;

    public Apple(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Jabłko "+getType());
    }
}
