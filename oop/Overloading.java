class Overloading
{
	public static void main(String[] args) {

		A obj = new A();
		obj.show(5);
		
	}
}

class A
{
	public void show()
	{
		System.out.println("hello");
	}
	public void show(int i)
	{
	   System.out.println(i);	
	}
}