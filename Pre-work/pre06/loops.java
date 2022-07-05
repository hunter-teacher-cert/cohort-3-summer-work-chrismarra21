import java.io.*;
import java.util.*;
import static java.lang.Math.*;
public class loops
{
   public static void main(String[] args)
  {
        
      
  }
   public static double squareRoot(double a)
    {
           double oldguess=a/2; 
           double newguess=((oldguess+(a/oldguess))/2);
            
        while((abs(newguess-oldguess))>0.0001)
        {   
            oldguess=newguess;
            newguess=((oldguess+(a/oldguess))/2);
        }
            
        return newguess;
    }
  public static double power(double x,int n) //x^n
    {    double a=1;
           for(int i=1;i<=n;i++)
            {
                a=(a*x);    
            }

        return a;
    }
public static int factorial(int n) 
    {   int a=1;
        for(int i=n;i>0;i--)
        {
            a=(a*i); 
            
        }

        return a;
    }
}
