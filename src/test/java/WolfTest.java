import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WolfTest {
    Wolf w;

    @Before
    public void setUp() throws Exception {
        w = new Wolf();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("GRRRRRR", w.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(31, w.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        w.upgradeSpeed();
        assertEquals(32, w.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        w.downgradeSpeed();
        assertEquals(30, w.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(3100, w.getPrice());
    }
}
