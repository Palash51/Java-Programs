import java.io.*;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String input;
        System.out.println("Enter the input string");
       //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner br = new Scanner(System.in);
        input = br.nextLine();
        char[] try1= input.toCharArray();
        for (int i=try1.length-1;i>=0;i--)
        System.out.print(try1[i]);       
}
}


//http://javahungry.blogspot.com/2014/12/5-ways-to-reverse-string-in-java-with-example.html

// import java.io.*;
// import java.util.*;

// public class ReverseString {
//  public static void main(String[] args) {
//   String input="Alive is Awesome";
//   StringBuilder input1 = new StringBuilder();
//   input1.append(input);
//   input1=input1.reverse(); 
//   for (int i=0;i<input1.length();i++)
//   System.out.print(input1.charAt(i));  
//  }}