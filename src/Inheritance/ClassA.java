package Inheritance;

import java.security.PublicKey;

public class ClassA {
	int a = 100;
	int b = 200;
	String S = "Bannu";
	
	public void  sum () {
		System.out.println("Hi");
	}

	public void  sum (int a, int b) {
		this.a =a;
		this.b = b;
	}
	
    void display() {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
