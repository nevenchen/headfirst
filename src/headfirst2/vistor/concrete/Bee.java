package headfirst2.vistor.concrete;

import headfirst2.vistor.*;
//Add the ability to do "Bee" activities: //另一个具体访问者角色 
public class Bee implements Visitor {

	public void visit(Gladiolus g) {
	    g.speficy();
		System.out.println("我是小蜜蜂，我阅花无数，剑南春是你表哥。");
	}

	public void visit(Runuculus r) {
		r.speficy();
		System.out.println("我是小蜜蜂，我阅花无数，不过我真不知道你是什么花。");
	}

	public void visit(Chrysanthemum c) {
		c.speficy();
		System.out.println("我是小蜜蜂，我阅花无数，蒲公英跟你什么关系我不知道，不过有些哥最爱爆你。");
	}
	
	
}
