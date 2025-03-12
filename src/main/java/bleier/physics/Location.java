package bleier.physics;

public class Location {
    private double x;
    private double y;

    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public Location move(Force f) {
        return new Location(this.x + f.getX(), this.y + f.getY());
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Location{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
