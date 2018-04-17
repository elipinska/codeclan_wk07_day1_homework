import People.Visitor;
import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    private IceCreamStall iceCreamStall1;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void before() {
        iceCreamStall1 = new IceCreamStall("Mary's Milk Bar", "Mary", 1);
        visitor1 = new Visitor(14, 160, 30);
        visitor2 = new Visitor(45, 180, 250);
    }

    @Test
    public void iceCreamStallHasName() {
        assertEquals("Mary's Milk Bar", iceCreamStall1.getName());
    }

    @Test
    public void iceCreamStallHasOwnerName() {
        assertEquals("Mary", iceCreamStall1.getOwnerName());
    }


    @Test
    public void iceCreamStallHasParkingSpot() {
        assertEquals(1, iceCreamStall1.getParkingSpot());
    }

    @Test
    public void stallIsChargeableTwoFifty() {
        assertEquals(2.50, iceCreamStall1.priceFor(visitor1), 0.01);
        assertEquals(2.50, iceCreamStall1.priceFor(visitor2), 0.01);
    }


    @Test
    public void iceCreamStallHasFunRating() {
        assertEquals(6, iceCreamStall1.getFunRating());
    }


}
