import java.util.Scanner;  
public class craps
{   
    static int currentRoll,point,numOfRounds,wins,loses;
    static boolean rolling; //true if player is rolling, false if round is finished
    
    public static void main(String[] args) //Plays entered number of rounds of craps ex:Java craps 5
    { 
        try //tries to turn string paramenter from command line in int 
        {
           numOfRounds = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e) //will run if player enter invalid number of rounds
        {    
           numOfRounds = 1;
        }
 
        wins=0;
        loses=0;
        Scanner s = new Scanner(System.in);
       
        for(int currentRound=1;currentRound<=numOfRounds;currentRound++) //game loop of each round
        {
            point=0;
            rolling=true;
            System.out.println("\nGame of Craps");
            System.out.println("Round "+currentRound+" of "+numOfRounds);
            System.out.println("Wins: "+wins+" Loses: "+loses);
            System.out.println("Press enter to Roll");
            
            while(rolling) //game loop of each roll
            {              
                s.nextLine(); //used to wait for player input before rolling
                currentRoll = shoot(2,6); 
                System.out.println(round());
            }
        }
        System.out.println("\n     Final Score");
        System.out.println("\nWins: "+wins+" Loses: "+loses);
 
    }
 
    public static String round() //returns string to update the player on how their roll did/updates game state.
    {
        if(point==0) //first roll of every new round
        {
            if(currentRoll==2||currentRoll==3||currentRoll==12)
            {
                loses++;
                rolling=false;
                return "You rolled a "+currentRoll+". That’s Craps and you Lose.";
            }
 
             if(currentRoll==7||currentRoll==11)
            {
                wins++;
                rolling=false;
                return "You rolled a "+currentRoll+". That’s a Natural and you Win!!!";
            }
 
            point=currentRoll;
            return "You rolled a "+currentRoll+". Your point is now "+currentRoll+". Roll again!";
            
        }    
 
        //every roll after the first in a round
        if(currentRoll==7)
        {
            loses++;
            rolling=false;
            return "You rolled a "+currentRoll+". That’s Craps and you Lose.";
        }
        
        if(currentRoll==point)
        {
            wins++;
            rolling=false;
            return "You rolled a "+currentRoll+". You Win!!!";
        }
 
        return "You rolled a "+currentRoll+". Roll again!";
    }
 
    public static int shoot(int numOfDice,int maxNum) //returns the sum of multiple dice rolls
    {
        int totalRoll = 0;
 
        for(int i=0;i<numOfDice;i++)
        {
            totalRoll = totalRoll + roll(maxNum);
        }
 
        return totalRoll;
    }
    
    public static int roll(int maxNum) //returns a random int between 1 - maxNum, inclusive
    {
        return ((int)(Math.random()*maxNum))+1;
    }
    
}
  



    
  