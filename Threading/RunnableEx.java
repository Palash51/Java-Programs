class RunnableEx
{
	public static void main(String[] args) {

		A obj = new A();
		obj.start();

		B obj1 = new B();

		Runnable r = new Runnable() //inner class
		{
			public void run()
			{
			for (int i = 1;i<=5;i++ ) {
			
					System.out.println("Hi");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException ex)
			{
			//Logger.getLogger(B.class.getName()).log(Level.SEVERE,null,ex);
			}
		}
	}
	};

		Thread t = new Thread(r);
		t.start();
		
	}
}

class A extends Thread
{

Runnable r = new Runnable()
		{
			public void run()
			{
			for (int i = 1;i<=5;i++ ) {
			
					System.out.println("Hello");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException ex)
			{
			//Logger.getLogger(B.class.getName()).log(Level.SEVERE,null,ex);
			}
		}
	}
	};

}

// class B implements Runnable
// {

// 	public void show()
// 	{
// 		for (int i = 1;i<=5;i++ ) {
			
// 		System.out.println("Hello");
// 		try
// 		{
// 		Thread.sleep(1000);
// 		}
// 		catch (InterruptedException ex)
// 		{
// 			//Logger.getLogger(B.class.getName()).log(Level.SEVERE,null,ex);
// 		}
// 	}
// 	}
// 	public void run()
// 	{
// 		show();
// 	}

// }