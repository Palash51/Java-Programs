import java.util.*;
import java.lang.String;
 
class StringRotation
{
    
    static int findRotations(String str)
    {
        
        String tmp = str + str;
        System.out.println(tmp);
        int n = str.length();
        System.out.println(n);
        for (int i = 1; i <= n; i++)
        {
     
            String sub = tmp.substring(i, str.length());
            System.out.println(sub + " " +i + " " +n);
            if (str == substring)
                return i;
        }
        return n;
    }
 
    // Driver Method
    public static void main(String[] args)
    {
            String str = "aaa";
        System.out.println(findRotations(str));
    }
}