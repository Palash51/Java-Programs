import java.util.Scanner;

class Area
{
	public static void main(String[] args) {
		int a,b,c;
		double s,area;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		s = (a+b+c)/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("side" +s  + "\n" + "area" +area);	
	}
}