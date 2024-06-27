package herirarchiallevel;

public class Parent {
int a;
int b;
String s;
void sum() {
	System.out.println("hello");
}
void sum (int b,String s) {
	this.b=b;
	this.s=s;
	System.out.println(b);
	System.out.println(s);
}
	
}
