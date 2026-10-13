package Recursion;
import java.util.Scanner;

public class Recursion2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        print(a, b);
        }


    static void print(int a, int b) {

        if (a == b){
            System.out.print(a + " "); 
            return; 
    }
        if (a < b) {
            System.out.print(a + " ");
            print(a + 1, b);

    } else {
        System.out.print(a + " ");
        print(a - 1, b);
    }
}}
