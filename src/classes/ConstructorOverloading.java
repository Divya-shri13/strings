package classes;

import Oops.MethodOverloading;

public class ConstructorOverloading {
	int x,y;
	double z;
	
//		
//		 add() {
//			System.out.println("Hii");
//		}
		ConstructorOverloading(int a, int b) {
		x =a;
		y =b;
		System.out.println(a+b);
	}
		ConstructorOverloading(int a , double c) {
		x =a;
		z =c;

	System.out.println(a +" "+c);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			MethodOverloading mvov = new MethodOverloading();
		
			mvov.add(2, 5);
		mvov.add(5,10.5);
	}
	

	
		// TODO Auto-generated method stub
		

	}


