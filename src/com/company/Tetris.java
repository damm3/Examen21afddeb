package com.company;

import java.util.Scanner;

public class Tetris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int f = scanner.nextInt();
        int c = scanner.nextInt();

        int[][] t = new int[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                t[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < f; i++) {
            boolean completa = true;
            for (int j = 0; j < c; j++) {
                if (t[i][j] == 0) {
                    completa = false;
                    break;
                }
            }

            if(!completa){
                for (int j = 0; j < c; j++) {
                    System.out.print(t[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
