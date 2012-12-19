package headfirst14.adapter.ducks;

public class WildTurkey implements Turkey {
	public void gobble() {
		System.out.println("I am a turkey, gobble...gobble...gobble...");
	}
 
	public void fly() {
		System.out.println("I am a turkey, I'm flying a short distance");
	}
}
