//Question 18:Write a program to print the following pattern:

class NumPattern{
	
	public static void main(String args[]){
		int i, j;
		int n = 5;
		
		for(i=1;i<=n;i++){        //outer loop
			for(j=1;j<=n;j++){    //inner loop
				System.out.print(i);   // just changed thisss were we write *
				
			}
			System.out.println();
		}
		
	}
}

//11111
//22222
//33333
//44444
//55555
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//right angled tri...
		/*for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		//Square
		/*for(i=1;i<=n;i++){        //outer loop
			for(j=1;j<=n;j++){    //inner loop
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//reversed
		/*for(i=n;i>=1;i--){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}*/

