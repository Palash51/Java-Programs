import java.lang.String;
impo                rt java.util.Scanner;

public class MaxCharOccurance
{
    static final int MAX_SIZE = 256;
    static char getMaxOccuringChar(String str)
    {
        int count[] = new int[MAX_SIZE];
        int len = str.length();
        for (int i=0; i<len; i++)
        {
            count[str.charAt(i)]++;
            //System.out.println(str.charAt(i) +"" +count[str.charAt(i)]);
        }
      
        int max = 0;  
        char result = ' ';  
      
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
      System.out.println(result + " " +max);
    return result;
    }
     
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        MaxCharOccurance obj = new MaxCharOccurance();
        obj.getMaxOccuringChar(str);
    }
}