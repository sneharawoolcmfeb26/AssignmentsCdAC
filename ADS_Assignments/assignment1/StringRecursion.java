package com.assignment1;

public class StringRecursion {
	public static String StrRev(String n) {
		if(n == null || n.length() <=1) {
			return n;
		}
		return StrRev(n.substring(1)) + n.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "recursion";
		String result = StrRev(str);
		System.out.println("Reverse String = " + result);
	}
}
