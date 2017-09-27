// import java.util.Scanner;
// import java.Lang.string;

// class SingleLineInput
// {
// 	public static void main(String[] args) {
	
// 	String  lines = br.readLine();    
// 	String[] strs = lines.trim().split("\\s+");
// 	for (int i = 0; i < strs.length; i++) {

// 		a[i] = Integer.parseInt(strs[i]);
// 		}
// 	}
// }

import java.util.Scanner;

public class SingleLineInput {
public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
System.out.print("Number of integers: ");
int intNumberOfIntegers = scanner.nextInt();

int intStorage[] = new int[intNumberOfIntegers];

System.out.println("Please prompt numbers!");

for(int i = 0;i < intStorage.length;i++) {
intStorage[i] = scanner.nextInt();
}

System.out.println("Your numbers are");

for(int i = 0;i < intStorage.length;i++) {
System.out.print(intStorage[i] + " ");
}
}
}