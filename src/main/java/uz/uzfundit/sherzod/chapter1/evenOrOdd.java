package uz.uzfundit.sherzod.chapter1;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String a[])
    {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        x = sc.nextInt();
        if (x%2==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}
