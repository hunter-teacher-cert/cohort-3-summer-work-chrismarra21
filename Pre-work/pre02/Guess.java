import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Guess {

    public static void main(String[] args) {
        int input;   
        Scanner g = new Scanner(System.in);

       
        // pick a random number
        Random randNum = new Random();
        int guessNum = randNum.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100; including both.  Can you guess wht it is?");
        input = g.nextInt();
        
        System.out.println("Your guess was:" + input);
        System.out.println("I'm thinking of the number "+guessNum);
        System.out.println("You were off by " + (guessNum-input));
    }
}