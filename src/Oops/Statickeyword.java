package Oops;

public class Statickeyword {
//	int a,b;
//	char c;
//	 void add(int a, int b ) {
//		 
//	 }
	

	 static int a,b;
		static char c,d;
		static String e;
		static void add(int x,int y) {
			 a=x;
			 b=y;
			System.out.println(x+y);
		}
		static void add(char z,char t) {
			c=z;
			d=t;
			System.out.println(z+" "+t);
		}
		public static void main(String[] args) {
			add(5,6);   // we need no to create any object if we use static word 
			add('a','b');   // as we used static we need not to use syso 

	 
		}
	 
	}
