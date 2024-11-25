package org.example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class AppTest {
    static calculator c;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        c=new calculator();
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        c=null;
    }


    @Test
    public void testAddizione() {

        assertEquals(calculator.add(2, 3), 5);
        assertEquals(calculator.add(-2, -3), -5);
        assertEquals(calculator.add(0, 5), 5);
        assertEquals(calculator.add(2, 0), 2);
        assertEquals(calculator.add(0, 0), 0);
        assertEquals(calculator.add(1000, 2000), 3000);
        assertEquals(calculator.add(-1000, 2000), 1000);
        assertEquals(calculator.add(2, 2), 4);
        assertEquals(calculator.add(-1, -2), -3);

    }
    @Test
    public void testSubtract() {
        assertEquals(calculator.subtract(10, 3), 7);
        assertEquals(calculator.subtract(-10, -3), -7);
        assertEquals(calculator.subtract(5, 5), 0);
        assertEquals(calculator.subtract(0, 5), -5);
        assertEquals(calculator.subtract(0, 0), 0);
        assertEquals(calculator.subtract(1000, 500), 500);
        assertEquals(calculator.subtract(-1000, 500), -1500);
     
    }
}
