import java.io.*;
import java.util.Scanner;
import java.lang.String;

public class Split
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String Str;
        for (int i=0;i<n;i++) {
        
            Str = sc.nextLine();    
        }
        
        String tokens[] = Str.split(" ",1);

        for (String val: Str.split("-"))
             System.out.print(val + " ");
            System.out.println("");
    }
}