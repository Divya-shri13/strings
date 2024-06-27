package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList L1 = new ArrayList();
//ArrayList<Integer>L2 = new ArrayList<Integer>();
//ArrayList<String> L3 = new ArrayList<String>();
//List L4 = new ArrayList();
		L1.add(100);
		L1.add("Divya");
		L1.add(100); // for duplicate values
		L1.add('A');
		L1.add(0);
		L1.add(null);
		L1.add(null);
		System.out.println(L1);
		L1.remove(2);
		System.out.println(L1);
		L1.add("Bannu");
		System.out.println(L1);
		L1.add(2, "DivS");
		System.out.println(L1);
		L1.get(2);
		System.out.println(L1);
		System.out.println(L1.get(2));
//		for (Object object : L1) {
//			System.out.println(object);
//
//		}
//		for (Iterator iterator = L1.iterator(); iterator.hasNext();) {
//			Object object = (Object) iterator.next();
//
//		}

		for (int i = 0; i < L1.size(); i++) {

			System.out.println(L1.get(i));
		}
		L1.size();
		System.out.println(L1.size());

	}

}
