import java.util.Scanner;
import java.lang.String;

class ReverseSentance
{
	public static String rev(String str)
	{

		String split[] = str.split(" ");

		String result = "";
		int n = split.length - 1;
		for(int i = n; i >= 0; i--) {

  		result += (split[i] + " ");
	}
		System.out.println(result.trim());

		return str;
	}

   public static void main(String args[])
   {
      String str;
      Scanner scan = new Scanner(System.in);
	  
      System.out.println("Enter Your String : ");
      str = scan.nextLine();
	  rev(str);
      
   }
}
