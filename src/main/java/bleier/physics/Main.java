package bleier.physics;

public class Main {
    public static void main(String[] args) {

        Force force = new Force(new Angle(68), 90);
        Location location = new Location(0,0);

        for (int i = 0; i < 20; i++) {
            force = force.add(Force.GRAVITY);
            location = location.move(force);
            System.out.println(location);
        }
    }
}
