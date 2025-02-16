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

public class RecursiveBinarySearch {
    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the recursive implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.
     * @param array A sorted integer array.
     * @param target The integer target to search for.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     */
    public static int search(int[] array, int target) {
        return search(array, target, 0, array.length - 1);
    }

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the recursive implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.
     * @param array A sorted array.
     * @param target The target to search for.
     * @param start The (inclusive) starting position for searching.
     * @param end The (exclusive) ending position for searching.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     */
    private static int search(int[] array, int target, int start, int end) {
        if (start > end) {
            return ~start;//return -1;
        }
        final int middle = (start + end) >> 1;
        final int midVal = array[middle];
        if(target < midVal) {
            return search(array, target, start, middle - 1);
        } else if (target > midVal) {
            return search(array, target, middle + 1, end);
        } else {
            return middle;
        }
    }

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the recursive implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.
     * @param array A sorted array.
     * @param target The target to search for.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     */
    public static int search(long[] array, long target) {
        return search(array, target, 0, array.length - 1);
    }

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the recursive implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.
     * @param array A sorted array.
     * @param target The target to search for.
     * @param start The (inclusive) starting position for searching.
     * @param end The (exclusive) ending position for searching.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     */
    private static int search(long[] array, long target, int start, int end) {
        if (start > end) {
            return ~start;
        }
        final int middle = (start + end) >> 1;
        final long midVal = array[middle];
        if (target < midVal) {
            return search(array, target, start, middle - 1);
        } else if (target > midVal) {
            return search(array, target, middle + 1, end);
        } else {
            return middle;
        }
    }

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the recursive implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.
     * @param array A sorted array.
     * @param target The target to search for.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     */
    public static int search(float[] array, float target) {
        return search(array, target, 0, array.length - 1, Utils.getFloatEpsilon());
    }

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the recursive implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.
     * @param array A sorted array.
     * @param target The target to search for.
     * @param epsilon The threshold to admit if two numbers are equal.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     */
    public static int search(float[] array, float target, float epsilon) {
        return search(array, target, 0, array.length - 1, epsilon);
    }

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the recursive implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.
     * @param array A sorted array.
     * @param target The target to search for.
     * @param start The (inclusive) starting position for searching.
     * @param end The (exclusive) ending position for searching.
     * @param epsilon The threshold to admit if two numbers are equal.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     */
    private static int search(float[] array, float target, int start, int end, float epsilon) {
        if (start > end) {
            return ~start;
        }
        final int middle = (start + end) >> 1;
        final float midVal = array[middle];
        boolean isEquals = Math.abs(target - midVal) < epsilon;
        if(!isEquals) {
            if(target < midVal) {
                return search(array, target, start, middle - 1, epsilon);
            } else {
                return search(array, target, middle + 1, end, epsilon);
            }
        } else {
            return middle;
        }
    }

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the recursive implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.
     * @param array A sorted array.
     * @param target The target to search for.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     */
    public static int search(double[] array, double target) {
        return search(array, target, 0, array.length - 1, Utils.getDoubleEpsilon());
    }

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the recursive implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.
     * @param array A sorted array.
     * @param target The target to search for.
     * @param epsilon The threshold to admit if two numbers are equal.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     */
    public static int search(double[] array, double target, double epsilon) {
        return search(array, target, 0, array.length - 1, epsilon);
    }

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the recursive implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.
     * @param array A sorted array.
     * @param target The target to search for.
     * @param start The (inclusive) starting position for searching.
     * @param end The (exclusive) ending position for searching.
     * @param epsilon The threshold to admit if two numbers are equal.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     */
    private static int search(double[] array, double target, int start, int end, double epsilon) {
        if (start > end) {
            return ~start;
        }
        final int middle = (start + end) >> 1;
        final double midVal = array[middle];
        boolean isEquals = Math.abs(target - midVal) < epsilon;
        if (!isEquals) {
            if(target < midVal) {
                return search(array, target, start, middle - 1, epsilon);
            } else {
                return search(array, target, middle + 1, end, epsilon);
            }
        } else {
            return middle;
        }
    }

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the recursive implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.
     * @param <E> The type for the array elements.
     * @param array A sorted array.
     * @param target The target to search for.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     * @see Comparable
     */
    public static <E extends Comparable<E>> int search(E[] array, E target) {
        return search(array, target, 0, array.length - 1);
    }

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the recursive implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.
     * @param <E> The type for the array elements.
     * @param array A sorted array.
     * @param target The target to search for.
     * @param start The (inclusive) starting position for searching.
     * @param end The (exclusive) ending position for searching.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     * @see Comparable
     */
    private static <E extends Comparable<E>> int search(E[] array, E target, int start, int end) {
        if (start > end) {
            return ~start;
        }
        final int middle = (start + end) >> 1;
        final int compare = target.compareTo(array[middle]);
        if(compare < 0) {
            return search(array, target, start, middle - 1);
        } else if (compare > 0)  {
            return search(array, target, middle + 1, end);
        } else {
            return middle;
        }
    }

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the recursive implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.
     * @param <E> The type for the array elements.
     * @param array A sorted array.
     * @param target The target to search for.
     * @param comparator The comparator the sorted array follows.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     * @see Comparator
     */
    public static <E> int search(E[] array, E target, Comparator<E> comparator) {
        return search(array, target, 0, array.length - 1, comparator);
    }

    /**
     * Search a number into a sorted array using the Binary Search algorithm.<br>
     * This is the recursive implementation.<br>
     * The computational cost for this algorithm is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * The memory cost for this implementation is <code>O(log<sub>2</sub>(n)</code> with
     * <i>n</i> being <code>array.length</code>.
     * @param <E> The type for the array elements.
     * @param array A sorted array.
     * @param target The target to search for.
     * @param start The (inclusive) starting position for searching.
     * @param end The (exclusive) ending position for searching.
     * @param comparator The comparator the sorted array follows.
     * @return <i>-1</i> if {@code target} is not present in {@code array}.<br>
     * Otherwise, returns its position in the array.
     * @since 1.0
     * @see Comparator
     */
    private static <E> int search(E[] array, E target, int start, int end, Comparator<E> comparator) {
        if (start > end) {
            return ~start;
        }
        final int middle = (start + end) >> 1;
        final int compare = comparator.compare(target, array[middle]);
        if(compare < 0) {
            return search(array, target, start, middle - 1, comparator);
        } else if (compare > 0) {
            return search(array, target, middle + 1, end, comparator);
        } else {
            return middle;
        }
    }
}
