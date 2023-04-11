package test;

import main.BonusBinarySearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BonusBinarySearchTest {
    @Test
public void randomBinarySearch(){
        int [] mockData = {1,2,3,4,5};
        assertEquals(BonusBinarySearch.binarySearch(mockData, 3), 2);

    }

    @Test
    public void outSideArrayBinarySearch(){
        int [] mockData = {1,3,5,7,9};
        assertEquals(BonusBinarySearch.binarySearch(mockData, 11), -1);
    }
}
