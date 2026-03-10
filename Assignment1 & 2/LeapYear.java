//2)Check Leap Year

class LeapYearCheck{
	public static void main(String args[]){
	
	int year = 1900;
	
	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
		System.out.println(year + " is a Leap Year"); 
	}
	else{
		System.out.println(year + " is not a Leap Year"); 
	}
	}
}
