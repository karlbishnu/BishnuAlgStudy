package org.bishnu.sort.quicksort;

import java.util.Collection;

/**
 * Created by karlbishnu on 2016-03-06.
 */
public final class Quicksort {
    private static Quicksort instance = new Quicksort();
    private Quicksort(){}

    private static int maxCallStackNumber;

    public static int sort(int[] array){
        instance.quicksort(array, 0, array.length-1);
        return maxCallStackNumber;
    }

    private void quicksort(int[] array, int left, int right){
        maxCallStackNumber++;
        int index = partitioning(array, left, right);

        if(left < index -1){
            quicksort(array, left, index-1);
        }
        if(index<right){
            quicksort(array, index, right);
        }
    }

    private int partitioning(int[] array, int left, int right){
        int pivot = array[(left+right)/2];
        while(left<=right){
            while(array[left]<pivot)    left++;
            while(array[right]>pivot)   right--;

            if(left<=right){
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private void swap(int[] array, int indexA, int indexB){
        int tmp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = tmp;
    }
}
