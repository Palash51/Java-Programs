import java.util.logging.Level;
import java.util.logging.Logger;


class MultiThreading
{
	public static void main(String[] args) {

		A obj = new A();
		obj.start();

		B obj1 = new B();
		obj1.start();
		
	}
}

class A extends Thread
{

	public void show()
	{
		for (int i = 1;i<=5;i++ ) {
			
		System.out.println("Hi");
		try
		{
		Thread.sleep(1000);
		}
		catch (InterruptedException ex)
		{
			Logger.getLogger(B.class.getName()).log(Level.SEVERE,null,ex);
		}
	}

	}
	public void run()
	{
		show();
	}

}

class B extends Thread
{

	public void show()
	{
		for (int i = 1;i<=5;i++ ) {
			
		System.out.println("Hello");
		try
		{
		Thread.sleep(1000);
		}
		catch (InterruptedException ex)
		{
			Logger.getLogger(B.class.getName()).log(Level.SEVERE,null,ex);
		}
	}
	}
	public void run()
	{
		show();
	}

}