import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("one");
    l.add("two");
    l.add("three");
    l.add("four");
    System.out.println(l);
    
    System.out.println(l.get(0));
    System.out.println(l.size());
    l.add(1,"add");
    System.out.println(l);
    
  }
}