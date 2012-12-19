package headfirst14.adapter.iterenum;

import java.util.*;

public class EI {
	public static void main (String args[]) {
		int[] arrs = new int[10];
		for(int i=0; i<10; i++){
			arrs[i] = i;
		}
		Vector v = new Vector(Arrays.asList(arrs));
		Enumeration enumeration = v.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		Iterator iterator = v.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
