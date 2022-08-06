package com.hackerrank;

import java.util.Scanner;

public class SolutionLoop2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int prevNum = a;

            for (int pow = 0; pow < n; pow++) {
                int nextNum = calNextNum(prevNum, pow, b);
                System.out.printf("%d ", nextNum);
                prevNum = nextNum;
            }
            System.out.println();
        }
        in.close();
    }

    private static int calNextNum(int prevNum, int pow, int b) {
        return (int) (prevNum + Math.pow(2, pow) * b);
    }
}
