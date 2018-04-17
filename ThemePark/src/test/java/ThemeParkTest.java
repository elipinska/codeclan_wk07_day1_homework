import Attractions.Dodgem;
import Attractions.Park;
import Attractions.Playground;
import Attractions.Rollercoaster;
import Interfaces.IEnjoyable;
import Stalls.CandyFlossStall;
import Stalls.IceCreamStall;
import Stalls.TobaccoStall;
import ThemePark.ThemePark;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark1;
    private ArrayList<IEnjoyable> enjoyables;
    private Dodgem dodgem;
    private Park park;
    private Playground playground;
    private Rollercoaster rollercoaster;
    private CandyFlossStall candyFlossStall;
    private IceCreamStall iceCreamStall;
    private TobaccoStall tobaccoStall;

    @Before
    public void before() {
        dodgem = new Dodgem("Bumpy Ride");
        park = new Park("The Big Green");
        playground = new Playground("Clown Around");
        rollercoaster = new Rollercoaster("Flying Dutchman");
        candyFlossStall = new CandyFlossStall("Sweet Emporium", "Ellie", 2);
        iceCreamStall = new IceCreamStall("Mary's Milk Bar", "Mary", 1);
        tobaccoStall = new TobaccoStall("The Pipe Shop", "Rodger", 5);
        enjoyables = new ArrayList();
        enjoyables.addAll(Arrays.asList(dodgem, park, playground, rollercoaster, candyFlossStall, iceCreamStall, tobaccoStall));
        themePark1 = new ThemePark(enjoyables);
    }

    @Test
    public void canGetEnjoyables() {
        assertEquals(ArrayList.class, themePark1.getEnjoyables().getClass());
    }

    @Test
    public void canGetEnjoyablesWithRatings() {
        assertEquals("Bumpy Ride: 8, The Big Green: 2, Clown Around: 7, Flying Dutchman: 4, Sweet Emporium: 5, Mary's Milk Bar: 6, The Pipe Shop: 1, ", themePark1.getEnjoyablesWithRating());
    }
}
