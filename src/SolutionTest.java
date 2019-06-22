import learn.java.oop.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionTest {
    @Test
    public void testSomething1() {
        assertEquals(true, Main.findAnswer("xxxooo"));
    }

    @Test
    public void testSomething2() {
        assertEquals(true, Main.findAnswer("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
        assertEquals(false, Main.findAnswer("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
        assertEquals(false, Main.findAnswer("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
        assertEquals(false, Main.findAnswer("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertEquals(true, Main.findAnswer("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertEquals(false, Main.findAnswer("Xxxxertr34"));
    }
}

