import java.io.*; // import IO package
import java.lang.String;
public class String
{
   public static void main(String[] args)throws IOException
   {
      String yourname;

      BufferedReader reader;//create BufferedReader object

      reader=new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter your name:");

      yourname=reader.readLine(); 

     System.out.println("Your name is" +yourname);
        }
}







// //import java.util.*;
// import java.io.*;
// //import java.lang.String;
// class String {
// 	public static void main(String args[])
// 	{
// 		//String s;
// 		// Scanner sc = new Scanner(System.in);
// 		// s = sc.nextLine();
// 		// //s = s.replaceAll("[\\-\\+\\.\\^:,]","");
// 		//s = s.replaceAll("[^a-zA-Z0-9]", "");
// 		//System.out.println(s);
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		System.out.print("Enter your name: ");
 
// 		String name = br.readLine();
// 		System.out.println("Your name is: " + name);


// 	}
// }