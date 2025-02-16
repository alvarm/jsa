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

class IterativeBinarySearchTest {

    @Test
    void searchInt() {
        final int start = 0;
        final int end = 1000;
        int[] array = RandomArrayUtils.generateRandomArray(100L, start, end);
        Arrays.sort(array);
        for (int i = start; i < end; i++) {
            int pos = IterativeBinarySearch.search(array, i);
            int javaPos = Arrays.binarySearch(array, i);
            assertEquals(javaPos, pos);
        }
    }

    @Test
    void searchLong() {
        final long start = 0L;
        final long end = 1000L;
        long[] array = RandomArrayUtils.generateRandomArray(100L, start, end);
        Arrays.sort(array);
        for (long i = start; i < end; i++) {
            int pos = IterativeBinarySearch.search(array, i);
            int javaPos = Arrays.binarySearch(array, i);
            assertEquals(javaPos, pos);
        }
    }

    @Test
    void searchFloat() {
        float[] array = RandomArrayUtils.generateFloatRandomArray(100, 0, 1000);
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int pos = IterativeBinarySearch.search(array, array[i]);
            if(pos != i) {
                assertEquals(array[i], array[pos]);
            }
        }
        assertEquals(-1.0f, IterativeBinarySearch.search(array, -1.0f));
    }

    @Test
    void searchFloatEpsilon() {
        float[] array = RandomArrayUtils.generateFloatRandomArray(100, 0, 1000);
        float epsilon = 1e-5f;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int pos = IterativeBinarySearch.search(array, array[i], epsilon);
            if (pos != i) {
                assertEquals(array[i], array[pos]);
            }
        }
        assertEquals(-1, IterativeBinarySearch.search(array, -1.0f, epsilon));
    }

    @Test
    void searchDouble() {
        double[] array = RandomArrayUtils.generateDoubleRandomArray(100L, 0, 1000);
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int pos = IterativeBinarySearch.search(array, array[i]);
            if(pos != i) {
                assertEquals(array[i], array[pos]);
            }
        }
        assertEquals(-1, IterativeBinarySearch.search(array, -1.0));
    }

    @Test
    void searchDoubleEpsilon() {
        double[] array = RandomArrayUtils.generateDoubleRandomArray(100L, 0, 1000);
        double epsilon = 1e-5;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int pos = IterativeBinarySearch.search(array, array[i], epsilon);
            if(pos != i) {
                assertEquals(array[i], array[pos]);
            }
        }
        assertEquals(-1, IterativeBinarySearch.search(array, -1.0, epsilon));

    }

    @Test
    void searchGeneric() {
        final int start = 0;
        final int end = 1000;
        Integer[] array = RandomArrayUtils.generateRandomBoxedArray(100L, start, end);
        Arrays.sort(array, Comparator.naturalOrder());
        for (int i = start; i < end; i++) {
            int pos = IterativeBinarySearch.search(array, i);
            int javaPos = Arrays.binarySearch(array, i, Comparator.naturalOrder());
            assertEquals(javaPos, pos);
        }
    }

    @Test
    void searchGenericComparator() {
        final int start = 0;
        final int end = 1000;
        Integer[] array = RandomArrayUtils.generateRandomBoxedArray(100L, start, end);
        Comparator<Integer> cmp = Comparator.naturalOrder();
        Arrays.sort(array, cmp);
        for (int i = start; i < end; i++) {
            int pos = IterativeBinarySearch.search(array, i, cmp);
            int javaPos = Arrays.binarySearch(array, i, cmp);
            assertEquals(javaPos, pos);
        }
    }
}