package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet H1 = new HashSet();
//		HashSet<Inteqer> H2 = new HashSet();
//		HashSet<String> H3 = new HashSet();
	//	Set H4 = new HashSet();
		H1.add(1);
		H1.add("Divya");
		H1.add('D');
		H1.add(100);
		H1.add(100);
		H1.add(null);
		H1.add(null);
		System.out.println(H1);
		H1.remove('D');
		System.out.println(H1);
		System.out.println(H1.size());
		for (Object object : H1) {
			System.out.println(object);
		}
	}
}
