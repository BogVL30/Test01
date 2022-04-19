package main.java;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TriangleTest {

    @Test
    public void Sq() {
        Triangle triangle = new Triangle();
        double actual = Triangle.Sq();
        double expected = 6;
        assertEquals(actual,expected);

    }
}