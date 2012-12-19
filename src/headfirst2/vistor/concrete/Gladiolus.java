package headfirst2.vistor.concrete;

import headfirst2.vistor.Flower;
import headfirst2.vistor.Visitor;


public class Gladiolus implements Flower {

	public void speficy() {
		 System.out.println("这是一朵剑南，谁来告诉我剑南春跟我什么关系？");
	}

	public void accept(Visitor v) {
		v.visit(this);
	}
}
