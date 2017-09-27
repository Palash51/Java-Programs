import java.util.Scanner;

class Prime
{
	public static void main(String args[])
	{
		int num,m,flag=0;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		m = num /2;

		for(int i=2;i<=m;i++)
		{
			if (num%i==0)
			{
				System.out.println(+num + "not a pn");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.println(+num + "a pn");
		}
	}
}