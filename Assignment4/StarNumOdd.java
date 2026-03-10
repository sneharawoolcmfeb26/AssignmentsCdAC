//Question 17: Wite a program to print the following pattern
class StarNumodd{
	
	public static void main(String args[]){
		int i, j;
		int n = 5;
		
		int odd=1;

		for(i=1;i<=n;i++){
			odd=1;
			for(j=1;j<=i;j++){
				System.out.print(odd);
				if(j<i){
					System.out.print("*");
				}
				odd +=2;
			}
			System.out.println();
		}
	}
}