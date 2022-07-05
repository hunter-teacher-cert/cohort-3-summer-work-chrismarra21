import java.io.*;
import java.util.*;
public class methods
{
   public static void main(String[] args)
   {
       
     System.out.println(isdivisible(10,3));
     System.out.println(istriangle(4,5,6));
     System.out.println(ack(3,3));
   }

 
  public static boolean isdivisible(int m,int n )
    {
        return (m % n==0);
    }
  public static boolean istriangle(int a,int b,int c)
    {
        if((a+b<c)||(a+c<b)||(c+b<a)) 
          return false;
        else
          return true;
    }

  public static int ack(int m, int n)
    {
        if (m == 0){
          return n+1;

          }else if ((m > 0) && (n == 0)){
            return ack(m-1, 1);
          }else {     
            return ack(m-1, ack(m, n-1));
        }    

       }




  
}



