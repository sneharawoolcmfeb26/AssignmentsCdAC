//Question 15: Write a program to print the following pattern
class StarNum1{
	
	public static void main(String args[]){
		int i, j;
		int n = 5;

		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print(j);
				if(j<i){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}