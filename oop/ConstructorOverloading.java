class ConstructorOverloading
{
	public static void main(String[] args) {
		
		Abc obj = new Abc();
	}
}
class Abc
{
	public Abc()
	{
		System.out.println("In Abc const");
	}
	public Abc(int i)
	{
		System.out.println("In Abc para");
	}

}