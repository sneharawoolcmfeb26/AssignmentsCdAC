//4)Identify the Values of Uninitialized Variables

class Variables{
	
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		char g;
		boolean h;
	}

class Test {
    public static void main(String[] args) {
		Variables var = new Variables();

        System.out.println("byte a = " + var.a);
        System.out.println("short b = " + var.b);
        System.out.println("int c = " + var.c);
        System.out.println("long d = " + var.d);
        System.out.println("float e = " + var.e);
        System.out.println("double f = " + var.f);
        System.out.println("char g = " + var.g);
        System.out.println("boolean h = " + var.h);
	}
}