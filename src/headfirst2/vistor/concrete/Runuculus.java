package headfirst2.vistor.concrete;

import headfirst2.vistor.Flower;
import headfirst2.vistor.Visitor;

public class Runuculus implements Flower {
	public void speficy() {
		System.out.println("这是一朵？，谁来告诉我我是什么花？");
	}
	public void accept(Visitor v) {
		v.visit(this);
	}
}
