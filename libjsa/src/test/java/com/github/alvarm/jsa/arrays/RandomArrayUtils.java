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

package com.github.alvarm.jsa.arrays;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomArrayUtils {

    private static final RandomGenerator rng = RandomGeneratorFactory.of("Xoroshiro128PlusPlus").create();

    public static int[] generateRandomArray(long size, int lowerLimit, int upperLimit) {
        return rng.ints(size, lowerLimit, upperLimit).toArray();
    }

    public static long[] generateRandomArray(long size, long lowerLimit, long upperLimit) {
        return rng.longs(size, lowerLimit, upperLimit).toArray();
    }

    public static double[] generateRandomArray(long size, double lowerLimit, double upperLimit) {
        return rng.doubles(size, lowerLimit, upperLimit).toArray();
    }

    public static float[] generateRandomArray(int size, float lowerLimit, float upperLimit) {
        float[] array = new float[size];
        for (int i = 0; i < size; i++) {
            array[i] = rng.nextFloat(lowerLimit, upperLimit);
        }
        return array;
    }

    public static Integer[] generateRandomBoxedArray(long size, int lowerLimit, int upperLimit) {
        return rng.ints(size, lowerLimit, upperLimit).boxed().toArray(Integer[]::new);
    }
}
