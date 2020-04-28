package uz.uzfundit.sherzod.chapter1;

import java.util.Scanner;

public class Raise {
    public static void main(String[] args) {
        whileRaising();
        forRaising();
    }

    public static void whileRaising(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = scanner.nextInt();
        System.out.println("Enter your raise number: ");
        int b = scanner.nextInt();
        long result = 1;
        while (b>0){
            result = result * a;
            b--;
        }
        System.out.println("Result: "+result);
    }

    public static void forRaising(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = scanner.nextInt();
        System.out.println("Enter your raise number: ");
        int b = scanner.nextInt();
        int i;
        long result = 1;
        for(i=1; i<=b; i++)
            result = result * a;
        System.out.println("Result: "+result);
    }
}
