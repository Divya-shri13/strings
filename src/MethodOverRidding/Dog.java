package MethodOverRidding;

public class Dog extends Animal {
	

String colour ="Black";
void eat1() {
	System.out.println("Eat meat");
}
void display() {
	System.out.println(colour);
	System.out.println(super.colour);

	}

}
