//7)Find the Largest of Three Numbers

class LargeNumber{
	public static void main(String args[]){
		
		int num1=43, num2=72, num3=23;
		
		if(num1>num2 && num1>num3){
			System.out.println(num1 + " 1st num is Largest"); 
		}
		else if(num2>num1 && num2>num3){
			System.out.println(num2 + " 2nd num is Largest"); 
		}
		else{
		System.out.println(num3 + " 3rd num is Largest"); 
		}
	}
}