class Inheritance
{
	public static void main(String[] args) {
		
		Addsub obj = new Addsub();
		obj.num1 = 5;
		obj.num2 = 4;
		obj.sum();
		System.out.println(obj.res);
		obj.sub();
		System.out.println(obj.res);
	}
}

class Add
{
	int num1,num2,res=0;
	public void sum()
	{
		res = num1+num2;
	}
}
class Addsub extends Add
{
	public void sub() {

		res = num1 - num2;		
	}
}