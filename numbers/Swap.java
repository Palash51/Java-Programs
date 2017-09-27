import java.util.Scanner;
class Swap
{
	public static void main(String args[])
	{
		int x,y,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers");

		x = s.nextInt();
		y = s.nextInt();

		temp = x;
		x = y;
		y = temp;

		System.out.println("After swapping" +x + " " +y);


	}
}