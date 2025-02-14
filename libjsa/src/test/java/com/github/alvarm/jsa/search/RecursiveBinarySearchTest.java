/*
 * MIT License
 *
 * Copyright 2025 Àlvar Mercadé Ibáñez
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the “Software”), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 *
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.github.alvarm.jsa.search;

import com.github.alvarm.jsa.arrays.RandomArrayUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveBinarySearchTest {

    @Test
    void searchSearchInt() {
        int[] array = RandomArrayUtils.generateRandomArray(100L, 0, 1000);
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int pos = RecursiveBinarySearch.search(array, array[i]);
            if(pos != i) {
                assertEquals(array[i], array[pos]);
            }
        }
        assertEquals(-1, RecursiveBinarySearch.search(array, -1));
    }

    @Test
    void testSearchLong() {
        long[] array = RandomArrayUtils.generateRandomArray(100L, 0L, 1000L);
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int pos = RecursiveBinarySearch.search(array, array[i]);
            if(pos != i) {
                assertEquals(array[i], array[pos]);
            }
        }
        assertEquals(-1L, RecursiveBinarySearch.search(array, -1L));
    }

    @Test
    void testSearchFloat() {
        float[] array = RandomArrayUtils.generateRandomArray(100, 0.0f, 1000.0f);
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int pos = RecursiveBinarySearch.search(array, array[i]);
            if(pos != i) {
                assertEquals(array[i], array[pos]);
            }
        }
        assertEquals(-1.0f, RecursiveBinarySearch.search(array, -1.0f));
    }

    @Test
    void testSearchFloatEpsilon() {
        float[] array = RandomArrayUtils.generateRandomArray(100, 0.0f, 1000.0f);
        float epsilon = 1e-5f;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int pos = RecursiveBinarySearch.search(array, array[i], epsilon);
            if (pos != i) {
                assertEquals(array[i], array[pos]);
            }
        }
        assertEquals(-1, RecursiveBinarySearch.search(array, -1.0f, epsilon));
    }

    @Test
    void testSearchDouble() {
        double[] array = RandomArrayUtils.generateRandomArray(100L, 0.0, 1000.0);
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int pos = RecursiveBinarySearch.search(array, array[i]);
            if(pos != i) {
                assertEquals(array[i], array[pos]);
            }
        }
        assertEquals(-1, RecursiveBinarySearch.search(array, -1.0));
    }

    @Test
    void testSearchDoubleEpsilon() {
        double[] array = RandomArrayUtils.generateRandomArray(100L, 0.0, 1000.0);
        double epsilon = 1e-5;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int pos = RecursiveBinarySearch.search(array, array[i], epsilon);
            if(pos != i) {
                assertEquals(array[i], array[pos]);
            }
        }
        assertEquals(-1, RecursiveBinarySearch.search(array, -1.0, epsilon));

    }

    @Test
    void testSearchGeneric() {
        Integer[] array = RandomArrayUtils.generateRandomBoxedArray(100L, 0, 1000);
        Arrays.sort(array, Comparator.naturalOrder());
        for (int i = 0; i < array.length; i++) {
            int pos = RecursiveBinarySearch.search(array, array[i]);
            if(pos != i) {
                assertEquals(array[i], array[pos]);
            }
        }
        assertEquals(-1, RecursiveBinarySearch.search(array, -1));
    }

    @Test
    void testSearchGenericComparator() {
        Integer[] array = RandomArrayUtils.generateRandomBoxedArray(100L, 0, 1000);
        Comparator<Integer> cmp = Comparator.naturalOrder();
        Arrays.sort(array, cmp);
        for (int i = 0; i < array.length; i++) {
            int pos = RecursiveBinarySearch.search(array, array[i], cmp);
            if(pos != i) {
                assertEquals(array[i], array[pos]);
            }
        }
        assertEquals(-1, RecursiveBinarySearch.search(array, -1, cmp));
    }

}