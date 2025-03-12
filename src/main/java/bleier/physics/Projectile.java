package bleier.physics;

public class Projectile {

    private Location location;
    private Force force;

    public Projectile(Location location, Force force) {
        this.location = location;
        this.force = force;
    }
/*
    public Location apply(Force f, double t){
        double x = f.getX() * t;
        double y = f.getY() * t - ((1/2) * GRAVITY.getY() * (t*t)));
        Location location = new Location(x, y);
        return location;
    } */

    public Location getLocation() {
        return location;
    }

    public Force getForce() {
        return force;
    }


    public void add(Force f)
    {
        force = force.add(f);
    }

    public void move(double time)
    {
        Force scaled = force.scale(time);
        location = location.move(scaled);

    }

    @Override
    public String toString() {
        return "Projectile{" +
                "location=" +
                location +
                " force=" +
                force;
    }
}
