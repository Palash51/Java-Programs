class ExceptionEx
{
	public static void main(String[] args) {
		
		int i = 8;
		int j = 0;
		int k = 2;
		int a[] = new int[4];
		try
		{
		//k = i/j;
		for (int c=0;c<4;c++ ) {

			a[c]=c+1;
			
		}
		for (int value : a) {

			System.out.println(value);
			
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//System.out.println(k);
	}
}