import java.util.Scanner;
class AliceBob
{
	public static void main(String args[])
	{
		int n,alice=0,bob=0,al,bo;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int s[] = new int[n];
		//System.out.println("\nEnter choclate");
			for(int i = 0;i < s.length;i++) 
				{
					s[i] = sc.nextInt();
				}
			al = n/2; //5/2=2 0.1
			bo = n - al; // 4 3 2
			for(int i = 0;i < al;i++) 
				{		
						alice = alice + s[i];
						//System.out.print(s[i] + " ");
				}

			for(int j = n-1;j>=al;j--)  
				{		
						bob = bob + s[j];
						//System.out.print(s[i] + " ");
				}

				System.out.println("Alice "+alice + "\n"+"bob "+bob);
	}
}