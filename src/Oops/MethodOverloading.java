package Oops;

public class MethodOverloading {
	int x,y;
	double z;
	void add() {
		System.out.println("Hii");
	}
void add(int a, int b) {
	x =a;
	y =b;
	System.out.println(a+b);
}
void add(int a , double c) {
	x =a;
	z =c;

System.out.println(a +" "+c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mvov = new MethodOverloading();
		mvov.add();
		mvov.add(2, 5);
		mvov.add(5,10.5);
		


	}

}
