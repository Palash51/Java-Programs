import java.util.Scanner;

// class Leap
// {
// 	public static void main(String args[])
// 	{
// 		int year;
// 		Scanner s = new Scanner(System.in);
// 		System.out.println("Enter year");
// 		year = s.nextInt();
// 		if (year%4 == 0)
// 			if (year%100 == 0)
// 				if (year%400==0) 
// 					System.out.println(+year + "leap year");				
// 				else
// 					System.out.println("no");
				
// 			else
// 				System.out.println("no");
			
// 		else 
// 			System.out.println("no");
		
// 	}
// }


public class Leap
{
    public static void main(String args[])
    {
 
        int year;
		Scanner s = new Scanner(System.in);
 		System.out.println("Enter year");
 		year = s.nextInt();
        boolean isLeapYear = false;
 
        if(year % 400 == 0)
        {
            isLeapYear = true;
        }
        else if (year % 100 == 0)
        {
            isLeapYear = false;
        }
        else if(year % 4 == 0)
        {
            isLeapYear = true;
        }
        else
        {
            isLeapYear = false;
        }
 
        //Output the test result
        if(isLeapYear)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }
 
    }
}