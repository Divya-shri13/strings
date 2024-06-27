package Inheritance;

public class SingleInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB obj=new ClassB();
		obj.sum();
		obj.sum(100, 200);
		obj.display();
		obj.add();
		obj.add();
		obj.s="HP";
		System.out.println(obj.s);
}
}