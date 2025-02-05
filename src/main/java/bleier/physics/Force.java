package bleier.physics;

public class Force {
    private double degrees;
    private double magnitude;
    private double radians;
    private double X;
    private double Y;

    public Force() {
        degrees = 0;
        magnitude = 0;
        radians = 0;
        X = 0;
        Y = 0;
    }
    public Force(int degrees, int magnitude) {
        this.degrees = degrees;
        this.magnitude = magnitude;
        radians = Math.toRadians(degrees);
        X= magnitude * Math.cos(radians);
        Y = magnitude * Math.sin(radians);
    }

    public Force add(Force force) {
        Force solution = new Force();
        solution.X = this.X + force.X;
        solution.Y = this.Y + force.Y;
        solution.magnitude = Math.sqrt(solution.X * solution.X + solution.Y * solution.Y);
        solution.degrees = Math.toDegrees(Math.atan(solution.Y / solution.X));
        return solution;
    }

    @Override
    public String toString() {
        return "Force{" +
                "magnitude=" + magnitude +
                ", degrees=" + degrees +
                '}';
    }
}
