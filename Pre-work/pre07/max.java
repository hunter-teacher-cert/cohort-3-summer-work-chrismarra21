import java.io.*;
import java.util.*;
public class max
{
   public static void main(String[] args)
  {

  }
    public static int indexOfMax(double[] a) 
    {    int max=0;
        
        for (int i = 0; i < a.length; i++) 
        {
            if(a[i]>=a[max])
                max=i;
        }
        return max;
    }
}