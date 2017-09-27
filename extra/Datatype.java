import java.util.Scanner;

class Datatype
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sal;
		double st,it;
		String fname,lname;
		fname = sc.nextLine();
		lname = sc.nextLine();
		// int i= Integer.parseInt(sc.nextLine());
		sal = sc.nextInt();
		System.out.println(fname +" "+ lname +" "+sal+" "+i);

		st = sal*0.15;
		System.out.println(st);
		it = sal*0.035;
		System.out.println("%.2f"+it);
		it = sal*0.035;
		System.out.println(it);


	}
}