class PostIncDec
{
	public static void main(String args[])
	{
	int x = 20,z;
	// i = ++i + ++i;
	//x = ++x;
	//System.out.println(x);
	// y = --y;
	--x;
	System.out.println(x);
	--x;
	System.out.println(x);
	z = --x - --x;
	System.out.println(z);
}
}