package logic;

import points.Point;

public class PointController {

    public void addX(Point x){
        x.setX(x.getX() +1);
    }

    public void addY(Point y){
        y.setY(y.getY() +1);
    }
    public void minusX(Point x){
        x.setX(x.getX() -1);
    }

    public void minusY(Point y){
        y.setY(y.getY() -1);
    }


}
