package Recursion;

import java.util.Scanner;

public class Recursion5 {   
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printReverse(n);
        }

        static void printReverse(int n) {
            if (n == 0) {
            return;
    }
        System.out.print(n % 10 + " ");
        printReverse(n / 10);
}
}
