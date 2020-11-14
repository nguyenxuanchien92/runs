import entities.MovablePoint;
import entities.Point;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1, 1, 2, 2);
        System.out.println(movablePoint.move().toString());
        ;
    }
}
