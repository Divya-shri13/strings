package Collections;

import java.util.HashMap;
import java.util.Map;


public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashMap<Interger,string> H1 = new HashMap<Interger,string>();
Map H2 = new HashMap();
 H2.put(6,'a');
 H2.put('f', "Divya");
 H2.put(7,8);
 H2.put(3, "Bannu");
 H2.put("1","2");
 System.out.println(H2);
 H2.remove(6); // key value should give in the bracket 
 System.out.println(H2);
 
 H2.size();
 System.out.println( H2.size());
 H2.keySet();
 System.out.println( H2.keySet());
 H2.values();
 System.out.println( H2.values());
//for (String string : H2) {
//	System.out.println(string);
//}
	H2.clear();
	System.out.println(H2);
}
	}


