package bleier.physics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForceTest {

    @Test
    public void add() {
        //given (set variables)
        Angle angle1 = new Angle(32);
        Force a = new Force(angle1, 10);

        Angle angle2 = new Angle(105);
        Force b = new Force(angle2, 10);

        //when (test variables)
        Force c = a.add(b);

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