// TEAM 11
// BIG IDEA :: When we have a list of data, it would be nice to know at what location an item is 

// FIRSTDRAFT :: just the method declaration
// public int linearSerach(); //no parameters
// MUST-ANSWER-Q :: Q: Ask what parameters should we give this method? A: array or arrayList and int to search for

// STUDENT-PROMPT :: Why did I type INT on line 3? What type of method is this? void vs. int
// MUST-ANSWER-Q :: Q: What does this method need to return? A: an int
public int linearSearch(int value, ArrayList<Integer> data) {

    int foundIndex = -1;

    for (int i=0; i < data.size(); i++) {

      int element = data.get(i);

      if (element == value) {
        foundIndex = i;
        break; //REVISION vX :: change this to a 'return i'. Also a BEEG REVEAL, two return statements!!!!
        }
      }
    // DELIBERATE-ERROR :: compile first time without a return statement, debug the error message. Try returning a string ex: "Found!"
    return foundIndex;
  }

//PROVIDE :: main code with two tests, one that would return an index and one that would return a -1
 public static void main(String[] args){
    //PROVIDE :: this array and tests
    int[] testArray = {1,2,3,4,5};
    System.out.println(linearSearch(2)); // should print 1 STUDENT-PROMPT :: Why 1? shouldn't it print 2?
    System.out.println(linearSearch(10)); // should print -1
  }

/*
PROVIDE :: code snippets or comments you definitely want to provide
STUDENT-PROMPT :: a specifically-worded question you want to ask, or a general solicitation for input, etc
MUST-ANSWER-Q :: a question that must be resolved, that a majority of your class must understand before moving on
BIG IDEA :: an introduction of a new topic, a connection to prior lesson or discussion for application here in code, etc.
BEEG REVEAL :: this is gonna blow yer minds...
DELIBERATE-ERROR :: specific code snippet or a general approach that is a bad fit for the situation, is flat-out wrong, or will lead to a compile- or run-time error, etc.
FIRSTDRAFT :: code that will work for now, but which you intend to replace later
REVISION vX :: better versions of firstdraft code...
*/