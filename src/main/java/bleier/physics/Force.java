package bleier.physics;

public class Force {
    private double degrees;
    private double magnitude;
    private double radians;
    private double x;
    private double y;

    public Force(double degrees, double magnitude) {
        this.degrees = degrees;
        this.magnitude = magnitude;
        radians = Math.toRadians(degrees);
        x = magnitude * Math.cos(radians);
        y = magnitude * Math.sin(radians);
    }

    public Force add(Force force) {
        double x = this.x + force.x;
        double y = this.y + force.y;
        double magnitude = Math.sqrt(x * x
                + y * y);
        double degrees = Math.toDegrees(Math.atan(y / x));
        return new Force(degrees, magnitude);
    }

    @Override
    public String toString() {
        return "Force{"
                + "magnitude="
                + magnitude
                + ", degrees="
                + degrees
                + '}';
    }
}
