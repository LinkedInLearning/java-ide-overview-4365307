package org.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double square(double a) {
        return a * a;
    }

    public static int[] demoStream() {
        return IntStream.of(22, 18, 30, 60)
                .flatMap(Calculator::primeFactors)
                .distinct()
                .sorted()
                .toArray();
    }

    private static IntStream primeFactors(int n) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors.stream()
                .mapToInt(Integer::intValue);
    }

}
