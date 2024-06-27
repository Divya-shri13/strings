package operations;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// strings are cases sensitive
      String s = "Java";
      //String s1 ="java";
      
      String S1 = new String("Java"); // it intisases and assignment 
      System.out.println(S1);
      System.out.println(s);
      //System.out.println(s1);
      
       System.out.println(S1.length());// length() bucz its a method 
      // System.out.println(s.concat(S1));
	// concatination --- adding 2 strings
        
        String a = "java";
        String b = "Automation";
        System.out.println(a.concat(b));
        
        String c = "Testing";
         //System.out.println(a" "+b" "+c);
         System.out.println(a.concat(b).concat(c));
       
         String a1 = "    Automatic      ";
         System.out.println(a1.trim());
         System.out.println(a1.trim().length());// for finding legth by removing spaces 
         System.out.println(a1.length());// for length wth spaces 
         
         // CharAt-----
         
         String str = "Selenium";
         System.out.println(str.charAt(7)); //for particular letter i.e  index 
         
         
         // contains --- it returns the boolean values.
         
         String b1 = "Selenium";
       System.out.println( b1.contains("um")); 
        		 
       // equals--- returns boolean values
String b2 = "Divya";
String b3 = "divya";
System.out.println(b2.equals(b3)); //  bucz case sensitive 

//equalIgnore --- it ignores case sensitivity 
System.out.println(b2.equalsIgnoreCase(b3));// true bucz its opp of equals method 

// replace()
String s1 ="selenium";
System.out.println(s1.replace('e','x'));
System.out.println(s1.replace("s","hello welcome to HP land :)"));

// substring() -n to extract substring from main string
    s="welcome";
    //s.substring(s,e)
    System.out.println(s.substring(2,5));
    System.out.println(s.substring(0,6));
    
    // split
    String s2 = "divya@Gmail.COM";
    String arr[]=s2.split("@");
    //String arr[]=s2.split("  "); // (+ - . ? # eg  can't be done)
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    
    s="welcome";
    System.out.println(s.toUpperCase());
    
    // case 1
    String d1="Welcome";
    String d2="Welcome";
    System.out.println(d1=d2);
    

 	}
}
