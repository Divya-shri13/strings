package MethodOverRidding;

public class Animails {
	
	
	
	
	
	
	 
	class Animal{
		String color="White";
		void eat() {
			System.out.println("Eating");
		}
	}
	 
	class Dog extends Animal{
		String color="Black";
		void eat1() {
			System.out.println("Eat meat");
		}
		void display() {
			System.out.println(color);
			System.out.println(super.color);
		}
	}

}
