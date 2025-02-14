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

public class LinearSearch {
    /**
     * Search sequentially for a target inside an array.<br>
     * Computational cost for this method is <code>O(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * Memory cost for this method is <code>O(1)</code>.
     * @param array An array.
     * @param target The target to search for.
     * @return <i>-1</i> if <code>target</code> is not present in <code>array</code>.<br>
     * Otherwise, it returns its first position in the array.
     * @since 1.0
     */
    public static int search(int[] array, int target) {
        int i = 0;
        while(i < array.length && array[i] != target){
            i += 1;
        }
        return (i >= array.length) ? -1 : i;
    }

    /**
     * Search sequentially for a target inside an array.<br>
     * Computational cost for this method is <code>O(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * Memory cost for this method is <code>O(1)</code>.
     * @param array An array.
     * @param target The target to search for.
     * @return <i>-1</i> if <code>target</code> is not present in <code>array</code>.<br>
     * Otherwise, it returns its first position in the array.
     * @since 1.0
     */
    public static int search(long[] array, long target) {
        int i = 0;
        while(i < array.length && array[i] != target){
            i += 1;
        }
        return (i >= array.length) ? -1 : i;
    }

    /**
     * Search sequentially for a target inside an array.<br>
     * Computational cost for this method is <code>O(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * Memory cost for this method is <code>O(1)</code>.
     * @param array An array.
     * @param target The target to search for.
     * @param epsilon The precision threshold where we can say two numbers are equal.
     * @return <i>-1</i> if <code>target</code> is not present in <code>array</code>.<br>
     * Otherwise, it returns its first position in the array.
     * @since 1.0
     */
    public static int search(float[] array, float target, float epsilon) {
        int i = 0;
        while(i < array.length && Math.abs(target - array[i]) > epsilon){
            i += 1;
        }
        return (i >= array.length) ? -1 : i;
    }

    /**
     * Search sequentially for a target inside an array.<br>
     * Computational cost for this method is <code>O(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * Memory cost for this method is <code>O(1)</code>.
     * @param array An array.
     * @param target The target to search for.
     * @return <i>-1</i> if <code>target</code> is not present in <code>array</code>.<br>
     * Otherwise, it returns its first position in the array.
     * @since 1.0
     */
    public static int search(float[] array, float target) {
        return search(array, target, Utils.getFloatEpsilon());
    }

    /**
     * Search sequentially for a target inside an array.<br>
     * Computational cost for this method is <code>O(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * Memory cost for this method is <code>O(1)</code>.
     * @param array An array.
     * @param target The target to search for.
     * @param epsilon The precision threshold where we can say two numbers are equal.
     * @return <i>-1</i> if <code>target</code> is not present in <code>array</code>.<br>
     * Otherwise, it returns its first position in the array.
     * @since 1.0
     */
    public static int search(double[] array, double target, double epsilon) {
        int i = 0;
        while(i < array.length && Math.abs(target - array[i]) > epsilon){
            i += 1;
        }
        return (i >= array.length) ? -1 : i;
    }

    /**
     * Search sequentially for a target inside an array.<br>
     * Computational cost for this method is <code>O(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * Memory cost for this method is <code>O(1)</code>.
     * @param array An array.
     * @param target The target to search for.
     * @return <i>-1</i> if <code>target</code> is not present in <code>array</code>.<br>
     * Otherwise, it returns its first position in the array.
     * @since 1.0
     */
    public static int search(double[] array, double target) {
        return search(array, target, Utils.getDoubleEpsilon());
    }

    /**
     * Search sequentially for a target inside an array.<br>
     * Computational cost for this method is <code>O(n)</code> with
     * <i>n</i> being <code>array.length</code>.<br>
     * Memory cost for this method is <code>O(1)</code>.
     * @param <E> The element type.
     * @param array An array.
     * @param target The target to search for.
     * @return <i>-1</i> if <code>target</code> is not present in <code>array</code>.<br>
     * Otherwise, it returns its first position in the array.
     * @see Object#equals(Object)
     * @since 1.0
     */
    public static <E> int search(E[] array, E target) {
        int i = 0;
        while(i < array.length && !target.equals(array[i])) {
            i += 1;
        }
        return (i >= array.length) ? -1 : i;
    }
}
