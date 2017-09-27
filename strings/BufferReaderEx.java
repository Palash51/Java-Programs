import java.io.*;
import java.lang.String;

class BufferReaderEx
{
   public static void main(String args[])throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int t=Integer.parseInt(br.readLine());
       for(int i=0;i<t;i++)
       {
         String str=br.readLine();
         String num[]=br.readLine().split(" ");
         int num1=Integer.parseInt(num[0]);
         int num2=Integer.parseInt(num[1]);
         //rest of your code
       }
    }
}