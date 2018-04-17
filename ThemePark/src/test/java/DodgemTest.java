import Attractions.Dodgem;
import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    private Dodgem dodgem1;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void before() {
        dodgem1 = new Dodgem("Bumpy Ride");
        visitor1 = new Visitor(16, 165, 30.0);
        visitor2 = new Visitor(11, 155, 30.0);
    }


    @Test
    public void dodgemHasName() {
        assertEquals("Bumpy Ride", dodgem1.getName());
    }

    @Test
    public void rollercoasterCharges6ButHalfPriceToUnder15YearOlds() {
        assertEquals(6, dodgem1.priceFor(visitor1), 0);
        assertEquals(3, dodgem1.priceFor(visitor2), 0);
    }

    @Test
    public void dodgemHasFunRating() {
        assertEquals(8, dodgem1.getFunRating());
    }


}
