// program link-- http://stackoverflow.com/questions/13119926/find-duplicate-characters-in-a-string-and-count-the-number-of-occurances-using-j


import java.util.HashMap; import java.util.Scanner;

public class HashMapDemo {

public static void main(String[] args) {
    //Create HashMap object to Store Element as Key and Value 
    HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
    //Enter Your String From Console
    System.out.println("Enter an String:");
    //Create Scanner Class Object From Retrive the element from console to our java application
    Scanner sc = new Scanner(System.in);
    //Store Data in an string format
    String s1=sc.nextLine();
    //find the length of an string and check that hashmap object contain the character or not by using 
    //containskey() if that map object contain element only one than count that value as one or if it contain more than one than increment value 

    for(int i=0;i<s1.length();i++){
        if(!hm.containsKey(s1.charAt(i))){
            hm.put(s1.charAt(i));
        }//if
        else{
            hm.put(s1.charAt(i),(hm.get(s1.charAt(i))+1));
        }//else

    }//for

    System.out.println("The Charecters are:"+hm);
}
}