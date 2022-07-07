/**
 * nth Fibonacci number generator by Day 5 Team 7
 * Christine Marra
 * collaborators: Joshua Higgins, Dave Ciolino-Volano, Greg Sciame
    BIG THANKS to Greg and Josh
 */

public class Fib
{

  //your implementation of fib(n) here
  public static int fib(int i){
    if(i > 1){
      return fib(i-1)+fib(i-2);
    }else{
      return i;
    }
  }


  public static void main( String[] args )
  {
    System.out.println( fib(0) ); // -> 0
    System.out.println( fib(1) ); // -> 1
    System.out.println( fib(2) ); // -> 1
    System.out.println( fib(3) ); // -> 2
    System.out.println( fib(4) ); // -> 3
    System.out.println( fib(5) ); // -> 5
    //now go big: note to self - limit is 47
    System.out.println("Skipped ahead....");
    System.out.println( fib(15) ); // -> 55
    System.out.println( fib(25) ); // -> 6765
    System.out.println( fib(35) ); // -> 102334155
  }//end main()

}//end class Fib