package classes;

public class CheckMethods {
	public void show1() {
		System.out.println("Void-Type");
	}
	public String show2() {
		System.out.println("String-Type");
		String str="Kiran";
		return str;
	}
	public int show3() {
		System.out.println("int-Type");
		int a=5;
		int c=a+5;
		return c;
	}
	public char show4() {
		System.out.println("char-Type");
		char a='K';
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckMethods RT = new CheckMethods();
		RT.show1();
		System.out.println(RT.show2());
		System.out.println(RT.show3());
		System.out.println(RT.show4());


	}

}
