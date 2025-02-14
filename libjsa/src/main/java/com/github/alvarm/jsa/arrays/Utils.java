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

public class Utils {

    public static float getFloatEpsilon() {
        return Holder.FLOAT_EPSILON;
    }

    public static double getDoubleEpsilon() {
        return Holder.DOUBLE_EPSILON;
    }

    private static class Holder {
        private static final float FLOAT_EPSILON = floatEpsilon();

        private static final double DOUBLE_EPSILON = doubleEpsilon();

        private static double doubleEpsilon() {
            double epsilon = 1.0d;
            do {
                epsilon /= 2.0d;
            } while((1.0d + epsilon) > 1.0d);
            return epsilon;
        }

        private static float floatEpsilon() {
            float epsilon = 1.0f;
            do {
                epsilon /= 2.0f;
            }while ((1.0f + epsilon) > 1.0f);
            return epsilon;
        }
    }
}
