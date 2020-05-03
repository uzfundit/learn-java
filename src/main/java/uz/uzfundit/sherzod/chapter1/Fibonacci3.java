package uz.uzfundit.sherzod.chapter1;

import java.util.Scanner;

public class Fibonacci3 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Fibonacci steps upto " +num+ " : ");

        for(int i=0; i<num; i++){
            System.out.print(fib(i)+" ");
        }
    }

    public static int fib(int step){
        if(step==0){
            return 0;
        }
        else if(step==1){
            return 1;
        }
        return fib(step-2) + fib(step-1);
    }
}
