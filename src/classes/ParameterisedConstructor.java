package classes;

public class ParameterisedConstructor {
	int a;
	int b;
	ParameterisedConstructor(int c, int d){
		a=c;
		b=d;
		
	}
	void show() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterisedConstructor Pc = new ParameterisedConstructor(0, 9);
		Pc.show();
		
	}

}
