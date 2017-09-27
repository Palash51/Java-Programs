import java.lang.String;
import java.util.Scanner;
public class StrContainsDigit
{
public final boolean containsDigit(String s) {
    boolean containsDigit = false;
    if (s != null && !s.isEmpty()) {
        for (char c : s.toCharArray()) {
            
            if (containsDigit = Character.isDigit(c)) {
                System.out.println(c);
                //break;
            }
        }
    }

    return containsDigit;
}

	public static void main(String[] args) {
		
		StrContainsDigit obj = new StrContainsDigit();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		obj.containsDigit(s1);
	}
}