package bleier.physics;

public class Force {

    public static final Force GRAVITY = new Force(0, -9.8);

    private double x;
    private double y;

    public Force(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Force(Angle angle, double magnitude){
        x = magnitude * Math.cos(angle.toRadians());
        y = magnitude * Math.sin(angle.toRadians());
    }

    public Force add(Force force) {
        return new Force(x + force.x, y + force.y);
    }

    public Force scale(double t) {
        return new Force((x * t), (y * t));
    }

    public double getDegrees() {
        return Math.toDegrees(Math.atan(y / x));
    }

    public double getMagnitude() {
        return Math.sqrt(x * x
                + y * y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Force{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
