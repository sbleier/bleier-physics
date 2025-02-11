package bleier.physics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {

    @Test
    public void apply(){
        //given
        Location location = new Location(7, 3);
        Force a = new Force(36.87, 5);

        //when
        Location newLocation = location.apply(a);

        //then
        assertEquals(11, a.getX(), .5);
        assertEquals(6, a.getY(), .5);
    }
}