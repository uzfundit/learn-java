package uz.uzfundit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello, please enter yor name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(String.format("Hello %s, welcome to the JAVA world!", name));
    }
}
