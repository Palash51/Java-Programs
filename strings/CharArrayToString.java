import java.lang.String;
import java.util.Scanner;
public class CharArrayToString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char crr[] = new char[n];
        //System.out.println("enter n numbers of characters");
        for(int i=0;i<n;i++)
        {
            char c=sc.next().charAt(0);
            crr[i]= c;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(crr[i]);
        }
    }
}



// {
//     public static void main(String a[])
//     {
//         Scanner sc = new Scanner(System.in);

//         //char ch[]; //= {'M','y',' ','J','a','v','a',' ','e','x','a','m','p','l','e'};
//         for (int i=0;i<4;i++) {
            
//             char ch = sc.next().charAt(0);
//         }
//         String chStr = String.copyValueOf(ch);
//         //System.out.println(chStr);
//         String subStr = String.copyValueOf(ch,8,7);
//         System.out.println(subStr);
//     }
// }