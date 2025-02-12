package bleier.physics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForceTest {

    @Test
    public void add() {
        //given (set variables)
        Force a = new Force(32, 10);
        Force b = new Force(105, 10);

        //when (test variables)
        Force c = a.add(b);

        //then (check results)
        assertEquals(68.5, c.getDegrees(), 0.1);
        assertEquals(16.08, c.getMagnitude(), 0.1);
    }

    @Test
    public void scale() {
        //given
        Force a = new Force(30, 15);
        double t = 0.391;

        //when
        Force b = a.scale(t);

        //then
        assertEquals(30, b.getDegrees(), 0.1);
        assertEquals(5.865, b.getMagnitude(), 0.1);

    }
}