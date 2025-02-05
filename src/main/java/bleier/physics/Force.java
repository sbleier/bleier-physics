package bleier.physics;

public class Force {
    private double degrees;
    private double magnitude;
    private double radians;
    private double x;
    private double y;

    public Force() {
        degrees = 0;
        magnitude = 0;
        radians = 0;
        x = 0;
        y = 0;
    }

    public Force(int degrees, int magnitude) {
        this.degrees = degrees;
        this.magnitude = magnitude;
        radians = Math.toRadians(degrees);
        x = magnitude * Math.cos(radians);
        y = magnitude * Math.sin(radians);
    }

    public Force add(Force force) {
        Force solution = new Force();
        solution.x = this.x + force.x;
        solution.y = this.y + force.y;
        solution.magnitude = Math.sqrt(solution.x * solution.x
                + solution.y * solution.y);
        solution.degrees = Math.toDegrees(Math.atan(solution.y / solution.x));
        return solution;
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
