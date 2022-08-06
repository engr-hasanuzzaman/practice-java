package com.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionLoop {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 1; i <= 10; i++) {
            printMultiply(N, i);
        }
        bufferedReader.close();
    }

    private static void printMultiply(int number, int multilier) {
        System.out.printf("%d x %d = %d\n", number, multilier, number * multilier);
    }
}
