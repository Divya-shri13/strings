package classes;

public class MethodsTypes {
//no return type and no parameter
	

		//no return type and no parameter

		void show() {

			System.out.println("Good Morning");

		}

		//return type and no parameter

		String show1() {

			String s="Ramya";

			return s;

		}

		//parameter and no return type

		void show2(String a) {

			System.out.println("Hello" +a);

		}

		//parameter and return type

		int show4(int a,int b) {

			int c=a+b;

			return c;

		}
	 
		public static void main(String[] args) {

			// TODO Auto-generated method stub

			MethodsTypes s1= new MethodsTypes();

			s1.show();

			System.out.println(s1.show1());

			s1.show2("Java");

			System.out.println(s1.show4(2, 4));

		}
	 
	}

