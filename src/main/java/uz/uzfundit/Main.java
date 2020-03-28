package uz.uzfundit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello, please enter yor name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(String.format("Hello %s, welcome to the JAVA world!", name));
        System.out.println("Here is the BizzBuzz game:");
        bizzBuzz();
    }

    private static void bizzBuzz(){
        for(int i = 1; i <= 100; i++){
            if(i % 15 == 0){
                System.out.println("BizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Bizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
