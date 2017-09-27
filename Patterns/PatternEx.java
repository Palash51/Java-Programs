import java.io.*;

class PatternEx
{
	public static void main(String args[])throws IOException
	{
		BufferedReader hp=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number and I will print the desired result");
		int a=Integer.parseInt(hp.readLine());
		int k=2*a-1;
		int copy=a;
		int b[][]=new int[k][k];
		int start=0;
		int end=k-1;

int y=0;

for(int l=0;l<copy;l++)

{

for(y=start;y<=end;y++)

{

b[start][y]=a;

}

for(y=start;y<=end;y++)

{

b[y][end]=a;

}

for(y=end;y>=start;y--)

{

b[end][y]=a;

}

for(y=end;y>=start;y--)

{

b[y][start]=a;

}

start++;

end--;

a--;

}

for(int a1=0;a1<k;a1++)

{

for(int b1=0;b1<k;b1++)

{

System.out.print(b[a1][b1]+" ");

}

System.out.println("");

}

}

}