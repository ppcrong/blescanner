package com.ppcrong.blescanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.Calendar;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * MiscUtilsTest
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 26)
public class MiscUtilsTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getIntToBitArrayString() throws Exception {

        int expected;
        String result;

        expected = 0b11111111;
        result = MiscUtils.getIntToBitArrayString(expected);
        assertEquals(true, "11111111".equalsIgnoreCase(result));

        expected = 0;
        result = MiscUtils.getIntToBitArrayString(expected);
        assertEquals(true, "00000000".equalsIgnoreCase(result));

        expected = 0b10101010;
        result = MiscUtils.getIntToBitArrayString(expected);
        assertEquals(true, "10101010".equalsIgnoreCase(result));

        expected = 0b01010101;
        result = MiscUtils.getIntToBitArrayString(expected);
        assertEquals(true, "01010101".equalsIgnoreCase(result));
    }

    @Test
    public void test() throws Exception {

    }
}