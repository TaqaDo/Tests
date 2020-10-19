package com.example.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MathTest {
    Math math;

    @Before
    public void setUp (){
        System.out.println("Before Test");
        math = new Math();
    }

    @Test
    public void swap(){
        System.out.println("swapTest");
        assertEquals("Hello World", math.swap("World", " Hello"));
    }
    @Test
    public void reverse (){
        System.out.println("swapTest");
        assertEquals("dlroW", math.reverse("World"));
    }


//    @Test
//    public void addTest(){
//        System.out.println("addTest");
//        assertEquals(4, math.add(1,3));
//    }
//    @Test
//    public void minusTest(){
//        System.out.println("minunsTest");
//        assertEquals(1, math.minus(3,2));
//    }
//    @Test
//    public void multiplyTest(){
//        System.out.println("multiplyTest");
//        assertEquals(6, math.multiply(3,2));
//    }
//    @Test
//    public void divideTest(){
//        System.out.println("divideTest");
//        assertEquals(new Double(2), math.divide(4d,2d));
//        assertEquals(new Double(3d), math.divide(10d,4d));
//        assertEquals(new Double(2d), math.divide(14.4d,6d));
//        assertEquals(null , math.divide(0d,2d));
//    }
//    @Test
//    public void testMock(){
//        System.out.println("MockTest");
//        /** Мокаем обьект || имитируем полноценный класс без какой либо реализации */
//        Iterator iterator = mock(Iterator.class);
//        /** задаем поведение моку */
//        when(iterator.next()).thenReturn("Next");
//        /** раболта с моком */
//        String result = iterator.next().toString();
//        assertEquals("Next", result);
//    }

    @After
    public void clearUp() {
        System.out.println("clearUp");
        math = null;
    }

}
