import java.i0.*;
import java.util.*;
import random;
public class NimGame {
    
    public int fetchComputerMove(int left) 
    {
         int computerTurn = (int) (Math.random()*2)+1;
         return computerTurn;
    }
    
    public static void main(String args[]) {
        NimGame ng = new NimGame();
        ng.play();
    }
    
    public void play() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You are playing Nim Game");
        System.out.println("Enter the number of elements to start the game");
        int elementsLeft = scan.nextInt();
        while (elementsLeft > 0) {
            int computerMove = fetchComputerMove(elementsLeft);
            System.out.println("Computer moves " + computerMove);
            elementsLeft = elementsLeft - computerMove;
            System.out.println("Now only " + elementsLeft + " elementsLeft");
            System.out.println("");
            if (elementsLeft <= 0) {
                System.out.println("***********************");
                System.out.println("Computer wins the game!");
                System.out.println("***********************");
                return ;
            }    
            System.out.println("It's your turn now: Enter (1 or 2) ");
            int personMove = scan.nextInt();
            while (personMove != 1 && personMove != 2) {
                System.out.println("Please choose 1 or 2 only");
                personMove = scan.nextInt();
            }
            elementsLeft = elementsLeft - personMove;
            System.out.println("After your move!! the number of elements left: "+elementsLeft);
            System.out.println("");
             if (elementsLeft <= 0) {
                System.out.println("*****************"); 
                System.out.println("You win the game!");
                System.out.println("*****************");
                return ;
            } 
        }
    }
}