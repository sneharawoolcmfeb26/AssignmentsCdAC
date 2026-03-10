// Access Modifiers

class xyz{
	xyz(){System.out.println("0 Para. constr. of parent");}
	xyz(int a){System.out.println("1 para.constr. of parent");}
}

class AccessM extends xyz{
	int x=10;
	public int x1=10;
	protected int x2=10;
	private int x3=10;
	
	AccessM(){
		//super();
		System.out.println("0 Para. constr");
	}
	
	AccessM(int a){
		//this();
		System.out.println("1 Para. constr");
	}
	
	AccessM(int a, int b){
		System.out.println("2 Para. constr");// have  2 call 2 int in object to run
	}
}

class Access_Demo{
	public static void main(String args[]){
		AccessM amObj = new AccessM(2,3);
		
		System.out.println(amObj.x);
		System.out.println(amObj.x1);
		System.out.println(amObj.x2);
		//System.out.println(amObj.x3);	
	}
}
	
