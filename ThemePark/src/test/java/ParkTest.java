import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    private Park park1;

    @Before
    public void before() {
        park1 = new Park("Flying Dutchman");
    }

    @Test
    public void parkHasName() {
        assertEquals("Flying Dutchman", park1.getName());
    }


    @Test
    public void parkHasFunRating() {
        assertEquals(2, park1.getFunRating());
    }
}

