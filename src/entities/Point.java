package entities;

public class Point {
    private float positionX;
    private float positionY;
    private float[] arr = new float[2];

    public Point(float positionX, float positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public float getPositionX() {
        return positionX;
    }

    public void setPositionX(float positionX) {
        this.positionX = positionX;
    }

    public float getPositionY() {
        return positionY;
    }

    public void setPositionY(float positionY) {
        this.positionY = positionY;
    }

    public void setXY(float positionX, float positionY) {
        this.arr[0] = positionX;
        this.arr[1] = positionY;
    }

    public float[] getXY() {
        return arr;
    }

    @Override
    public String toString() {
        return "(" + getXY()[0] + "," + getXY()[1] + ")";
    }
}
