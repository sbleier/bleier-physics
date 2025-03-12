package bleier.physics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectileTest {

    @Test
    public void add() {
        Projectile proj = new Projectile(new Location(0, 0),
                new Force(new Angle(32), 10));

        proj.add(new Force(new Angle(105), 10));

        assertEquals(68.5, proj.getForce().getDegrees(), .1);
        assertEquals(16.08, proj.getForce().getMagnitude(), .1);
    }

    @Test
    public void move(){
        Projectile proj = new Projectile(new Location(7, 3), new Force(new Angle(36.87), 5));
        System.out.println(proj.getForce().getX() + " " + proj.getForce().getY());

        //when
        proj.move(2);

        //then
        assertEquals(14.98, proj.getLocation().getX(), .1);
        assertEquals(9.014, proj.getLocation().getY(), .1);


    }


}