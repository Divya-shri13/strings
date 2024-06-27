package operations;

public class Stringsclasstwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d1 = "Welcome"; // 
	    String d2 = "welcome"; // address in heap os different so false
	    String d3 = new String("Welcome");
	    System.out.println(d1==d2);// compare obhects 
	    System.out.println(d1.equals(d2)); // values of the objects 
	    System.out.println(d1==d3);
	    System.out.println(d1.equals(d3));
	    //case2
	    String h1 = "harry potter";
	    String h2 = new String ("Harry potter");
	    System.out.println(h1.equals(h2));
	    
	    //case 3 
	    String j1 = "Bannu";
	    String j2 = new String("Bannu");
	    String j3 = j2;
	    System.out.println(j1==j2);
	    System.out.println(j1==j3);
	    System.out.println(j1.equals(j3));
	    
	    		
	}

}
