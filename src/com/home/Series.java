package com.home;

/**
 * created by FAMILY 06.04.2019
 */

public class Series {
    public Series() {
    }

    public static long nSum(int n) {
        return (long) (n * (n + 1) / 2);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 0L;
        } else {
            long fact = 1L;

            for (int i = 1; i <= n; ++i) {
                fact *= (long) i;
            }

            return fact;
        }
    }

    public static long fibonacci(int n) {
        if (n == 0) {
            return 0L;
        } else if (n == 1) {
            return 1L;
        } else {
            long nMinus1 = 1L;
            long nMinus2 = 0L;
            long fib = 0L;

            for (int i = 1; i < n; ++i) {
                fib = nMinus2 + nMinus1;
                nMinus2 = nMinus1;
                nMinus1 = fib;
            }

            return fib;
        }
    }

}
