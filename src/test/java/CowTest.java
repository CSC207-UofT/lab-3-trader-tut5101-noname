/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class CowTest {
    Cow c;

    @Before
    public void setUp() throws Exception {
        c = new Cow(5);
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Moo!", c.sound());
    }

    @Test(timeout = 50)
    public void TestPrice() {
        assertEquals(15, c.getPrice());
    }

    @Test(timeout = 50)
    public void TestFeedNormal() {
        c.feed();
        assertEquals(6, c.getSize());
    }

    @Test(timeout = 50)
    public void TestFeedExceed() {
        c.feed();
        c.feed();
        c.feed();
        c.feed();
        c.feed();
        assertFalse(c.feed());
    }

    @Test(timeout = 50)
    public void TestStarve() {
        c.starve();
        assertEquals(4, c.getSize());
    }

    @Test(timeout = 50)
    public void TestStarveExceed() {
        c.starve();
        c.starve();
        c.starve();
        c.starve();
        assertFalse(c.starve());
    }

}