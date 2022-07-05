import java.io.*;
import java.util.*;
public class array
{
  
      
  
   public static double[] powArray(double[] a,int n) 
    {    
        double[] b = new double[a.length];
        for (int i=0;i<a.length;i++) 
        {
            b[i] = pow(a[i], 2.0);
        }
        return b;  
    }
    
   public static int[] histogram(int[] scores) 
    {    
        int[] counts = new int[100];
        for (int score : scores) 
        {
            counts[score]++;
        }
        
        return counts[];
    }

}