import java.util.Scanner;
import java.lang.String;

class MultipleInput
{
public static void main(String[] args)
  {
    int b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of Strings: ");
    b = sc.nextInt();
    sc.nextLine();
    String s[] = new String[b];
    for (int i=0; i<b; i++) 
      {
        s[i] = sc.nextLine();
      }
     System.out.println("\n"); 
    for (int i=0; i<b; i++) 
      {

        char arr[] = s[i].toCharArray();
        for(char c: arr)
        {
          //System.out.println(c);
          //System.out.println((charAt(s[i])));
          if (c == 'a')
          {
            System.out.println("hw");
          }

      }
    }
  }
}