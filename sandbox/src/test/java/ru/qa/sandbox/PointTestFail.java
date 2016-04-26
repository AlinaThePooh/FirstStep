package ru.qa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by user on 27.04.2016.
 */
public class PointTestFail {

    @Test
    public void testDistance() {

        Point point_3 = new Point (0,5);
        Point point_4 = new Point (1,3);
        Assert.assertEquals(point_3.distance(point_4), 160.0);


    }
}
