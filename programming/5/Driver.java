import java.io.*;
import java.util.*;


/**
 * Time class by Day 5 Team 7
 * Christine Marra
 * collaborators: Joshua Higgins, Dave Ciolino-Volano, Greg Sciame
  GOAT - Josh!
 */

/**
   INSTRUCTIONS:
   This file contains the Driver starter code for our Time class.   
   Add code in main to test all your methods
  */
public class Driver {

  public static void testDriver(Time t){
    Time testerT = new Time(9,12,0);
    System.out.println("Testing toString...");
    System.out.println(t.toString());
    System.out.println("Testing set with 20, 22, 7...");
    t.set(20,22,7);
    System.out.println(t.toString());
    //System.out.println("Testing add with testerT (9,12,0)...");
    //t.add(testerT);
    //System.out.println(t.toString());
    //System.out.println("Testing equals against testerT...");
   // System.out.println(t.equals(testerT));
    //System.out.println("Testing compareTo against testerT...");
    //System.out.println(t.compareTo(testerT));
  }
  
  public static void main(String[] args) {

    //declare a var of appropriate type to assign an instance of Time to
    Time t1, t2;
  
    //assign var the address of a newly-apportioned Time object
    t1 = new Time();
    t2 = new Time(20, 20, 20);
    testDriver(t1);
    //testDriver(t2);
    
  }//ends main()

}//ends class