package uz.uzfundit.sherzod.chapter1;

import java.util.Scanner;

public class Raise1 {
    public static void main(String[] args) {
        int a, b, i, r=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        a = scanner.nextInt();
        System.out.println("Enter your raise number: ");
        b = scanner.nextInt();

        for(i=1; i<=b; i++)
            r = r * a;
        System.out.println("Result: "+r);
    }
}
