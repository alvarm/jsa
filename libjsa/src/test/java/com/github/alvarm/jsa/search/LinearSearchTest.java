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

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    @Test
    void searchSearchInt() {
        int[] array = RandomArrayUtils.generateRandomArray(100L, 0, 1000);
        for (int i = 0; i < array.length; i++) {
            int pos = LinearSearch.search(array, array[i]);
            if(pos != i) {
                assertEquals(array[i], array[pos]);
            }
        }
        assertEquals(-1, LinearSearch.search(array, -1));
    }

    @Test
    void testSearchLong() {
        long[] array = RandomArrayUtils.generateRandomArray(100L, 0L, 1000L);
        for (int i = 0; i < array.length; i++) {
            int pos = LinearSearch.search(array, array[i]);
            if(pos != i) {
                assertEquals(array[i], array[pos]);
            }
        }
        assertEquals(-1L, LinearSearch.search(array, -1L));
    }

    @Test
    void testSearchFloat() {
        float[] array = RandomArrayUtils.generateFloatRandomArray(100, 0, 1000);
        for (int i = 0; i < array.length; i++) {
            int pos = LinearSearch.search(array, array[i]);
            if(pos != i) {
                assertEquals(array[i], array[pos]);
            }
        }
        assertEquals(-1.0f, LinearSearch.search(array, -1.0f));
    }

    @Test
    void testSearchFloatEpsilon() {
        float[] array = RandomArrayUtils.generateFloatRandomArray(100, 0, 1000);
        float epsilon = 1e-5f;
        for (int i = 0; i < array.length; i++) {
            int pos = LinearSearch.search(array, array[i], epsilon);
            if (pos != i) {
                assertEquals(array[i], array[pos]);
            }
        }
            assertEquals(-1, LinearSearch.search(array, -1.0f, epsilon));
    }

    @Test
    void testSearchDouble() {
        double[] array = RandomArrayUtils.generateDoubleRandomArray(100L, 0, 1000);
        for (int i = 0; i < array.length; i++) {
            int pos = LinearSearch.search(array, array[i]);
            if(pos != i) {
                assertEquals(array[i], array[pos]);
                }
            }
            assertEquals(-1, LinearSearch.search(array, -1.0));
    }

    @Test
    void testSearchDoubleEpsilon() {
        double[] array = RandomArrayUtils.generateDoubleRandomArray(100L, 0, 1000);
        double epsilon = 1e-5;
        for (int i = 0; i < array.length; i++) {
            int pos = LinearSearch.search(array, array[i], epsilon);
            if(pos != i) {
                assertEquals(array[i], array[pos]);
            }
        }
        assertEquals(-1, LinearSearch.search(array, -1.0, epsilon));

    }

    @Test
    void testSearchGeneric() {
        Integer[] array = RandomArrayUtils.generateRandomBoxedArray(100L, 0, 1000);
        for (int i = 0; i < array.length; i++) {
            int pos = LinearSearch.search(array, array[i]);
            if(pos != i) {
                assertEquals(array[i], array[pos]);
            }
        }
        assertEquals(-1, LinearSearch.search(array, -1));

    }
}