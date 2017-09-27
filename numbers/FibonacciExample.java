// class FibonacciExample{  
// public static void main(String args[])  
// {    
//  int n1=0,n2=1,n3,i,count=10;    
//  System.out.print(n1+" "+n2);//printing 0 and 1    
    
//  for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
//  {    
//   n3=n1+n2;    
//   System.out.print(" "+n3);    
//   n1=n2;    
//   n2=n3;    
//  }    
  
// }}


 

import java.util.Scanner;

class FibonacciExample
{ 
 	public static void main(String args[]) 
 		{ 

 			System.out.println("Enter number upto which Fibonacci series to print: ");
 			int number = new Scanner(System.in).nextInt(); 
 			System.out.println("Fibonacci series upto " + number +" numbers : "); 
 			for(int i=1; i<=number; i++)
 				{ 
 					System.out.print(fibonacci(i) +" ");
 		 		}
  		}	 

	public static int fibonacci(int number)
		{
 			if(number == 1 || number == 2)
 			{ 
				return 1; 
			}
 			return fibonacci(number-1) + fibonacci(number -2); 
 		} 

}