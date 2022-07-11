
//Game of Nim
//Christine Marra
//Collaborators David M. and Nicole C.
// Help from Wayne Tobias

import java.io.*;
import java.util.*;


public class nim
  {

   public static void main (String[] args)
    {
        int stones = 12;
        int stonesTaken;

        Scanner rock = new Scanner(System.in);
        while(stones>0){
          System.out.print ("There are " + stones  + " stones in the bag.\n");
          System.out.print ("How many stones (1, 2, or 3) do you want to pick?");
          stonesTaken = rock.nextInt();
            if (stonesTaken >3 || stonesTaken>stones){
              System.out.println("You took too many, pick again.")
              System.out.print ("How many stones (1, 2, or 3) do you want to pick?");
              stonesTaken = rock.nextInt();
            }else{
              stonesTaken = rock.nextInt();
            }

          stones = stones-stonesTaken;
          System.out.println("You took " + stonesTaken +  " stones. \n");
          System.out.println("There are " + stones +  " stones in the bag. \n");
          if (stones==0){
            System.out.println("You took the last stone, WINNER!!");
            break;
          }
       
            if (stones >3){
              Random computerTake = new Random();
              stonesTaken = computerTake.nextInt(3) +1;
            }
              else{
                stonesTaken = stones;
              }
                  
                
            } 

          stones = stones-stonesTaken;
          System.out.println("The Computer took " + stonesTaken +  " stones. \n");
          System.out.println("There are " + stones +  " stones in the bag. \n");
          if (stones==0){
            System.out.println("The computer took the last stone, You lost.");
            break;
          }

         
        }
    }
  }