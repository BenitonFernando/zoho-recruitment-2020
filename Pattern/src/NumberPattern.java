import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//i,j -> loop variable
		//n -> input rows
		//a -> first number 
		
		int n, a=1;
		
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		
		for(int i = 1; i <n ; i++) {
			for(int j = 0; j < n*2-i; j++) {
				
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print(a++);
			}
			System.out.println();
		}
		
	}

}
