//import java.util.Scanner;

//public class Formatting {

//    public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("================================");
//         for(int i=0;i<3;i++)
//         {
//             String s1=sc.next();
//             int x=sc.nextInt();
//             System.out.printf("%-15s%03d%n", s1, x);
//         }
//         System.out.println("================================");


// }
// }

// import java.util.Scanner;

// class Example
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int[] numbers = new int[4];
//         for(int i = 0; i < 4; ++i) {
//             numbers[i] = sc.nextInt();
//         }
//     }
// }


// import java.io.*;

 import java.util.Scanner;

 class Solution{
//     public static void main(String [] args) {
//         Scanner scan = new Scanner(System.in);
//         int t = scan.nextInt();
//         for (int i = 0; i < t; i++) {
//             int a = scan.nextInt();
//             int b = scan.nextInt();
//             int n = scan.nextInt();
            
//             for (int j = 0; j < n; j++) {
//                 a += b * (int) Math.pow(2, j);
//                 System.out.print(a + " ");
//             }
//             System.out.println();
//         }
//         scan.close();
//     }
// }

public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
    while (in.hasNext()) {
        if (in.hasNextInt())
            System.out.println(in.nextInt());
        else 
            in.next();
    }
}
}