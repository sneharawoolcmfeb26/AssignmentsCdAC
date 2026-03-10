//Question 20:Write a program to print the following pattern:

class NumTri1{
	
	public static void main(String args[]){
		int i, j;
		int n = 5;
		
		for(i=1;i<=n;i++){        //outer loop
			for(j=1;j<=i;j++){    //inner loop
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

//1
//12
//123
//1234
//12345
