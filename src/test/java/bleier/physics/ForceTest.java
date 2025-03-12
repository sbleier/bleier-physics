package bleier.physics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForceTest {

    @Test
    public void add() {
        //given (set variables)
        Force a = new Force(new Angle(32), 10);


        Force b = new Force(new Angle(105), 10);

        //when (test variables)
        Force c = a.add(b);

        Force d = new Force(new Angle(68), 90);
        System.out.println(d.getX() + " " + d.getY());

        //then (check results)
        assertEquals(68.5, c.getDegrees(), 0.1);
        assertEquals(16.08, c.getMagnitude(), 0.1);
    }

    @Test
    public void scale() {
        //given
        Angle angle1 = new Angle(30);
        Force a = new Force(angle1, 15);
        double t = 0.391;

        //when
        Force b = a.scale(t);

        //then
        assertEquals(30, b.getDegrees(), 0.1);
        assertEquals(5.865, b.getMagnitude(), 0.1);

    }
}