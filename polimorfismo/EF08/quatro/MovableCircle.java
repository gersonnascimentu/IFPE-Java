package polimorfismo.EF08.quatro;

import polimorfismo.EF08.quatro.MovablePoint;

public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint( x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "(" + center.x + ", " + center.y + "), speed=(" + center.xSpeed + ", " + center.ySpeed + "), radius=" + radius;
    }

    @Override
    public void moveUp() {
        this.center.ySpeed -= center.ySpeed;
    }

    @Override
    public void moveDown() {
        this.center.ySpeed += center.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.center.xSpeed -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        this.center.xSpeed += center.xSpeed;
    }
}
