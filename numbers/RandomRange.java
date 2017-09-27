// import java.util.*;
 
// class RandomNumber {
//   public static void main(String[] args) {
//     int c;
//     Random t = new Random();
 
//     // random integers in [0, 100]
 
//     for (c = 1; c <= 10; c++) {
//       System.out.println(t.nextInt(100));
//     }
//   }
// }



import java.util.Random;

/** Generate random integers in a certain range. */
public final class RandomRange {
  
  public static final void main(String... aArgs){
    log("Generating random integers in the range 1..10.");
    
    int START = 1;
    int END = 10;
    Random random = new Random();
    for (int idx = 1; idx <= 10; ++idx){
      showRandomInteger(START, END, random);
    }
    
    System.out.println("Done.");
  }
  
  private static void showRandomInteger(int aStart, int aEnd, Random aRandom){
    if (aStart > aEnd) {
      throw new IllegalArgumentException("Start cannot exceed End.");
    }
    //get the range, casting to long to avoid overflow problems
    long range = (long)aEnd - (long)aStart + 1;
    // compute a fraction of the range, 0 <= frac < range
    long fraction = (long)(range * aRandom.nextDouble());
    int randomNumber =  (int)(fraction + aStart);    
    log("Generated : " + randomNumber);
  }
  
  private static void log(String aMessage){
    System.out.println(aMessage);
  }
} 