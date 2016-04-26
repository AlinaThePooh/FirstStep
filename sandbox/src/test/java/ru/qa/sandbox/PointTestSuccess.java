package ru.qa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by user on 19.04.2016.
 */
public class PointTestSuccess {

    @Test
    public void testDistance_zero() {
        Point point_1 = new Point(1, 3);
        Point point_2 = new Point(1, 3);
        Assert.assertEquals(point_1.distance(point_2), 0.0);

    }

}

