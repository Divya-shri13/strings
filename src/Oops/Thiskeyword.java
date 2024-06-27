package Oops;

public class Thiskeyword {
	int a; int b; double c ;
	void sum(int a , int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	System.out.println(a+b);
	}
	Thiskeyword(double c, int a , int b ){ //construct mode ex 
	this.a=a;
		this.b=b;
		this.c=c;
		System.out.println(b+c);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thiskeyword tkw = new Thiskeyword(3.39,5, 6);
tkw.sum(3,4,5) ;
	}

}
