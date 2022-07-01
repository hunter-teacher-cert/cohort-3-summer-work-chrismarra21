
//Game of Nim
//Christine Marra
//David and Nicole
import java.i0.*;
import java.util.*;
import random;

public class nim
  {

   public static void main (String[] args)
    {
        int stones = 12;
        int stonesTaken;

        Scanner input = new           
        Scanner(System.in);.println
        

        while(stones>0){
          System.out.print ("there are %d stones left in the bag \n", stones);
          System.out.print ("How many stones do you want to pick?");
          stonesTaken = input.nextInt();

          stones = stones-stonesTaken;
          System.out.printf("there are %d stones remaining. \n", stones);

          if stones <3){
            stonesTaken = rand.nextInt(stones+1) +1;
          } else{
            
          }











          
        }
    }
  }