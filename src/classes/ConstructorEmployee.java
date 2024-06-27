package classes;

public class ConstructorEmployee {
	int Eid;
	String Sname;
	char grade;
	
	void display()
	{
		System.out.println(Eid+" "+Sname+" "+grade);
	}
	
		// TODO Auto-generated method stub
//constructor
		ConstructorEmployee(int id,String name,char g){   // variables should not be used same 
			Eid=id;
			Sname=name;
			grade=g;
		}
		public static void main(String[] args) {
			ConstructorEmployee E1 = new ConstructorEmployee(1,"DivS",'g');
			E1.display();
		}

	}

