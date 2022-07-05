import java.io.*;
import java.util.*;

public class Time{
  public static void main(String[] args){
int hour = 12;
int minute = 5;
int seconds = 1;

int a = (hour*3600)+(minute*60)+(seconds);
int b = 86400-a;
double c = (a/86400.0)*100.0;
System.out.println("The number of seconds since midnight: " + a);
System.out.println("The number of seconds remaining in the day " + b);
System.out.println(c + " % of the day has passed");
  }


}