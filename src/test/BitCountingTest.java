package test;

import main.BitCounting;
import org.testng.Assert;

import java.util.Arrays;

import static org.testng.Assert.*;

public class BitCountingTest {

    @org.testng.annotations.Test
    public void testCountBits() {
        assertEquals(5, BitCounting.countBits(1234));
        assertEquals(1, BitCounting.countBits(4));
        assertEquals(3, BitCounting.countBits(7));
        assertEquals(2, BitCounting.countBits(9));
        assertEquals(2, BitCounting.countBits(10));
    }

    @org.testng.annotations.Test
    public void testIntToBinary() {
        assertEquals(BitCounting.intToBinary(1234), Arrays.asList(1,0,0,1,1,0,1,0,0,1,0));
        assertEquals(BitCounting.intToBinary(17), Arrays.asList(1,0,0,0,1));
    }
}