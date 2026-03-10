//Question 2: Print Multiples of 3 between 1 and N
import java.util.Scanner;

class Multiples{
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the N number: ");
        int num = scanner.nextInt();
		
		for(int i=1;i<=num;i++){
			if(i%3==0){
			System.out.print(i+" ");
			}
		}
	}
}