class Multilevel
{
	public static void main(String[] args) {
		
		Addsubnew obj = new Addsubnew();
		obj.num1 = 5;
		obj.num2 = 4;
		obj.sum();
		System.out.println(obj.res);
		obj.sub();
		System.out.println(obj.res);
		obj.mul();
		System.out.println(obj.res);

	}
}

class Add 							//parent class super class,base class
{
	int num1,num2,res=0;
	public void sum()
	{
		res = num1+num2;
	}
}
class Addsub extends Add 			//single level inheritance
{
	public void sub() {

		res = num1 - num2;		
	}
}

class Addsubnew extends Addsub 		//multilevel inheritance
{
	public void mul()
	{
		res = num1*num2;
	}
}






