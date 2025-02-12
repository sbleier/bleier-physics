package bleier.physics;

public class Location {
    double x;
    double y;

    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Location apply(Force f) {
        double x = this.x + f.getX();
        double y = this.y + f.getY();
        Location location = new Location(x, y);
        return location;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
