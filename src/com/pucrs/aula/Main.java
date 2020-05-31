package com.pucrs.aula;

public class Main {

    public static void main(String[] args) {

        int[] s = new int[]{1, 2, 3, 4, 4, 6, 6, 7, 9, 9, 13};       // 1 2   3 4 4 6 6 7  9  9   13
        int[] f = new int[]{6, 4, 13, 5, 8, 9, 7, 10, 11, 12, 14};   // 6 4 13 5 8 9 7 10 11 12  14

        // int[] x = new int[]{0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0};

        int n = 11;

        int[] x = SDMGuloso(s, f, n);

        for (int i = 0; i < n; i++) {
            System.out.print(x[i]);
        }
    }


    static int[] SDMGuloso(int[] s, int[] f, int n) {
        int[] x = new int[n];
        x[1] = 1;
        int i = 0;
        for (int k = i + 1; k < n; k++) {
            if (s[k] >= f[i]) {
                x[k] = 1;
                i = k;
            } else {
                x[k] = 0;
            }
        }
        return x;
    }
}
