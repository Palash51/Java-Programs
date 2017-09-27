import java.util.Scanner;
class Character {
	
	 public static void main(String args[]) {

	 	String s;
	 	String snew = "";
	 	Scanner sc = new Scanner(System.in);
	 	System.out.println("Enter string");
	 	s = sc.nextLine();
	 	// System.out.println(s);
	 	int len = s.length();
	 	for (int i = 0; i< 2; i++ ) {
	 		// System.out.println(s.charAt(i));
	 		snew = snew + s.charAt(i);
	 	}
	 	for (int j=len-2;j<len;j++ ) {
			snew = snew + s.charAt(j);	 		
	 	}
		System.out.println(snew);
	}
}