//import java.util.Arrays;
import java.util.Scanner;
class Arr_Sum
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a[] = new int[x];
		for (int i=0;i<a.length;i++ ) {
			
			a[i] = sc.nextInt();
			
		}
		int max = a[0];
		for (int j=1;j<a.length;j++) {
			//System.out.println(a[j]);
			if (a[j] > max)
			{
				max = a[j];
			}
		}
		System.out.println(max);
	}
}