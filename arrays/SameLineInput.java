import java.util.*;

class SameLineInput
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		int a[] = new int[10];
		//int b[] = new int[10];

		String  lines = sc.nextLine();
		String[] strs = lines.trim().split("\\s+");
		for (int i = 0; i < strs.length; i++) {
			a[i] = Integer.parseInt(strs[i]);
				}
				//System.out.println(lines);

		for(int i=0;i<strs.length;i++)
		{
			if(a[i] %2 == 0)
			{
				System.out.print(a[i] + " ");
			}
			// else
			// {
			// 	System.out.println("\n" + a[i]);
			// }
		}

	}
}