package com.company;

public class task4 {

    public static void main(String[] args) {
        int[][] score = {{10, 11, 12, 13}, {20, 21, 22, 23}, {30, 31, 32, 33}};
        int[] result = new int[3];
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum = sum + score[i][j];
                result[i] = sum;
                System.out.println(result[i]);

            }
        }
    }
}


