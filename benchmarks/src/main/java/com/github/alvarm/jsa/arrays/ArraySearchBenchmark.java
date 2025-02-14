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

import com.github.alvarm.jsa.search.IterativeBinarySearch;
import com.github.alvarm.jsa.search.LinearSearch;
import com.github.alvarm.jsa.search.RecursiveBinarySearch;
import org.openjdk.jmh.annotations.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;


@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Thread)
public class ArraySearchBenchmark {

    private int[] array;
    private int target;

    @Setup(Level.Iteration)
    public void setUp() {
        RandomGenerator rng = RandomGeneratorFactory.of("Xoroshiro128PlusPlus").create();
        array = rng.ints(10_000_000L).toArray();
        target = rng.nextInt();
        Arrays.sort(array);
    }

    @Benchmark
    public int linearSearch() {
        return LinearSearch.search(array, target);
    }

    @Benchmark
    public int recursiveBinarySearch() {
        return RecursiveBinarySearch.search(array, target);
    }

    @Benchmark
    public int iterativeBinarySearch() {
        return IterativeBinarySearch.search(array, target);
    }

    @Benchmark
    public int javaSearch() {
        return Arrays.binarySearch(array, target);
    }
}
