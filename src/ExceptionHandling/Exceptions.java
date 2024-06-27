package ExceptionHandling;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		
//Example1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		 int b = 0;
		 
		 int c;
	/*	 try {
		 c =num/b;
		 }catch(ArithmeticException e) {
			 e.printStackTrace();
			 System.out.println("Print output");
		 }*/
		 
		 try {
			 System.out.println(num/100);
		 }catch(ArithmeticException e) {
				System.out.println("Arith Exception thrown");
		 }
				catch(NullPointerException a){
				System.out.println("Null Exception thrown");
			}
			catch(Exception a) {
				System.out.println("Array Exception thrown"); // when uh have multiple then we can't use exception method only for single we use it 
				//if we want to use use in the last statement 
			}
		 finally {
			 System.out.println("execution is done");
		}
		 System.out.println("execution is successfull");
	}
}