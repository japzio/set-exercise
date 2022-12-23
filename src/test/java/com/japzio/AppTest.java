package com.japzio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.List;
import java.util.Set;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

    @Test
    public void test_setIntersection() {
        Set<Integer> arr1 = Set.of(1, 2, 3, 4, 5, 6);
        Set<Integer> arr2 = Set.of(2, 4, 6, 8, 10);
        Set<Integer> arr3 = Set.of(1, 4, 6, 7, 10);
        assertEquals(App.intersections(arr1, arr2, arr3), List.of(1, 2, 4, 6, 8, 10));
    }
    @Test
    public void test_setUnion() {
        Set<Integer> arr1 = Set.of(1, 2, 3, 4, 5, 6);
        Set<Integer> arr2 = Set.of(2, 4, 6, 8, 10);
        Set<Integer> arr3 = Set.of(1, 4, 6, 7, 10);
        assertEquals(App.union(arr1, arr2), Set.of(1, 2, 3, 4, 5, 6, 8, 10));
        assertEquals(App.union(arr2, arr3), Set.of(1, 2, 4, 6, 7, 8, 10));


    }
}
