import java.util.Scanner;

public class InputType 
{
	public static void main(String args[]) 
	{
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of test case: ");
		int t = sc.nextInt();
		int s[] = new int[3];
		for(int j=0;j<t;j++)

				{
			System.out.println("\nPlease  numbers!");
			for(int i = 0;i < s.length;i++) 
				{
					s[i] = sc.nextInt();
				}

			System.out.println("\nYour numbers are");

			for(int i = 0;i < s.length;i++) 
				{
						System.out.print(s[i] + " ");
				}
				max = s[0];
			for(int k=1;k< s.length;k++)
				{
					if (s[k]>max)
					{
						max = s[k];
					}
				}System.out.print("\n"+max);	
			}
	}
}