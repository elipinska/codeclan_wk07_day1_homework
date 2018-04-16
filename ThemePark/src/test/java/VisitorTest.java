import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    private Visitor visitor1;

    @Before
    public void before() {
        visitor1 = new Visitor(13, 150.00, 20);
    }

    @Test
    public void visitorHasAge() {
        assertEquals(13, visitor1.getAge());
    }

    @Test
    public void visitorHasHeight() {
        assertEquals(150, visitor1.getHeight(), 0);
    }

    @Test
    public void visitorHasWallet() {
        assertEquals(20, visitor1.getWallet(), 0);
    }


}
