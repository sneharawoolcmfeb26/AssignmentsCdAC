//Question 27: String Literal and Object Creation

class DuplicateStr{
	
	public static void main(String args[]){
		
	String str1 = "hello";
	String str2 = "hello";
	
	if(str1 == str2){    //== is used to point same object
		System.out.println("Both variables point to the same object: true")
	}
	else{
		System.out.println("Both variables point to the same object: false")

	}
}