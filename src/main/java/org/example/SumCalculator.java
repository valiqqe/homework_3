package org.example;

public class SumCalculator {
    public int sum(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n should be a non-negative integer");
        }
        if (n == 0){
            throw new IllegalArgumentException("n is 0");
        }

        return n * (n + 1) / 2;
    }
}