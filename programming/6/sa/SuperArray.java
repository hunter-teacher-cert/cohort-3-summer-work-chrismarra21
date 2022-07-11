/**
 * SuperArray from Day 6 and 7 Room 15
 * Christine Marra
 * GOAT Collaborators: Amanda Lee and Marisa Shulman
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */
    
  //instance variables
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    //initialize underlying/inner storage of specified capacity
    /* YOUR SIMPLE+SMART CODE HERE */
    //initialize instance variables
    numberElements = 0;
    data = new int [size];
    
    /* YOUR SIMPLE+SMART CODE HERE */

  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //in it underlying/inner storage of capacity 10
        /* YOUR SIMPLE+SMART CODE HERE */
    numberElements = 0;
    data = new int [10];
    //init instance vars
        /* YOUR SIMPLE+SMART CODE HERE */
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add (int value )
  {
    // test to see if we need to grow, then grow
    if (numberElements == data.length){
      grow();
    }
    /**
       IMPORTANT:
       This is the first code that should run in this method
       but the last code you should write.
       Implement the rest of this method first,
       then only write this section once the rest is tested and working.
    */
    /* YOUR SIMPLE+SMART CODE HERE */

    // add item
    /* YOUR SIMPLE+SMART CODE HERE */
    data [numberElements] = value;

    // increment numberElements
    /* YOUR SIMPLE+SMART CODE HERE */
    numberElements ++ ;

  }//end add()


  public boolean isEmpty()
   {
    //return whether this SuperArray instance is empty
     /* YOUR SIMPLE+SMART CODE HERE */
    if (numberElements == 0){
      return true;
     }
    else{
      return false;
     }
   }


 public int get(int index)
   {
   /* YOUR SIMPLE+SMART CODE HERE */
    return data[index];
    //return item at index
     
   }

  public String toString()
  {
    //return stringified version of this Object
    /* YOUR SIMPLE+SMART CODE HERE */
    String output = "";
    for (int i = 0; i < data.length; i++){
       output+= data[i]+ " "; 
    }
    return output;
  }//end toString()


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()

  // sa.remove(2)
  public void remove(int index)
  {
  // shift items down to remove the item at index
    /* YOUR SIMPLE+SMART CODE HERE */
    for (int i = index; i<numberElements-2; i++){
          data[i] = data[i+1];
      // current data = next data!
    }
    
    // subtract fom numElements;
    /* YOUR SIMPLE+SMART CODE HERE */
    data[numberElements-1] = 0;
    numberElements --;
  }


  public void add(int index, int value)
  {
  //data[index] = value;
  // see if there's enough room
    /* MARISA'S SMART CODE HERE */
    if (numberElements < data.length){
      for (int i= data.length-1; i>=index; i--){
        if (i != index){
          data[i] = data[i-1];
        }
        else{
          data[i] = value;
        }
      }
      numberElements += 1;
  

    // shift elements toward the end of the array
    /* YOUR SIMPLE+SMART CODE HERE */

    // insert new element
    /* YOUR SIMPLE+SMART CODE HERE */

    // increment numElements
    /* YOUR SIMPLE+SMART CODE HERE */
  }
  }

   private void grow()
   {
    // create a new array with ONE extra space
    // YOUR SIMPLE+SMART CODE HERE 
    int[] growData = new int[data.length +1];
   
    // Q: How did you decide how much to increase capacity by? 

    // CODE HERE TO - copy over all the elements from the old array to the new one 
     for (int i = 0; i < data.length; i++){
       growData[i] = data[i];
     }
    
    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    /* YOUR SIMPLE+SMART CODE HERE */
     data = growData;
  }//end grow()

}//end class