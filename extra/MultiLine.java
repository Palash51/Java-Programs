import java.util.Scanner;
class MultiLine
{
	// public static void main(String args[])
	// {
	// 	Scanner sc = new Scanner(System.in);
	// 	String s = "";
	// 	while (sc.hasNext()) {
	// 		String s1 = sc.next();
	// 		if (s1.equals("."))
	// 		{
	// 			break;
	// 		}		
	// 		s = s + s1;	
	// 	}
	// 	System.out.println(s);
	// }

	public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   int i = 0;
   while(scan.hasNext()){
       i++;
       System.out.println(i + " " + scan.nextLine());
   }
}
}