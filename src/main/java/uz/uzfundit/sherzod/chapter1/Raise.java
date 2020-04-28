package uz.uzfundit.sherzod.chapter1;

import java.util.Scanner;

public class Raise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = scanner.nextInt();
        System.out.println("Enter your raise number: ");
        int b = scanner.nextInt();
        raise(a,b);
        long result = raise(a,b);
        System.out.println("Result: "+result);
    }

    public static long raise(int a, int b){
        long result = 1;
        while (b>0){
            result = result * a;
            b--;
        }
        return result;
    }

}
