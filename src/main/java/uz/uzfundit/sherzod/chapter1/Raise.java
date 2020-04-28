package uz.uzfundit.sherzod.chapter1;

import java.util.Scanner;

public class Raise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = scanner.nextInt();
        System.out.println("Enter your raise number: ");
        int b = scanner.nextInt();
        int r = 1;
        while (b>0){
            r = r * a;
            b--;
        }
        System.out.println("Result: "+r);
    }
}
