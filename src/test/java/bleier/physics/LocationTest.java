package bleier.physics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {

    @Test
    public void apply() {
        //given
        Location location = new Location(7, 3);
        Angle a = new Angle(36.87);
        Force f = new Force(a, 5);

        //when
        Location newLocation = location.move(f);

        //then
        assertEquals(11, newLocation.getX(), .5);
        assertEquals(6, newLocation.getY(), .5);
    }

    @Test
    public void apply2() {

        //given
        Location location = new Location(0, 0);
        Angle a = new Angle(68);
        Force f = new Force(a, 90);

        //when
        Location newLocation = location.move(f);

        //then



    }
}