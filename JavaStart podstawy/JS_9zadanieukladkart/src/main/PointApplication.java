package main;

import points.Point;
import logic.PointController;



public class PointApplication {

    public static final int ADD_X=0;
    public static final int ADD_Y=1;
    public static final int MINUS_X=2;
    public static final int MINUX_Y=3;


    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        PointController pc = new PointController();
        System.out.println("Punkt przed zmianą: ("+p1.getX()+","+p1.getY()+")");

        int option = ADD_X;

        switch(option){
            case ADD_X:
                pc.addX(p1);
                break;
            case ADD_Y:
                pc.addY(p1);
                break;
            case MINUS_X:
                pc.minusX(p1);
                break;
            case MINUX_Y:
                pc.minusY(p1);
                break;
            default:
                System.out.println("Podano błędną wartość");
        }

        System.out.println("Punkt po zmianie: ("+p1.getX()+","+p1.getY()+")");

    }
}
