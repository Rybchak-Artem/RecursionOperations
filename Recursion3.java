package Recursion;
import java.util.Scanner;

public class Recursion3 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPow(n)){
            System.out.println("YES");
        } else {
            System.out.println("No");
        }
        }

    static boolean isPow(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        return isPow(n / 2);
}}