import java.util.Scanner;
class Square
{
	public static void main(String args[])
	{
		double a,sq,mul;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		sq = Math.sqrt(a);
		mul = a*a;
		System.out.println(sq);
		System.out.println(mul);


	}
}