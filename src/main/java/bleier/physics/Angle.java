package bleier.physics;

public class Angle {
    private double value;

    public Angle(double value) {
        this.value = value;
    }

    public double toRadians() {
        return Math.toRadians(value);
    }

    public double toDegrees() {
        return value;
    }
}
