// import java.util.Scanner;

// class Prime
// {
// 	public static void main(String args[])
// 	{
// 		int num,m,flag=0;
// 		Scanner s = new Scanner(System.in);
// 		num = s.nextInt();
// 		m = num /2;

// 		for(int i=2;i<=m;i++)
// 		{
// 			if (num%i==0)
// 			{
// 				System.out.println(+num + "not a pn");
// 				flag = 1;
// 				break;
// 			}
// 		}
// 		if (flag == 0)
// 		{
// 			System.out.println(+num + "a pn");
// 		}
// 	}
// }




import java.util.Scanner;
public class PrimeTest
{
    public static void main(String args[])
    {
         int s1, s2, s3, flag = 0, i, j;
         String new1 = "";
         Scanner s = new Scanner(System.in);
         System.out.println ("Enter the lower limit :"); 
         s1 = s.nextInt();
         System.out.println ("Enter the upper limit :"); 
         s2 = s.nextInt();
         System.out.println ("The prime numbers in between the entered limits are :");
         for(i = s1; i <= s2; i++)
         {
             for( j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
             }
             if(flag == 1)
             {
                 new1 = new1 + i + " ";
             }
         }
         System.out.println(new1);
    }
}














// package com.example.test;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;


// class PrimeTest {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number till which the prime numbers are to be calculated: ");
//         int input = scanner.nextInt();
//         scanner.close();
//         List<Integer> primes = new ArrayList<>();

//         // loop through the numbers one by one
//         for (int i = 2; i < input; i++) {
//             boolean isPrimeNumber = true;

//             // check to see if the number is prime
//             for (int j = 2; j < i; j++) {
//                 if (i % j == 0) {
//                     isPrimeNumber = false;
//                     break; // exit the inner for loop
//                 }
//             }

//             // print the number if prime
//             if (isPrimeNumber) {
//                 primes.add(i);
//             }
//         }
//         String s = primes.toString().replace("[", "").replace("]", "");
//         System.out.println("The number of prime is: " + primes.size() + ", and they are: " + s);
//     }
// }
