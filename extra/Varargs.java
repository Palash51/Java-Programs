class Varargs
{
	public static void main(String args[])
	{

		Display obj = new Display();
		obj.show(4,6,8);
	}
}

class Display
{
	public void show(int ... a)
	{
		for (int i : a ) {

			System.out.println(i);
			
		}
		
	}
}