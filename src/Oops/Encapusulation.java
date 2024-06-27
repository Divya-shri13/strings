package Oops;

public class Encapusulation {
	// for security we use this , wrapping the  variables & methods into single with combination of datahiding and abstration
// when u get private then use getter and setter method
	private int a;
 private char b;
 private String c;

		public int getA() {
		return a;
	}



	public void setA(int a) {
		this.a = a;
	}



	public char getB() {
		return b;
	}



	public void setB(char b) {
		this.b = b;
	}



	public String getC() {
		return c;
	}



	public void setC(String c) {
		this.c = c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapusulation encp = new Encapusulation();
		encp.setA(5);
		System.out.println(encp.getA());
		
		encp.setB('D');
		System.out.println(encp.getB());
		
		encp.setC("DivS");
		System.out.println(encp.getC());
		
	}

}
