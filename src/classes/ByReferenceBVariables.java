package classes;

public class ByReferenceBVariables {
	int Eid;
	String Sname;

	void show() {    // show is a name of method  ,void is a return type
		System.out.println(Eid);
		System.out.println(Sname);
		return ;
		
	}
	void setdata(int id , String name) {
		Eid = id;
		Sname = name;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ByReferenceBVariables employee= new ByReferenceBVariables();   //class name  object(any name) = new class name 
		employee.setdata(10, "Divya");
		employee.show();
	}

}
