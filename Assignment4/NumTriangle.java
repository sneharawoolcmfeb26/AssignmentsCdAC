//Question 19:Write a program to print the following pattern:

class NumTri{
	
	public static void main(String args[]){
		int i, j;
		int n = 5;
		
		for(i=1;i<=n;i++){        //outer loop
			for(j=1;j<=i;j++){    //inner loop
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

//1
//22
//333
//4444
//55555