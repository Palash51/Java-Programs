import java.util.Scanner;
class CharFrequency 
{
	public static void main(String args[])
	{	
		int count=1;
		String str;
		char ex='\0';
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		int len = str.length();
		char[] tempCharArray = new char[len];
		tempCharArray[0] = str.charAt(0)
		for(int i=0;i<len-1;i++)
		{	
			count = 1;
			if (tempCharArray[0] == str.charAt(i+1))
        		//System.out.println("aya");
        		break;
			for(int j=i+1;j<len;j++)
			{
				if (str.charAt(i) == str.charAt(j))
				{
					count = count + 1;
					//System.out.println(str.charAt(j));
				}
								
			}
			if (count>1)
					{
						System.out.println(str.charAt(i)+ " "+count);
						//ex = str.charAt(i);
						tempCharArray[0] = str.charAt(i);
					}
			//String d=String.valueOf(str.charAt(i)).trim();
        	//str=str.replaceAll(d,"");
        	
        	if (tempCharArray[0] == str.charAt(i+1))
        		//System.out.println("aya");
        		break;
        		
		}


		//System.out.println(str.length());
	}
}









// public static void main(String args[]) {
//     char Char;
//     int count;
//     String a = "Hi my name is Rahul";
//     a = a.toLowerCase();
//     for (Char = 'a'; Char <= 'z'; Char++) {
//         count = 0;
//         for (int i = 0; i < a.length(); i++) {
//             if (a.charAt(i) == Char) {
//                 count++;
//             }
//         }
//         System.out.println("Number of occurences of " + Char + " is " + count);
//     }
// }
// }









