package headfirst2.vistor.concrete;

import headfirst2.vistor.Flower;
import headfirst2.vistor.Visitor;

public class Chrysanthemum implements Flower {

	public void accept(Visitor v) {
		v.visit(this);
	}

	public void speficy() {
		System.out.println("这是一朵菊花，谁来告诉我我跟蒲公英是不是亲戚？");
	}
}
