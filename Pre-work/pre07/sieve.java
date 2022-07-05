import java.io.*;
import java.util.*;
public class sieve
{
   public static void main(String[] args)
  {

  }
  public static boolean[] sieve(int n) 
    {   boolean[] r = new boolean[n];
     
        for (int i=0;i<r.length;i++) 
        {
            r[i]=true;
        }
      
        for (int i=2;i<Math.sqrt(n);i++) 
        {
             if(r[i]==true) 
             {
                for(int j=(i*i);j<n;j=j+i) 
                {
                   r[j]=false;
                }
             }
        }
        return r;
    }
}