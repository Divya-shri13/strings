package classes;

public class MethodsUsingReturnType {
	//non return type
	int id;
	String name;
	void display() {
		System.out.println(id);
		System.out.println(name);
	}
	//return type
	String show() {
		String s = "Automation testing";
		return s;
		
	}
	//return type
	int show1() {
		int a=10;
		int b=20;
		int c=30;
		int d=a+b+c;
		return d;
	}
	//return type
	char show2() {
	char a='A';
			return a; 
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsUsingReturnType MUSRT = new MethodsUsingReturnType();
		MUSRT.id=50;
		MUSRT.name="Divya";
		
		MUSRT.display();
		System.out.println(MUSRT.show());
		System.out.println(MUSRT.show1());
		System.out.println(MUSRT.show2());
				
		}
 
	}


