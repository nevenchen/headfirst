package headfirst2.vistor;

//The Flower hierarchy cannot be changed: //元素角色 
public interface Flower {

	void accept(Visitor v);
	
	void speficy();
}
