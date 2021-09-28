import org.junit.*;

import static org.junit.Assert.*;

public class TeslaModel3Test {

    TeslaModel3 t;

    @Before
    public void setUp() throws Exception {
        t = new TeslaModel3();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, t.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        t.upgradeSpeed();
        assertEquals(105, t.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        t.downgradeSpeed();
        assertEquals(99, t.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(45000, t.getPrice());
    }

}
