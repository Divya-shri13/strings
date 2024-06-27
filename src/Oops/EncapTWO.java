package Oops;

public class EncapTWO {
public static void main (String[] args) {
	//datahiding
	Encapusulation encp = new Encapusulation();
	encp.setA(10);
	encp.getA();
	System.out.println(encp.getA());    //1st ex for with flow
	
	encp.setB('d');
	System.out.println(encp.getB());
	
	encp.setB('d');
	System.out.println(encp.getB());
	
	encp.setC("DivS");
	System.out.println(encp.getC());
	
}
}
