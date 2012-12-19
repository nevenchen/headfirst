package headfirst11.flyweight.concerete;

import headfirst11.flyweight.Flyweight;

public class ConcreteFlyweight extends Flyweight {

	private Object	object;

	public ConcreteFlyweight(Object object) {
		this.object = object;
	}// end ConcreteFlyweight(...)

	public void operation() {
		System.out.println("Concrete---Flyweight : " + object.toString());
	}// end operation()
}
