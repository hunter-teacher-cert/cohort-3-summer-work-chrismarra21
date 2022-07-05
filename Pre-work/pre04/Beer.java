import java.io.*;
import java.util.*;
public class Beer
{
   public static void main(String[] args)
   {
       sing(99);
   }
 
   public static void sing(int a)
   {
       if (a > 0)
       {
           oneVerse(a);
          
           sing(a - 1);
       }
       else
       {
           lastVerse();
       }
 
   }
 
   public static void oneVerse(int a)
   {
       System.out.println(a + " bottles of beer on the wall,");
       System.out.println(a + " bottles of beer,");
       System.out.println("ya’ take one down, ya’ pass it around,");
       System.out.println(a + " bottles of beer on the wall.\n");
 
   }
 
   public static void lastVerse()
   {
       System.out.println("99 bottles of beer on the wall,");
       System.out.println("99 bottles of beer,");
       System.out.println("ya’ can't take one down, ya’ can’t pass it around,");
       System.out.println("’cause there are no more bottles of beer on the wall!");
 
   }
 
}
