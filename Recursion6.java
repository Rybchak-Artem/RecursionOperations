package Recursion;

import java.util.Scanner;

public class Recursion6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        }

        static void print(int n) {
            if (n == 0) {
            return;
    }
        print(n / 10);
        System.out.print(n % 10 + " ");
    }
}
