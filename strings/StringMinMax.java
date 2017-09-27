 // import java.io.*;
 // import java.util.*;
 // import java.util.Arrays;

// public class StringMinMax {
//     public static void main(String[] args) {
//         String input="";
//         String spaces = " ";
//         System.out.println("Enter the input string");
//         Scanner br = new Scanner(System.in);
//         input = br.nextLine();
//         int len = input.length();
//         //System.out.println(input +" "+len);

//       	int i=0;

//       	while (i<len)
//       	{
//       		if (input.charAt(i).equals("p")) {
//       			System.out.println("yes");
      			
//       		}
        	
//         }
//       	}

//     }



import java.util.*;
import java.util.Arrays;

public class StringMinMax {
    void shortAndLongWord(String str)
    {
        if (str == null)
            return;
        String sw="",lw="";
        int s=str.length(),l=0;
        String words[]=str.split(" ");
        
        	System.out.println(Arrays.toString(words));
        //for (int i = 0; i < words.length; i++) {
    // You may want to check for a non-word character before blindly
    // performing a replacement
    // It may also be necessary to adjust the character class
    	//		words[i] = words[i].replaceAll("[^\\w]", "");
    			//System.out.println(words[i]);
		//	}




        int count = 0;
        for(String word:words)
        {

        	 for(int i = word.length - 1; i >= 0; i--)
                 {

                    System.out.print(word[i] + " ");

                 }
               //System.out.println(reverse(word));
        		count+=1;
                if(word.length()<s)
                {
                        sw=word;
                        s = word.length();
                }
                if(word.length()>l)
                {
                        lw=word;
                        l = word.length();
                }
                // if(word.equals("this"))
                // {
                // 	System.out.println("yes");
                // }
        }
        System.out.println(count);
        System.out.println("LONGEST WORD : "+lw);
        System.out.println("SHORTEST WORD : "+sw);
    }
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        StringMinMax obj=new StringMinMax();
        System.out.printf("Enter string to get shortest and longest word:");
        String str=scr.nextLine();
        str = str.replaceAll("  ", " ");
        //str+=" ";
        obj.shortAndLongWord(str);
    }
}