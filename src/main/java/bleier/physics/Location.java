package bleier.physics;

public class Location {
    double x, y;

    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Location apply(Force force) {
        double x = force.getX();
        double y = force.getY();
        Location location = new Location( x, y);
        return location;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
