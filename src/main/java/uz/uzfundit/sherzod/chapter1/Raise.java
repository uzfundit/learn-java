package uz.uzfundit.sherzod.chapter1;

import java.util.Scanner;

public class Raise {
    public static void main(String[] args) {
        int a, b, r = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        a = scanner.nextInt();
        System.out.println("Enter your raise number: ");
        b = scanner.nextInt();

        while (b>0){
            r = r * a;
            b--;
        }
        System.out.println("Result: "+r);
    }
}
