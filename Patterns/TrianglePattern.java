import java.util.Scanner;

class TrianglePattern
{
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();

		for(i = 0; i < rows; i++){
            
            for(j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

		
	}
}