import Attractions.Rollercoaster;
import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    private Rollercoaster rollercoaster1;
    private Visitor visitor1;
    private Visitor visitor2;
    private Visitor visitor3;
    private Visitor visitor4;


    @Before
    public void before() {
        rollercoaster1 = new Rollercoaster("Flying Dutchman");
        visitor1 = new Visitor(11, 150, 15.9);
        visitor2 = new Visitor(16, 165, 30.0);
        visitor3 = new Visitor(13, 144, 12.0);
        visitor4 = new Visitor(14, 155, 30.0);
    }

    @Test
    public void rollercoasterHasName() {
        assertEquals("Flying Dutchman", rollercoaster1.getName());
    }

    @Test
    public void rollercoasterAllowsVisitorsOver12OldAndOver145cmTall() {
        assertEquals(false, rollercoaster1.isAllowedTo(visitor1));
        assertEquals(true, rollercoaster1.isAllowedTo(visitor2));
        assertEquals(false, rollercoaster1.isAllowedTo(visitor3));
    }

    @Test
    public void rollercoasterCharges6ButHalfPriceToUnder15YearOlds() {
        assertEquals(6, rollercoaster1.priceFor(visitor2), 0);
        assertEquals(3, rollercoaster1.priceFor(visitor4), 0);
    }

    @Test
    public void rollercoasterHasFunRating() {
        assertEquals(4, rollercoaster1.getFunRating());
    }
}

