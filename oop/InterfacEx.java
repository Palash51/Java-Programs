interface Abc
{
	void show(); //by default public abstract
}

class AbcImp implements Abc
{
	public void show()
	{
		System.out.println("Hello");
	}
}

public class InterfacEx
{
	public static void main(String[] args) {
		Abc obj = new AbcImp();
		obj.show();
	}
}