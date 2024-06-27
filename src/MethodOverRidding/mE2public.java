package MethodOverRidding;

class MethodOverride {
void roi() {
	System.out.println("hello");
}
}
class ICICi extends MethodOverride{
void roi() {
	System.out.println("hii");
}
}
class HDFCc extends MethodOverride {
void roi() {
	System.out.println("bye");
}
}

	public class mE2public {

		public static void main(String[] args) {

			// TODO Auto-generated method stub

			ICICi i = new ICICi();

			i.roi();

			HDFCc s = new HDFCc();

			s.roi();

		}

	}

