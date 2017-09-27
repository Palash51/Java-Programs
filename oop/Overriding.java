class Overriding
{
	public static void main(String[] args) {

		B obj = new B();
		B b;
		b = obj;	
		b.show();
		
	}
}

class A
{
	public void show()
	{
		System.out.println("hello");
	}
}
class B extends A
{
	//public void show()
	{
	  // System.out.println("hi");	
	}
}