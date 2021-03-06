import java.io.*;
import java.util.*;

/**
 * Array2DPractice by Team Independence
 * collaborators: Seth Adams, Christine Marra, Wayne Tobias, Erwin Lara - Thank you Seth and team
****BEGINNER CODE ONLY ****
 */

/**
   INSTRUCTIONS:
   Place this file in a folder named programming/3/.
   This file contains the following completed method. Use it as a model
   to help you with the other methods:
   - buildBoard
   This file also contains stubs (empty methods) for the following
   methods (split into 3 levels):
   Basic level (complete all):
   - printBoard *
   - copyBoard *
   Intermediate level (complete Basic methods plus this method):
   - explodeSquare *
   Advanced level (complete Basic + Intermediate + these two methods):
   - explodeAllChar *
   - downString
   The routines with the * will be particularly helpful for the
   Conway's Game of Life project that you'll work on after this one.
*/


/**
   creates and returns a 2D array of size rowsxcols chars. All elements
   in the 2D array will be set to the char value.
   Ex: buildBoard(3,4,'x') will return this 2D array:
   xxxx
   xxxx
   xxxx
   xxxx
   Use this completed method as an example to help you with some of the
   other methods.
*/

public class Array2DPractice
{
  public static char[][] buildBoard( int rows, int cols, char value )
  {
    char[][] board = new char[rows][cols];                                                       
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]=value;
      }
    }
    return board;
  }

  /**
     pretty prints a 2D array of characters
     This should print the array as a grid
  */
  public static void printBoard( char[][] board )
  {
     // int rows = 3;
     // int cols = 5;
    /* YOUR AWESOME CODE HERE */
    // i represents row, j represents column
 System.out.println("The elements of the board are ");    
    for (int i = 0; i < board.length; i++) 
    {
      for (int j = 0; j < board[i].length; j++) 
      {
          System.out.print(board[i][j] + " ");
        
      }
    System.out.println("");
  }
  }

  /**
     Parameters:
     board - a 2D array of char
     row - the row you want to set
     value - the value to set all the elements in row
     Returns:
     Nothing
     Change the 2D array board so that all the elements in the
     specified row are set to value.
     Ex: Given array:
     xxxx
     xxxx
     xxxx
     xxxx
     setRow(board,2,'@') will change board to
     xxxx
     xxxx
     @@@@
     xxxx
  */
  public static void setRow( char[][] board, int row, char value )
  {
    /* YOUR AWESOME CODE HERE */
  }


  /**
     creates and returns a new 2D array of char the same size as
     original and copies all the elements
  */
  public static char[][] copyBoard( char[][] original)
  {
   
    char[][] copy = new char[original.length][original[0].length];
    for (int i=0; i<original.length; i++)
    {
      for(int j=0; j<original[i].length; j++)
      {
        copy[i][j] = original[i][j];
      }
    }
    return copy;
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     Returns:
     nothing
     A location in a 2D array can be though of as having 6
     neighbors.  In the below 2D array, the neighbors of the element
     marked Q are the numbered elements.
     oooooo
     o123oo
     o4Q5oo
     o678oo
     oooooo
     This method should change all the neighbor cells (elements) to an X
     but not change the element at row,col
     Ex:
     Given the 2D array
     QQQQQ
     QQQQQ
     QQQQQ
     QQQQQ
     explodeSquare(board,1,1) will change the array to
     XXXQQ row -1, col -1, row + 1, col + 1
iterate (traverse) through first column and will change each box to X, then shift to next row and iterate through the column and change to X **Needs to skip the selected square, and shift to row +1 and iterate the last column 
     XQXQQ
     XXXQQ
     QQQQQ
        
     Note: Make sure to correctly handle the cases when you try
     to explode an element on the edges.
  */
  //public static void explodeSquare( char[][] board, int row, int col )
  {
    // checking for values off screen (positions outside of the array)
     //for(int i = row-1; i <= row + 1;i++){
      // for(int j = col-1; j <= col + 1; j++){
      //   if ((i==0) && (j==0) && (i<board.length) && (j<board[0].length)){
       //     board[i][j]='X';
        //  }  // if it is the original square do not change
          
         //   else{          {
        //    board [i][j]= 'O';  // Exploded square
       //   } 
     //   }
      /**if (col-1 < 0){
          System.out.println("wont work A");
              }
      if (col+1>board[0].length){
          System.out.println("wont work B");
              }
      if (row==0){
          for(int i = row; i <= row + 1;i++)//loops through each row one element before, element location and one element after.
        {
         for(int j = col-1; j <= col + 1; j++)// loops through each column
          {
          if ((i==row) && (j==col))  // if it is the original square do not change
          {
            board [i][j]= 'Q'; // original entrycd p
          }
          else
          {
            board [i][j]= 'X';  // Exploded square
          } 
        };
              }
      if (row+1>board.length ){
          System.out.println("wont work D");
              }**/
      //loops through each row one element before, element location and one element after.
      {
          // loops through each column
        {
          //if ((i==row) && (j==col))  // if it is the original square do not change
          {
          //  board [i][j]= 'Q'; // original entrycd p
          }
          //else
          {
          //  board [i][j]= 'X';  // Exploded square
          } 
        }
      }
  }

  
 
//  get index of reference cell - arrayItem[r,c]

//  move up left and change [][]
// move up and change
// move left and change
// move right and change
// move down left and change
// move down and change
// move move  down/right and change
  
  
  
  
  
  
  
  
  
  
  
  /**
     This method will search through the 2D array board and it will
     explode each square that contains the char c (using the above
     definition of exploding).
     Example:
     Given the array
     qXzXq
     qXXXq
     qqqqq
     XXXqq
     XzXqq
     XXXXX
     qqqXz
     explodeAllchar(board,'z') will change board to:
  */
 //public static void explodeAllChar(char[][] board, char c)
  {
    /* YOUR AWESOME CODE HERE */
    
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     word - a String that you want to insert into the board.
     This will insert the parameter word into board in the downward
     direction. See examples below
     Example:
     Given this array
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     downString(board,1,1,"Hello") will change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxxxx
     xOxxxx
     xxxxxx
     Given the above array, downString(board,4,3,"World") will
     change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxWxx
     xOxOxx
     xxxRxx
     Note that the method has to stop at the bottom of the array.
  */
//  public static void downString( char[][] board, int row, int col, String word )
  {
    /* YOUR AWESOME CODE HERE */
  }


  public static void main( String[] args )
  {
    char[][] b = buildBoard(5,5,'$');
    printBoard (b);
    /*
      Note, you can directly set elements in the board
      using array notation like b[3][2]='z' and you
      can use array notation to also access individual
      elements
    */

    // value that is out of bounds will stop code
    char[][] c=copyBoard(b);
    printBoard(c);
    //explodeSquare(b,1,10);
    //printBoard (b);
    
  }
}