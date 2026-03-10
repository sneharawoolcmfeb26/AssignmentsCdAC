//Problem 3: Print Even Numbers (Using while Loop)

public class MethodEven {

    public static void printEvenNumbers() {   //creating method
		int i =1;
		while(i<=50){
			if(i % 2 == 0){
				System.out.print(i+" ");
			}
			i++;
		}
       
    }
	
    public static void main(String[] args) {
		System.out.println("Even numbers between 1 and 50 are:");
		printEvenNumbers();         //call the method
	}
}