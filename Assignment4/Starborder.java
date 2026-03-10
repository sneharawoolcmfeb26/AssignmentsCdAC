//Question 15: Write a program to print the following pattern
class StarBorder{
	
	public static void main(String args[]){
		int i, j;
		int n = 5;
		
		for(i=1;i<=n;i++){        //outer loop
			for(j=1;j<=n;j++){    //inner loop
				if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } 
				else {
                    System.out.print(" ");
                }
			}
			System.out.println();
		}
	}
}