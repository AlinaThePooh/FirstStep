package ru.qa.sandbox;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by user on 19.04.2016.
 */
public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 26.0);
    }
}
