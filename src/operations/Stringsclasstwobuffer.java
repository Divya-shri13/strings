package operations;

public class Stringsclasstwobuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // immutable
		String name = "Divya";
		name = name + "Sri";   // for adding we use + or concate method 
		System.out.println(name);
		
		//mutable
		StringBuffer sb = new StringBuffer("Divya");
		StringBuffer sb1 = new StringBuffer();	
		sb = new StringBuffer("Divya Sri");
		System.out.println(sb);
		sb = sb.append("Sri");   //for adding  we use append 
		System.out.println(sb);
		
		sb = sb.insert(0,"bannu");  // new word will come and add 
		System.out.println(sb);
		
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		sb.delete(0, 4);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.capacity();
		System.out.println(sb1.capacity());
		// thread it perform task in certain period time
		
		
	}

}
