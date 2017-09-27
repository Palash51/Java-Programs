import java.util.Scanner;

class NegativePositive
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int neg[] = new int[n];
		int pos[] = new int[n];
		sc.nextLine();
		String  lines = sc.nextLine();
		String[] strs = lines.trim().split("\\s+");
		for (int i = 0; i < strs.length; i++) 
		{
			arr[i] = Integer.parseInt(strs[i]);
		}
		for(int i=0;i<strs.length;i++)
		{
			if(arr[i] < 0)
			{
				// System.out.print(arr[i] + " ");
				neg[i] = arr[i];
			}
			else
			{
				//System.out.println("\n" + arr[i]);
				pos[i] = arr[i];
			}
		}
		for(int i=0;i<neg.length;i++)
		{
			System.out.println(neg[i]);
			//System.out.print("\n");
			//System.out.print(pos[i] + " ");
		}

	}
}