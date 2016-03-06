package org.bishnu.sort.quicksort;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by karlbishnu on 2016-03-06.
 */
public class QuicksortTest {
    private static final int arraySize = 100000000;
    private long startTime;
    private long endTime;
    private int callStackNumber;

    @Before
    public void setUp(){
        startTime = 0;
        endTime = 0;
        callStackNumber = 0;
    }

    @Test
    public void testSort() throws Exception {
        int[] array = new int[arraySize];
        for(int i=0; i<array.length; i++){
            array[i] = i+1;
        }
        startTime = System.currentTimeMillis();
        callStackNumber = Quicksort.sort(array);
        endTime = System.currentTimeMillis();

        System.out.println("callStackNumber: "+ callStackNumber + "\nelapsed Time Millis: "+ (endTime-startTime));
    }

    @Test
    public void testReverseSort() throws Exception {
        int[] array = new int[arraySize];
        for(int i=array.length-1; i>=0; i--){
            array[i] = i+1;
        }
        startTime = System.currentTimeMillis();
        callStackNumber = Quicksort.sort(array);
        endTime = System.currentTimeMillis();

        System.out.println("callStackNumber: "+ callStackNumber + "\nelapsed Time Millis: "+ (endTime-startTime));
    }

    @Test
    public void testRandomSort() throws Exception {
        int[] array = new int[arraySize];
        Random random = new Random();
        for(int i=0; i<array.length; i++){
            array[i] = random.nextInt(arraySize*100);
        }
        startTime = System.currentTimeMillis();
        callStackNumber = Quicksort.sort(array);
        endTime = System.currentTimeMillis();

        System.out.println("callStackNumber: "+ callStackNumber + "\nelapsed Time Millis: "+ (endTime-startTime));
    }
}