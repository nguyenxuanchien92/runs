package entities;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    private float[] arr = new float[2];

    public MovablePoint(float positionX, float positionY, float xSpeed, float ySpeed) {
        super(positionX, positionY);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float get_x_speed() {
        return xSpeed;
    }

    public void set_x_speed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float get_y_speed() {
        return ySpeed;
    }

    public void set_y_speed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.arr[0] = xSpeed;
        this.arr[1] = ySpeed;
    }

    public float[] getSpeed() {
        return arr;
    }

    public MovablePoint move(){
        super.setXY();
        return this;
        //x += xSpeed;
        //y += ySpeed;
    }

    @Override
    public String toString() {
        String str = super.toString() + ", speed = (" + this.getSpeed()[0] + ", " + this.getSpeed()[1] + ")";
        return str;
    }
}
