package uz.uzfundit.sherzod.chapter1;

import java.util.Scanner;

class Game {

    public static void main(String[] args) {
        winner();
        loser();
    }

    public static void winner(){
        Scanner keyboard=new Scanner(System.in);

        System.out.println("This program is a computer game. Please,\n" + "type in an integer in the range 1 ... 2147483646 :");
        long scanNumber=keyboard.nextInt();
        System.out.println("You typed in "+scanNumber);

        long twice = scanNumber * 2;
        long myNumb1 = twice + 1;
        long myNumb2 = myNumb1 + 1;

        System.out.println("My numbers are "+twice+", "+myNumb1+", and "+myNumb2+".");
        System.out.println("Sorry, you lost the game.");
        System.out.println("I have more and larger numbers.");
    }

    public static void loser(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("This program is a computer game. Please,\n" + "type in an integer in the range 1 ... 2147483646 :");
        float scanNumb=scanner.nextInt();
        System.out.println("You typed in "+scanNumb);

        float half = scanNumb / 2;
        float number1 = half / 2;
        float number2 = number1 / 2;

        System.out.println("My numbers are "+half+", "+number1+", and "+number2+".");
        System.out.println("You won the game!");
        System.out.println("I have only small numbers.");
    }
}
