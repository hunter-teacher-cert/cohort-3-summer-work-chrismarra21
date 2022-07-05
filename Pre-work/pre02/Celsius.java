import java.io.*;
import java.util.*;
import java.util.Scanner;


public class Celsius {
    public static void main(String[] args){
        double celsius;       
        Scanner c = new Scanner(System.in);

        // prompt the user to enter temperature
        System.out.print("What is the temperature in degrees celsius?");
        celsius = c.nextDouble();

        // convert celsius to farenheit
      
        
      System.out.println("celsius =" + ((celsius*1.8)+32));



      
           }
}