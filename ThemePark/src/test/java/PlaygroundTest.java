import Attractions.Playground;
import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    private Playground playground1;
    private Visitor visitor1;
    private Visitor visitor2;
    private Visitor visitor3;

    @Before
    public void before() {
        playground1 = new Playground("Clown Around");
        visitor1 = new Visitor(15, 150.0, 20.50);
        visitor2 = new Visitor(27, 170.0, 100.0);
        visitor3 = new Visitor(10, 130.5, 10.0);

    }

    @Test
    public void playgroundHasName() {
        assertEquals("Clown Around", playground1.getName());
    }

    @Test
    public void playgroundAllowsVisitorsAged15orUnder() {
        assertEquals(true, playground1.isAllowedTo(visitor1));
        assertEquals(true, playground1.isAllowedTo(visitor3));
        assertEquals(false, playground1.isAllowedTo(visitor2));
    }
}
