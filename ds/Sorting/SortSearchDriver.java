import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {

/*
	// Uncomment these to test part 1
	
	SortSearch ss = new SortSearch(25);
	System.out.println(ss);
	
		
	// Uncomment these to test part 2

	int i;
	i = ss.findSmallestIndex(0);
	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);

	i = ss.findSmallestIndex(3);
	System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
	
	// Uncomment these to test part 3

	System.out.println(ss);
	ss.sort();
	System.out.println(ss);
	
  // Linear Search
  System.out.println(ss);
  System.out.println("Testing linear Search: ");
  System.out.println(ss);
  System.out.println(ss.linearSearch(15));
  //Binary Search
  System.out.println(ss);
  System.out.println("Testing Binary Search: ");
  System.out.println(ss);
  System.out.println(ss.binarySearch(15));   

	      
*/
  int size = 100;

  SortSearch ss = new SortSearch(size);
	
// 	// printing is really slow so we don't want
// 	// to print when testing time.
// 	// System.out.println(ss);
		
long start,elapsed;

start = System.currentTimeMillis();
ss.sort();

System.out.println(ss);
elapsed = System.currentTimeMillis() - start;
System.out.println("Size: " + size + " Time: " + elapsed);
    }
}

// /*
//public class SortSearchReferenceDriver {
//public static void main(String[] args) {

			   

	      

//     }
// }
// */