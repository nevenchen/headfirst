package headfirst2.vistor;

import headfirst2.vistor.concrete.*;
//访问者角色 
public interface Visitor {

	void visit(Gladiolus g);

	void visit(Runuculus r);

	void visit(Chrysanthemum c);
}
