package headfirst11.flyweight.concerete;

import headfirst11.flyweight.Flyweight;

import java.util.Hashtable;

public class FlyweightFactory {

	private Hashtable	flyweights	= new Hashtable(); 

	public FlyweightFactory() {
	}

	public Flyweight getFlyWeight(Object obj) {
		Flyweight flyweight = (Flyweight) flyweights.get(obj); 
		if (flyweight == null) { 
			// 产生新的ConcreteFlyweight
			flyweight = new ConcreteFlyweight( obj);
			flyweights.put(obj, flyweight); 
		}
		return flyweight; 
	}// end GetFlyWeight()

	public int getFlyweightSize() {
		return flyweights.size();
	}
}
