//Question 21:Write a program to print the following pattern:

class NumTri2{
	
	public static void main(String args[]){
		int i, j;
		int n = 5;
		
		int num=1;
		for(i=1;i<=n;i++){        //outer loop
			for(j=1;j<=i;j++){    //inner loop
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}