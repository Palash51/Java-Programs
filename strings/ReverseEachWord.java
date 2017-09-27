import java.util.*;
import java.util.Arrays;

class ReverseEachWord
{
public static String reverseEach(String inputString) {
  String[] parts = inputString.split(" ");
  StringBuilder sb = new StringBuilder();
  for (String p : parts) {
    sb.append(new StringBuffer(p).reverse().toString());
    sb.append(' ');
   }
   return sb.toString();
}

public static void main(String args[])
	{
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		reverseEach(str);
	}
}
