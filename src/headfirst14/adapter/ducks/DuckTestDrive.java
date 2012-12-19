package headfirst14.adapter.ducks;

public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
 
		WildTurkey turkey = new WildTurkey();
		Duck hypnoticDuck = new TurkeyAdapter(turkey);
   
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
 
		System.out.println("\nThe Duck says...");
		testDuck(duck);
  
		System.out.println("\nThe hypnoticDuck says...");
		testDuck(hypnoticDuck);
	}
 
	static void testDuck(Duck duck) {
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
		}
		duck.quack();
		duck.fly();
	}
}
