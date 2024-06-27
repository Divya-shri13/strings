package classes;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.id=1;
		s1.name="bannu";
		s1.grade='A';
		s1.per = 99.99f;
		
		s1.display();
		
		Student s2 = new Student();
		s2.id= 2;
		s2.name="divya";
		s2.grade='A';
		s2.per = 99.98f;
				
		s2.display();
		

	}

}
