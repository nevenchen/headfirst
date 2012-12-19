package headfirst14.adapter.iterenum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;


public class EnumerationIteratorTestDrive {
	public static void main (String args[]) {
		int[] arrs = new int[10];
		for(int i=0; i<10; i++){
			arrs[i] = i;
		}
		Vector v = new Vector(Arrays.asList(arrs));
		Iterator iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
