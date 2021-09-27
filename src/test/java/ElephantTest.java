import org.junit.*;

import static org.junit.Assert.*;

public class ElephantTest {
    Elephant e;

    @Before
    public void setUp() throws Exception {
        e = new Elephant();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Bahruuhhaa!", e.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(5, e.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        e.upgradeSpeed();
        assertEquals(6, e.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        e.downgradeSpeed();
        assertEquals(4, e.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(30, e.getPrice());
    }

}
