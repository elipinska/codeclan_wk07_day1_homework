import People.Visitor;
import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    private CandyFlossStall candyFlossStall1;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void before() {
        candyFlossStall1 = new CandyFlossStall("Sweet Emporium", "Ellie", 2);
        visitor1 = new Visitor(50, 170, 400);
        visitor2 = new Visitor(12, 150, 15);
    }

    @Test
    public void candyFlossStallHasName() {
        assertEquals("Sweet Emporium", candyFlossStall1.getName());
    }

    @Test
    public void candyFlossStallHasOwnerName() {
        assertEquals("Ellie", candyFlossStall1.getOwnerName());
    }


    @Test
    public void candyFlossStallHasParkingSpot() {
        assertEquals(2, candyFlossStall1.getParkingSpot());
    }

    @Test
    public void stallIsChargeableTwoFifty() {
        assertEquals(2.50, candyFlossStall1.priceFor(visitor1), 0.01);
        assertEquals(2.50, candyFlossStall1.priceFor(visitor2), 0.01);
    }



}
