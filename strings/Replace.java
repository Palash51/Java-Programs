import java.util.Scanner;
import java.lang.String;
class Replace {
	public static void main(String args[])
	{
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		//s = s.replaceAll("[\\-\\+\\.\\^:,]","");
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}
}