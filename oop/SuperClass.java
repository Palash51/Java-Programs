class SuperClass
{
	public static void main(String[] args) {
		
		B obj = new B(5);
		
	}
}

class A
{
	public A()
	{
		System.out.println("In A constructor");	
	}

	public A(int i){
		System.out.println("In A args");
	}
}
class B extends A
{
	public B() {

		System.out.println("In B constructor");
	}

	public B(int i){
		super(i);
		System.out.println("In B args");
	}
}