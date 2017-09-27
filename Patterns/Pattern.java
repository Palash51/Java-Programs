import java.util.*;
 
public class Pattern {
    public static void main(String args[]) {
        int rows, i, j;
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows in square pattern");
        rows = in.nextInt();
 
        /* Row iterator for loop */
        for(i = 0; i < rows; i++){
            /* Column iterator for loop */
            for(j = 0; j < rows; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}