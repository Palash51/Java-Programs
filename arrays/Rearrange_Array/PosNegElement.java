public static void main(String[] args) {

    // Declare variables
    int[] array1 = {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87}, pos, hc;
    int positive = 0, negative = 0;

    // Check how many positive and/or negative numbers
    for (int i : array1)
    {
        if (i >= 0)
        {
            positive++;
        } else 
        {
            negative++;
        }
    }

    // Make exact size arrays
    pos = new int[positive];
    hc = new int[negative];

    // Reset variables for new purpose
    positive = 0;
    negative = 0;

    //Put numbers in correct array
    for (int i : array1)
    {
        if (i >= 0)
        {
            pos[positive] = i;
            positive++;
        } else
        {
            hc[negative] = i;
            negative++;
        }
    }

    // Display arrays
    System.out.print("Starter array: ");
    for (int i: array1)
    {
        System.out.print(" " + i);
    }

    System.out.print("\nPositive array: ");
    for (int i: pos)
    {
        System.out.print(" " + i);
    }

    System.out.print("\nNegative array: ");
    for (int i: hc)
    {
        System.out.print(" " + i);
    }

}


// import java.util.*;
// import java.util.Collections;  
// import java.util.ArrayList;  
// import java.util.List;   
// class PosNegElement
// {
//     public static void main(String[] args)
      
//     {
//       int array1[]= {12, 23, -22, 0, 43, 545, -4, -55, 43, 12, 0, -999, -87};

//        System.out.println("Array 1 :");

//        Arrays.sort(array1);
//        ArrayList<Integer> pos = new ArrayList<Integer>();
//        ArrayList<Integer> neg = new ArrayList<Integer>();
//        for (int num: array1)
//         {
//             if (num>= 0)
//                 pos.add(num);
//             else
//                neg.add(num);
//         }
//       System.out.println();
//       if(pos.size()>0)
//       {
//        int[] positive = new int[pos.size()];
//        positive = pos.toArray(positive);
//        pos=null;
//        for (int num: positive)
//             System.out.println("Positive numbers :" + num+ "\t");
//        }

//        if(neg.size()>0)
//        {
//        int[] negative = new int[neg.size()];   
//        negative = pos.toArray(negative);
//        neg=null;
//        for (int num: negative)
//             System.out.println("Negative numbers :" + num+ "\t");
//        }

//       for (int i = 0; i < array1.length -1; i++) { 
//           if (array1[i + 1 ] == array1[i]) {
//               System.out.println("Duplicate element found :" + array1[i]);
//               i = i + 1;

//               }          

     
//      }
//     }
// }