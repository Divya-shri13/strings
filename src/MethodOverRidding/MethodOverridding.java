package MethodOverRidding;


class Bank {
	int roi() {
	return 10;

	}
	}
	class icic extends Bank {
		int roi() {
			return 30;
		}
		}

		class sbi extends Bank {
		int roi() {
			return 40;
		}

		}

		class Hdfc extends Bank {
		int roi(){
			return 50;
		}
		}
public class MethodOverridding {

	
	public static void main(String[] args) {
		
		
		icic ic = new icic();
ic.roi();
System.out.println(ic.roi());

	sbi sb = new sbi();
	sb.roi();
	System.out.println(sb.roi());
	Hdfc hd = new Hdfc ();
	hd.roi();
	System.out.println(hd.roi());
	}
}
	


