import Interfaces.IRestrictable;
import People.Visitor;
import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    private TobaccoStall tobaccoStall1;
    private Visitor visitor1;
    private Visitor visitor2;
    private Visitor visitor3;

    @Before
    public void before() {
        tobaccoStall1 = new TobaccoStall("The Pipe Shop", "Rodger", 5);
        visitor1 = new Visitor(15, 150.0, 20.50);
        visitor2 = new Visitor(27, 170.0, 100.0);
        visitor3 = new Visitor(10, 130.5, 10.0);
    }

    @Test
    public void tobaccoStallHasName() {
        assertEquals("The Pipe Shop", tobaccoStall1.getName());
    }

    @Test
    public void tobaccoStallHasOwnerName() {
        assertEquals("Rodger", tobaccoStall1.getOwnerName());
    }


    @Test
    public void tobaccoStallHasParkingSpot() {
        assertEquals(5, tobaccoStall1.getParkingSpot());
    }

    @Test
    public void tobaccoStallHasMinAgeOf18() {
        assertEquals(false, tobaccoStall1.isAllowedTo(visitor1));
        assertEquals(true, tobaccoStall1.isAllowedTo(visitor2));
        assertEquals(false, tobaccoStall1.isAllowedTo(visitor3));

    }

    @Test
    public void stallIsChargeableTwoFifty() {
        assertEquals(2.50, tobaccoStall1.priceFor(visitor1), 0.01);
        assertEquals(2.50, tobaccoStall1.priceFor(visitor2), 0.01);
    }


    @Test
    public void tobaccoStallHasFunRating() {
        assertEquals(1, tobaccoStall1.getFunRating());
    }



}

