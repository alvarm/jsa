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

import com.github.alvarm.jsa.arrays.Utils;

import java.util.Comparator;

/**
 * Class that implements the Binary Search algorithm using an iterative approach.<br>
 * This algorithm assumes that the array is sorted.<br>
 * The algorithm works by splitting the array in two equally sized parts
 * and checks if the target value belongs ot one part or the other.<br>
 * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n))</code> with
 * <i>n</i> being <code>array.length</code>.<br>
 * The memory cost for this implementation is <code>O(1)</code>.
 * @since 1.0
 * @author alvarm
 */
public class IterativeBinarySearch {

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the iterative implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n))</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(1)</code>.
     * @param array A sorted integer array.
     * @param target The target to search for.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     */
    public static int search(int[] array, int target) {
        int start = 0;
        int end = array.length;
        int middle;
        while(start < end) {
            middle = (start + end) / 2;
            if( target == array[middle]) {
                return middle;
            } else if(target < array[middle]) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the iterative implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n))</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(1)</code>.
     * @param array A sorted integer array.
     * @param target The target to search for.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     */
    public static int search(long[] array, long target) {
        int start = 0;
        int end = array.length;
        int middle;
        while(start < end) {
            middle = (start + end) / 2;
            if( target == array[middle]) {
                return middle;
            } else if(target < array[middle]) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the iterative implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n))</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(1)</code>.
     * @param array A sorted array.
     * @param target The target to search for.
     * @param epsilon The precision threshold to admit if two numbers are equal.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     */
    public static int search(float[] array, float target, float epsilon) {
        int start = 0;
        int end = array.length;
        int middle;
        while(start < end) {
            middle = (start + end) / 2;
            if( Math.abs(target - array[middle]) < epsilon) {
                return middle;
            } else if(target < array[middle]) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the iterative implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n))</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(1)</code>.
     * @param array A sorted array.
     * @param target The target to search for.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     */
    public static int search(float[] array, float target) {
        return search(array, target, Utils.getFloatEpsilon());
    }

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the iterative implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n))</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(1)</code>.
     * @param array A sorted array.
     * @param target The target to search for.
     * @param epsilon The precision threshold to admit if two numbers are equal.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     */
    public static int search(double[] array, double target, double epsilon) {
        int start = 0;
        int end = array.length;
        int middle;
        while(start < end) {
            middle = (start + end) / 2;
            if( Math.abs(target - array[middle]) < epsilon) {
                return middle;
            } else if(target < array[middle]) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the iterative implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n))</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(1)</code>.
     * @param array A sorted array.
     * @param target The target to search for.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     */
    public static int search(double[] array, double target) {
        return search(array, target, Utils.getDoubleEpsilon());
    }

    /**
     * Search an element into a sorted array using the Binary Search algorithm.<br>
     * This is the iterative implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n))</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(1)</code>.
     * @param <E> The type for the elements in the array.
     * @param array A sorted array.
     * @param target The target to search for.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     * @see Comparable
     */
    public static <E extends Comparable<E>> int search(E[] array, E target) {
        int start = 0;
        int end = array.length;
        int middle;
        while(start < end) {
            middle = (start + end) / 2;
            int compare = target.compareTo(array[middle]);
            if(compare == 0) {
                return middle;
            } else if(compare < 0) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the iterative implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n))</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(1)</code>.
     * @param <E> The type for the elements in the array.
     * @param array A sorted array.
     * @param target The target to search for.
     * @param comparator A comparator that the array follows.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     * @see Comparator
     */
    public static <E> int search(E[] array, E target, Comparator<E> comparator) {
        int start = 0;
        int end = array.length;
        int middle;
        while(start < end) {
            middle = (start + end) / 2;
            int compare = comparator.compare(target, array[middle]);
            if(compare == 0) {
                return middle;
            } else if(compare < 0) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

}
