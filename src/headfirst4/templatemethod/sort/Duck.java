package headfirst4.templatemethod.sort;

/**
 * @Class：
 * @Description:
 * TODO: 
 *
 * @author: Neven Chen
 * @Date	 9 Nov 2010 09:53:54
 * Revision history:
 *
 * @see 	 
 */
public class Duck implements Comparable {
	String name;
	int weight;
  
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
 
	public String toString() {
		return name + " weighs " + weight;
	}
 
 
  
	public int compareTo(Object object) {
 
		Duck otherDuck = (Duck)object;
  
		if (this.weight < otherDuck.weight) {
			return -1;
		} else if (this.weight == otherDuck.weight) {
			return 0;
		} else { // this.weight > otherDuck.weight
			return 1;
		}
	}
}
