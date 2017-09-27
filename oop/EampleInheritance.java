class EampleInheritance
{
	public static void main(String[] args) {
		
		A obj = new B(5);
		
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
		System.out.println("In A args");
	}
}