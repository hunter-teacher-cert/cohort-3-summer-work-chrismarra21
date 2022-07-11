import java.io.*;
import java.util.*;

public class SuperArrayDriver
{
  public static void main( String[] args )
  {
    
    System.out.println("Testing default constructor.");
    SuperArray sa = new SuperArray();
    // SuperArray is a template; we can have several arrays made from this template. We can add different methods to different arrays.
    SuperArray superArray2 = new SuperArray();
    SuperArray superArray3 = new SuperArray();
    System.out.println("Testing empty print:");
    System.out.println(sa);
    
    System.out.println("Testing isEmpty (should be true)");
    System.out.println(sa.isEmpty());

    System.out.println("Testing get (should retrieve an element)");
    System.out.println(sa.get(4));


    System.out.println("Testing add (we want to add an element)");
    sa.add(1);
    sa.add(2);
    sa.add(3);
    sa.add(4);
    sa.add(5);
    sa.add(6);
    sa.add(7);
    sa.add(8);
    sa.add(9);
    sa.add(10);
    System.out.println(sa);

    System.out.println("Testing get (should retrieve an element)");
    System.out.println(sa.get(0));
     System.out.println("\nTesting remove at 0, 5, and 15 (end)");
    sa.remove(0);
    System.out.println(sa);
    sa.remove(5);
    System.out.println(sa);
    sa.add(10);
    sa.add(10);
    //sa.grow();
    //System.out.println(sa);
    sa.add(3);
    System.out.println(sa);
    
    
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // -----------------------------------------------------------
    // YOUR HOMEGROWN/HOUSEMADE/ROLL-YOUR-OWN TEST METHODS HERE...
    // -----------------------------------------------------------
    //precondition: newly-instantiated SuperArray of default capacity
    System.out.println("Testing overfill (calling grow() in add)");
    for (int i=0; i<15; i++) {
      sa.add(i);
    }//for i
    System.out.println(sa);
    System.out.println(sa.isEmpty());
    System.out.println("\nTesting add at index 5, 0 and 17(end)");
    sa.add(5, 100);
    System.out.println(sa);
    sa.add(0, 100);
    System.out.println(sa);
    sa.add(17, 100);
    System.out.println(sa);
    System.out.println("\nTesting remove at 0, 5, and 15 (end)");
    sa.remove(0);
    System.out.println(sa);
    sa.remove(5);
    System.out.println(sa);
    sa.remove(15);
    System.out.println(sa);
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//main

}//class SuperArrayDriver