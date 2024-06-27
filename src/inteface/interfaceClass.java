package inteface;



interface Printing{  
	void print();
	 
	}  
	 
	interface Showing{  
	void print1();  
	}  
	 
	 
	public class interfaceClass implements Printing,Showing {
		public void print() {
			System.out.println("Hello");
		}  
	 public void print1() {
		 System.out.println("java");
	 }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Printing obj= new interfaceClass();
			obj.print();
			Showing obj1 = new interfaceClass();
			obj1.print1();
		}
	 
	}
