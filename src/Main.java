import entities.MovablePoint;
import entities.Point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1,1);

        MovablePoint movablePoint = new MovablePoint(point.getPositionX(), point.getPositionY(), 2,2);
        System.out.println(movablePoint.move().toString());;
    }
}
