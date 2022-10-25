package com.platzi.javatest.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringUtilTest {
    StringUtil util;
    @Before
    public void StringUtilTestInit(){
        util = new StringUtil();
    }

    @Test
    public void testRepeatOnce(){
        Assert.assertEquals("hola", util.repeat("hola", 1));
    }

    @Test
    public void testRepeatMultiple(){
        Assert.assertEquals("holaholahola", util.repeat("hola", 3));
    }

    @Test
    public void testRepeatZeroTimes(){
        Assert.assertEquals("", util.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRepeatNegativeTimes(){
        Assert.assertEquals("hola", util.repeat("hola", -1));
    }


}