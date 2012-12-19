package headfirst2.vistor.client;

import headfirst2.vistor.Flower;
import headfirst2.vistor.Visitor;
import headfirst2.vistor.concrete.Bee;
import headfirst2.vistor.concrete.FlowerGenerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Class：访问者模式：在不修改已有程序结构的前提下，通过添加额外的“访问者”来完成对已有代码功能的提升。
 * @Description:
 * TODO: 
 *
 * @author: Neven Chen
 * @Date	 8 Nov 2010 10:26:52
 * Revision history:
 *
 * @see 	 
 */
public class BeeAndFlowers {

	/*
	 * 在这里你能看到访问者模式执行的流程： 首先在客户端先获得一个具体的访问者角色 遍历对象结构 对每一个元素调用accept方法，将具体访问者角色传入 这样就完成了整个过程
	 */
	// 对象结构角色在这里才 组装 上
	List	flowers	= new ArrayList();

	public BeeAndFlowers() {
		for (int i = 0; i < 10; i++)
			flowers.add(FlowerGenerator.newFlower());
	}

	Visitor	sval;

	public static void main(String[] args) {
		BeeAndFlowers test = new BeeAndFlowers();
		// It’s almost as if I had a function to produce a Flower string
//		test.sval = new StringVal();
		test.sval = new Bee();
		Iterator it = test.flowers.iterator();
		while (it.hasNext()) {
			((Flower) it.next()).accept(test.sval);
			System.out.println("-----------------");
//			System.out.println(test.sval);
		}
	}
	// representation:
	// //这个地方你可以修改以便使用另外一个具体访问者角色
}
