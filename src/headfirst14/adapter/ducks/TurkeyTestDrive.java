package headfirst14.adapter.ducks;

public class TurkeyTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);
 
		for(int i=0;i<10;i++) {
			try {
				
				Thread.sleep(1000);
			}
			catch (Exception e) {
			}
			System.out.println("The turkey says...");
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}
}
