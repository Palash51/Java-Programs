import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		int a,r,n=0,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		a = sc.nextInt();
		temp = a;
		while(temp>0)
		{
			r = temp%10;
			n = n + (r*r*r);
			//System.out.println(n);
			temp = temp/10;
		}
		if (a == n){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}

	}
}