// import java.io.*;
// public class Test {

//    public static void main(String args[]) {
//       String Str1 = new String("Welcome to Tutorialspoint.com");
//       String Str2 = new String("Tutorials" );

//       System.out.print("String Length :" );
//       System.out.println(Str1.length());

//       System.out.print("String Length :" );
//       System.out.println(Str2.length());
//    }
// }

import java.util.Scanner;

public class Test
{
   public static void main(String args[])
   {
      String str;
      int len;
      Scanner scan = new Scanner(System.in);
	  
      System.out.print("Enter Your Name : ");
      str = scan.nextLine();
      len = str.length();
	  
      System.out.print("Length of Entered String is " + len);
   }
}