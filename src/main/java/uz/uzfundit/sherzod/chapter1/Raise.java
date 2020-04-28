package uz.uzfundit.sherzod.chapter1;

import java.util.Scanner;

public class Raise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = scanner.nextInt();
        System.out.println("Enter your raise number: ");
        int b = scanner.nextInt();

        long result = raise(a,b);
        System.out.println("Result: "+result);

    }

    private static long raise(int a, int b) {
        long t;
        if (b == 0) {
            return 1;
        } else {
            t = raise(a, b / 2);
            if (b % 2 == 0) {
                return t * t;
            } else {
                return t * t * a;
            }
        }
    }
}
