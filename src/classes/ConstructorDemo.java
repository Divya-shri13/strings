package classes;

public class ConstructorDemo {
	int i;
	String s;
	char c;
	ConstructorDemo(){
		i=9;
		s="Bannu";
		c='A';}
		void show() {
			System.out.println(i);
			System.out.println(c);
	System.out.println(s);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd = new ConstructorDemo();
	cd.show();
	}

}
