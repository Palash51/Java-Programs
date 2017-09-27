import java.util.Scanner;

class Input
{
	public static void main(String args[])
	{
		int a;
		float b;
		String s;

		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter a string");
		s = inp.nextLine();
		System.out.println("Your string is "+s);

		System.out.println("Enter an Integer");
		a = inp.nextInt();
		System.out.println("Int is "+a);

		System.out.println("Enter a float");
		b = inp.nextFloat();
		System.out.println("float is "+b);


	}
}